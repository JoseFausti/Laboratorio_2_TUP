package org.example.Ejercicio_1;

import org.example.Ejercicio_1.User;
import org.junit.jupiter.api.*;

public class UserTest {

    User user;

    @BeforeAll
    public static void setup() {
        //Codigo que se ejecuta antes de todas las pruebas
        System.out.println("Ejecutando @BeforeAll - Inicializando recursos compartidos");

    }

    @AfterAll
    public static void cleanup() {
        // Código que se ejecuta despues de todas las pruebas
        System.out.println("Ejecutando @AfterAll - Liberando recursos compartidos");

    }

    @BeforeEach
    void initMetodoTest(){
        this.user = new User("Maxon",18);
    }

    @AfterEach
    void tearDown(){
        System.out.println("Finalizando el metodo");
    }

    @Test
    @DisplayName("La correcta asignación y obtención del nombre")
    void testNameUser(){

        //Test con la obtencion de valores
        String expectedName = "Maxon";
        String realName = user.getName();

        Assertions.assertEquals(expectedName, realName);
        Assertions.assertTrue(realName.equals(expectedName));

        //Test con la reasignacion de valores
        expectedName = "Javier";
        user.setName("Javier");
        realName = user.getName();

        Assertions.assertEquals(expectedName, realName);
        Assertions.assertTrue(realName.equals(expectedName));
    }

    @Test
    @DisplayName("La correcta asignación y obtención de la edad")
    void testAgeUser(){

        //Test con la obtencion de valores
        int expectedAge = 18;
        int realAge = user.getAge();
        Assertions.assertEquals(expectedAge, realAge);

        //Test con la reasignacion de valores
        expectedAge = 20;
        try{
            user.setAge(20);
        }catch (Exception e){}
        realAge = user.getAge();
        Assertions.assertEquals(expectedAge, realAge);
    }

    @Test
    @DisplayName("La excepción al intentar establecer una edad negativa")
    void testNegativeAgeException(){

        //Verificar la excepción al asignar una edad negativa
        Assertions.assertThrows(Exception.class, () -> {
            user.setAge(-19);
        });
    }





}
