package com.example.mongodb_tlebreton;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends MongoRepository<Produit, Integer> {
}
