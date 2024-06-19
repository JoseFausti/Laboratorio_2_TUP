package Ejemplo1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MyServiceTest {

    @Mock
    private MyRepository myRepository;

    @InjectMocks
    private MyService myService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getDataById() throws Exception {

        int id = 1;
        String esperado = "Datos " + id;

        /*when(myRepository.findById(id)).thenReturn(esperado);*/

        String recibido = myRepository.findById(id);

        assertEquals(esperado, recibido);
    }

    /*@Test
    void getDataById2() throws Exception{

        int id = -1;

        when(myRepository.findById(id)).thenThrow(new Exception(("Id invalido")));

        Exception exception = assertThrows(Exception.class, ()-> myService.getDataById(id));

        assertEquals("Id invalido", exception.getMessage());
    }*/
}