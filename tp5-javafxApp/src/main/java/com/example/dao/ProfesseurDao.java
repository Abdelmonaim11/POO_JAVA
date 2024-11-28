package com.example.dao;



import com.example.entities.Professeur;

import java.util.List;

public interface ProfesseurDao{
    List<Professeur> getAll();
    List<Professeur> findByKeyWord(String keyword);
    Professeur findById(int id);
    void save(Professeur professeur);
    void delete(int id);
    void update(Professeur professeur);
    void affecterADepartement(int id_prof, int id_depart);
}
