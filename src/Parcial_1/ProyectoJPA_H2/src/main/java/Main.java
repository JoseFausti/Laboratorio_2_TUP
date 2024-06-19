import entities.*;
import entities.enums.Rol;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            // Persistir entidades
            entityManager.getTransaction().begin();

            // Imagen Articulo
            ImagenArticulo imagenArticulo = new ImagenArticulo();
            imagenArticulo.setDenominacion("imgArticulo");

            // Unidad Medida
            UnidadMedida unidadMedida = new UnidadMedida();
            unidadMedida.setDenominacion("unidad_medida");

            // Articulo
            Articulo articulo = new Articulo("Tecnologia", 128.99, imagenArticulo, unidadMedida);

            // Crear y agregar Pedidos
            Set<Pedido> pedidos = new HashSet<>();
            pedidos.add(new Pedido());

            // Cliente
            Cliente clienteJose = new Cliente("Jose", "Fausti", "2634592686", "joseemilianofausti@gmail.com", LocalDate.parse("2001-03-19"), Rol.CLIENTE, pedidos, new ImagenCliente(), new UsuarioCliente());

            // Usuario Cliente
            UsuarioCliente usuarioCliente = new UsuarioCliente();
            usuarioCliente.setCliente(clienteJose);

            // Persistir las entidades
            entityManager.persist(imagenArticulo);
            entityManager.persist(unidadMedida);
            entityManager.persist(articulo);
            entityManager.persist(clienteJose);
            entityManager.persist(usuarioCliente);

            entityManager.getTransaction().commit();

            // Consultar y mostrar la entidad persistida
            ImagenArticulo retrievedImagen = entityManager.find(ImagenArticulo.class, imagenArticulo.getId());
            System.out.println("Retrieved Imagen: " + retrievedImagen.getDenominacion());

        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                try {
                    entityManager.getTransaction().rollback();
                } catch (Exception rollbackException) {
                    System.err.println("Error during transaction rollback: " + rollbackException);
                }
            }
            e.printStackTrace();
            System.out.println("No se pudo grabar la clase");
        } finally {
            // Cerrar el EntityManager y el EntityManagerFactory
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
