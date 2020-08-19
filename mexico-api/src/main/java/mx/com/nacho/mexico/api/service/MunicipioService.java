package mx.com.nacho.mexico.api.service;

import mx.com.nacho.mexico.api.domain.Municipio;
import mx.com.nacho.mexico.api.repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService {

    private final MunicipioRepository municipioRepository;

    @Autowired
    public MunicipioService(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    public List<Municipio> findAll() {
        return this.municipioRepository.findAll();
    }

    public Municipio findByName(String name) {
        return this.municipioRepository.findByNombre(name);
    }
}
