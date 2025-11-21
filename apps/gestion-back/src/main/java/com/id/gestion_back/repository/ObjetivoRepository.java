package com.id.gestion_back.repository;

import com.id.gestion_back.domain.Objetivo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ObjetivoRepository extends MongoRepository<Objetivo, String> {

}
