package com.enset.dao;


import com.enset.entities.Departement;

import java.util.List;

public interface DepartementDao {
    void save(Departement departement);
    List<Departement> findAll();
    Departement findById (int id);
    void delete(int id);
    void update(Departement departement);

}
