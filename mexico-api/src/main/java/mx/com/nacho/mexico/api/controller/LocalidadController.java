package mx.com.nacho.mexico.api.controller;

import mx.com.nacho.mexico.api.service.LocalidadService;
import mx.com.nacho.mexico.api.domain.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/localidades")
public class LocalidadController {

    private final LocalidadService localidadService;

    @Autowired
    public LocalidadController(LocalidadService localidadService) {
        this.localidadService = localidadService;
    }

    @GetMapping
    public List<Localidad> findAll() {
        return this.localidadService.findAll();
    }

    @GetMapping(value = "/{name}")
    public Localidad findByName(@PathVariable(value = "name") String name) {
        return this.localidadService.findByName(name);

    }
}
