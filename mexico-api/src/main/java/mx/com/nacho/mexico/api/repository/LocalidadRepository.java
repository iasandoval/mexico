package mx.com.nacho.mexico.api.repository;

import mx.com.nacho.mexico.api.domain.Localidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends MongoRepository<Localidad, Integer> {

    Localidad findByNombre(String name);
}
