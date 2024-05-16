package org.example.main;

import org.example.Entidades.Cliente;
import org.example.Entidades.Domicilio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceApp {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            /*
            Cliente cliente = new Cliente("Jose","Fausti",43417393);
            Domicilio domicilio = new Domicilio("Callejon Fernandez",947);
            cliente.setDomicilio(domicilio);
            domicilio.setCliente(cliente);

            entityManager.persist(cliente); // Volvemos a la instancia persistente
             */

            Domicilio domicilio = entityManager.find(Domicilio.class,1L);
            Cliente cliente = entityManager.find(Cliente.class,1L);

            System.out.println("Cliente del domicilio: " + domicilio.getCliente().getDni());
            System.out.println("Domicilio del cliente: " + cliente.getDomicilio().getNombreCalle());

            entityManager.flush(); // Sirve para limpiar nuestra conexion

            entityManager.getTransaction().commit(); // Lo guardamos en la base de datos definitivamente

        }catch (Exception e){
            entityManager.getTransaction().rollback(); // Evitamos que se produzca un error en la base de datos volviendo un paso atras la transaccion
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
