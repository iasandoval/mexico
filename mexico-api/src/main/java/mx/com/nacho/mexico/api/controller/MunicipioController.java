package mx.com.nacho.mexico.api.controller;

import mx.com.nacho.mexico.api.service.MunicipioService;
import mx.com.nacho.mexico.api.domain.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/municipios")
public class MunicipioController {

    private final MunicipioService municipioService;

    @Autowired
    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }

    @GetMapping
    public List<Municipio> findAll() {
        return this.municipioService.findAll();
    }

    @GetMapping(value = "/{name}")
    public Municipio findByName(@PathVariable(value = "name") String name) {
        return this.municipioService.findByName(name);
    }
}
