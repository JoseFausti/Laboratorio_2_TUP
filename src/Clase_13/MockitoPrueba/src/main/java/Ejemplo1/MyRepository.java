package Ejemplo1;

public class MyRepository {

    public String findById(int id) throws Exception{

        if (id<0)
            throw new Exception("Valor Inválido");
        return "Datos " + id;
    }
}
