package com.example.mongodb_tlebreton;

public class Produit {

    private String id;
    private String designation;
    private int prix;

    public Produit(String id, String designation, int prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
