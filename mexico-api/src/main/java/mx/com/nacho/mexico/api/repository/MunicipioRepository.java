package mx.com.nacho.mexico.api.repository;

import mx.com.nacho.mexico.api.domain.Municipio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends MongoRepository<Municipio, Integer> {

    Municipio findByNombre(String nombre);
}
