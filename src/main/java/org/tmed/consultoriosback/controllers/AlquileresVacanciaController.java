package org.tmed.consultoriosback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.tmed.consultoriosback.model.AlquilerVacancia;
import org.tmed.consultoriosback.model.componentesJson.CoordenadaDeMatriz;
import org.tmed.consultoriosback.repository.AlquileresVacanciaRepositorio;

import java.sql.Date;

@RestController
public class AlquileresVacanciaController {

    private final AlquileresVacanciaRepositorio alquileresVacanciaRep;

    @Autowired
    public AlquileresVacanciaController(AlquileresVacanciaRepositorio alquileresVacanciaRep) {
        this.alquileresVacanciaRep = alquileresVacanciaRep;
    }

    @GetMapping("/vacancias/all")
    public Iterable<AlquilerVacancia> getAllAlquileresVacancias() {
        return alquileresVacanciaRep.findAll();
    }

    @GetMapping("/vacancias")
    public Iterable<CoordenadaDeMatriz> getAlquileresVacancias(
            @RequestParam(name = "inicio") String inicio,
            @RequestParam(name = "fin") String fin
    ) {
        return alquileresVacanciaRep.getAlquileresVacanciaParaMatriz(Date.valueOf(inicio), Date.valueOf(fin));
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
