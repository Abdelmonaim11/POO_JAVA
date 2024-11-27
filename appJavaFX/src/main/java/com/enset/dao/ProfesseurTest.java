package com.enset.dao;


import com.enset.entities.Professeur;

import java.util.List;

public class ProfesseurTest {
    public static void main(String[] args) {
        ProfesseurDaoImpl professeurDao = new ProfesseurDaoImpl();
        List<Professeur> professeurList = professeurDao.findByKeyWord("hd");
        professeurList.forEach(professeur -> {
            System.out.println(professeur.getAdresse());
            System.out.println(professeur.getEmail());
        });
    }



}
