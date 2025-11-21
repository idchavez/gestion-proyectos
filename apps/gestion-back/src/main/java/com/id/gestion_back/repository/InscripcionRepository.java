package com.id.gestion_back.repository;

import com.id.gestion_back.domain.Inscripcion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InscripcionRepository extends MongoRepository<Inscripcion, String> {

}
