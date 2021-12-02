package com.example.mongodb_tlebreton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping("produits")
    public List<Produit> getProduits() {
        return produitRepository.findAll();
    }

    @PostMapping("produit")
    public void postProduit(@RequestBody Produit produit) {
        produitRepository.insert(produit);
    }
}
