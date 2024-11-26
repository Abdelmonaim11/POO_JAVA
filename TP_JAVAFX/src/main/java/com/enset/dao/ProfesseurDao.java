package com.enset.dao;

import com.enset.entities.Professeur;

import java.util.List;

public interface ProfesseurDao {
    List<Professeur> getAll();
    List<Professeur> findByKeyWord(String keyword);
    Professeur findById(int id);
    void save(Professeur professeur);
    Professeur delete(int id);
    void update(int id);
    void affecterADepartement(int id_prof, int id_depart);
}
