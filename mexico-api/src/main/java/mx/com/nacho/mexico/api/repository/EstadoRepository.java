package mx.com.nacho.mexico.api.repository;

import mx.com.nacho.mexico.api.domain.Estado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends MongoRepository<Estado, Integer> {

    Estado findByNombre(String name);

}
