package mx.com.nacho.mexico.api.controller;

import mx.com.nacho.mexico.api.service.EstadoService;
import mx.com.nacho.mexico.api.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {

    private final EstadoService estadoService;

    @Autowired
    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public List<Estado> findAll() {
        return this.estadoService.findAll();
    }

    @GetMapping(value = "/{name}")
    public Estado findByName(@PathVariable(value = "name") String name) {
        return this.estadoService.findByName(name);

    }
}
