package org.tmed.consultoriosback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.tmed.consultoriosback.model.AlquilerVacancia;
import org.tmed.consultoriosback.model.ContratoDeAlquiler;
import org.tmed.consultoriosback.repository.AlquileresVacanciaRepositorio;
import org.tmed.consultoriosback.repository.ConsultoriosRepositorio;
import org.tmed.consultoriosback.repository.ContratosDeAlquilerRepositorio;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class AlquileresVacanciaController {

    private final AlquileresVacanciaRepositorio alquileresVacanciaRep;
    private final ContratosDeAlquilerRepositorio contratosDeAlquilerRepositorio;
    private final ConsultoriosRepositorio consultoriosRepositorio;

    @Autowired
    public AlquileresVacanciaController(AlquileresVacanciaRepositorio alquileresVacanciaRep,
                                        ContratosDeAlquilerRepositorio contratosDeAlquilerRepositorio,
                                        ConsultoriosRepositorio consultoriosRepositorio) {
        this.alquileresVacanciaRep = alquileresVacanciaRep;
        this.contratosDeAlquilerRepositorio = contratosDeAlquilerRepositorio;
        this.consultoriosRepositorio = consultoriosRepositorio;
    }

    @GetMapping("/vacancias/all")
    public Iterable<AlquilerVacancia> getAllAlquileresVacancias() {
        return alquileresVacanciaRep.findAll();
    }

    @GetMapping("/vacancias")
    public Map<Long, List<AlquilerVacancia>> getAlquileresVacancias(
            @RequestParam(name = "inicio") long inicio,
            @RequestParam(name = "fin") long fin
    ) {
        final Stream<ContratoDeAlquiler> contratosEntreFechas = contratosDeAlquilerRepositorio.getContratosEntreFechas(new Date(inicio), new Date(fin));
        final Map<Long, List<ContratoDeAlquiler>> contratosPorConsultorio = contratosEntreFechas.collect(Collectors.groupingBy(ContratoDeAlquiler::getIdConsultorio));

        final Map<Long, List<AlquilerVacancia>> vacantesPorConsultorio = new HashMap<>();
        contratosPorConsultorio.forEach((idConsultorio, contratosDelConsultorio) -> consultoriosRepositorio.findById(idConsultorio).filter(c -> !c.isOculto()).ifPresent(c -> {
            final List<Long> idsDeContratos = contratosDelConsultorio.stream().map(ContratoDeAlquiler::getId).toList();
            final List<AlquilerVacancia> alquileresDelConsultorio = alquileresVacanciaRep.getAlquileresVacancia(idsDeContratos).toList();
            vacantesPorConsultorio.put(c.getNumeroDeConsultorio(), alquileresDelConsultorio);
        }));
        return vacantesPorConsultorio;
    }

    @GetMapping(value = "/vacancias/{id}")
    public AlquilerVacancia getAlquilerVacancia(@PathVariable("id") long id) {
        return alquileresVacanciaRep.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Id: " + id + " not found."
        ));
    }

    @PostMapping("/vacancias")
    public AlquilerVacancia postAlquilerVacancia(@Validated @RequestBody AlquilerVacancia contrato) {
        return alquileresVacanciaRep.save(contrato);
    }

    @PutMapping(value = "/vacancias")
    public AlquilerVacancia putAlquilerVacancia(@Validated @RequestBody AlquilerVacancia contrato) {
        if (alquileresVacanciaRep.existsById(contrato.getId())) return alquileresVacanciaRep.save(contrato);
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id: " + contrato.getId() + " not found.");
    }

    @DeleteMapping("/vacancias/{id}")
    public void deleteAlquilerVacancia(@PathVariable("id") long id) {
        alquileresVacanciaRep.deleteAlquilerVacancia(id);
    }
}
