package mx.com.nacho.mexico.api.service;

import mx.com.nacho.mexico.api.domain.Localidad;
import mx.com.nacho.mexico.api.repository.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadService {

    private final LocalidadRepository localidadRepository;

    @Autowired
    public LocalidadService(LocalidadRepository localidadRepository) {
        this.localidadRepository = localidadRepository;
    }

    public List<Localidad> findAll() {
        return this.localidadRepository.findAll();
    }

    public Localidad findByName(String name) {
        return this.localidadRepository.findByNombre(name);
    }
}
