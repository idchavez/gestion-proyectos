package com.id.gestion_back.repository;

import com.id.gestion_back.domain.Proyecto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProyectoRepository extends MongoRepository<Proyecto, String> {

}
