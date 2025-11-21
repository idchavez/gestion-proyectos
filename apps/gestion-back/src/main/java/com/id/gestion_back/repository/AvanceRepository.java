package com.id.gestion_back.repository;

import com.id.gestion_back.domain.Avance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvanceRepository extends MongoRepository<Avance, String> {

}
