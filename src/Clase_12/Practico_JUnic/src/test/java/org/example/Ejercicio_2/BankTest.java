package org.example.Ejercicio_2;

import org.example.Ejercicio_1.User;
import org.junit.jupiter.api.*;

public class BankTest {

    Bank bank;
    @BeforeEach
    void initMetodoTest(){
        this.bank = new Bank();
        bank.addAccount("121212",500);
        bank.addAccount("111111",200);
        bank.addAccount("555555",1000);
        bank.addAccount("545454",100);
    }

    @AfterEach
    void tearDown(){
        System.out.println("Finalizando el metodo");
    }

    @Test
    @DisplayName("consulta de saldo y la excepcion para cuentas inexistentes")
    void testBalance(){

        //Testeamos la obtencion de saldo con un numero de cuenta
        double expectedBalance = 500;
        double realBalance = -1;
        try{
            realBalance = bank.checkBalance("121212");
        }catch (Exception e){}

        Assertions.assertEquals(expectedBalance, realBalance);

        //Verificar la excepción al asignar un numero de cuenta erroneo
        Assertions.assertThrows(Exception.class, () -> {
            bank.checkBalance("123456");
        });
    }

    @Test
    @DisplayName("deposito de saldo y la excepci0n para valores negativos")
    void testDepositBalance(){

        //Testeamos los depositos con un numero de cuenta
        double expectedBalance = 1200;
        double realBalance = -1;
        try{
            bank.deposit("555555",200);
        }catch (Exception e){}
        try{
            realBalance = bank.checkBalance("555555");
        }catch (Exception e){}

        Assertions.assertEquals(expectedBalance, realBalance);

        //Verificar la excepción al asignar un deposito negativo
        Assertions.assertThrows(Exception.class, () -> {
            bank.deposit("555555",-100);
        });
    }

    @Test
    @DisplayName("extraccion de saldo y la excepción para saldos insuficientes")
    void testExtractBalance(){

        //Testeamos las extracciones con un numero de cuenta
        double expectedBalance = 100;
        double realBalance = -1;
        try{
            bank.extract("111111",100);
        }catch (Exception e){}
        try{
            realBalance = bank.checkBalance("111111");
        }catch (Exception e){}

        Assertions.assertEquals(expectedBalance, realBalance);

        //Verificar la excepción al asignar un deposito negativo
        Assertions.assertThrows(Exception.class, () -> {
            bank.extract("111111",-100);
        });

        //Verificar la excepción al tener fondos insuficientes
        Assertions.assertThrows(Exception.class, () -> {
            bank.extract("111111",500);
        });

    }



}
