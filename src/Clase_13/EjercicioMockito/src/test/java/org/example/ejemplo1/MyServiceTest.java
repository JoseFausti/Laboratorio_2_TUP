package org.example.ejemplo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MyServiceTest {

    //indica que myRepository será un mock,
    // es decir, una versión simulada del repositorio real que MyService utiliza
    @Mock
    private MyRepository myRepository;


    //ndica que myService es una instancia de MyService y que Mockito inyectará
    // automáticamente el mock myRepository en myService.
    @InjectMocks
    private MyService myService;

    //Configuración Antes de Cada Prueba
    // Asignamos valores iniciales a variables antes de la ejecución de cada te

    @BeforeEach //Indica que el método setUp se ejecutará antes de cada método de prueba.
    void setUp() {

        // prepara los objetos mock para su uso.
        MockitoAnnotations.openMocks(this); // Activamos mockito
    }

    @Test
    void getDataById() throws Exception {

        int id=1;

        String esperado="Datos con  id " + id;


    //Configura el mock para que cuando se llame a findById con el id 1,
    // devuelva la cadena esperado.
        when(myRepository.findById(id)).thenReturn(esperado);

        String recibido = myRepository.findById(id);

        Assertions.assertEquals(esperado,recibido);

    }

    @Test
    void testGetDataByIdThrowsException() throws Exception{

        int id = -1;

        // Configura el mock para que cuando se llame a findById con el id -1,
        // lance una excepción con el mensaje "Id inválido".
        when (myRepository.findById(id)).thenThrow(new Exception("Id inválido"));

        //Verifica que se lance una excepción cuando se llame a getDataById con el id -1.
        Exception exception = assertThrows(Exception.class, () -> {
            myService.getDataById(id);
        });

        assertEquals("Id inválido", exception.getMessage());

    }
}