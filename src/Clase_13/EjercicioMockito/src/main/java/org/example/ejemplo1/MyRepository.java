package org.example.ejemplo1;

public class MyRepository {

    public String findById(int id) throws Exception {

        if (id < 0)
            throw new Exception("ID Inválido ");

        return "Datos con  id " + id;
    }
}
