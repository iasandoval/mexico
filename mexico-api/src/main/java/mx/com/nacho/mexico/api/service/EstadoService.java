package mx.com.nacho.mexico.api.service;

import mx.com.nacho.mexico.api.domain.Estado;
import mx.com.nacho.mexico.api.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;

    @Autowired
    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estado> findAll() {
        return this.estadoRepository.findAll();
    }

    public Estado findByName(String name) {
        return this.estadoRepository.findByNombre(name);
    }
}
