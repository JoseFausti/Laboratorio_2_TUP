package org.example.ejemplo2;

import org.example.ejemplo2.entidad.Employee;
import org.example.ejemplo2.repository.EmployeeRepositoryImpl;
import org.example.ejemplo2.service.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeServiceImpl2Test {

    // dependencia @Mock
    EmployeeRepositoryImpl repositoryMock;

    // Clase bajo testing - dependiente (depende de EmployeeRepository) @InjectMocks
    EmployeeServiceImpl service; // SUT - System Under Test

    @BeforeEach
    void setUp() {
        repositoryMock = mock(EmployeeRepositoryImpl.class); // objeto ficticio creado por Mockito
        service = new EmployeeServiceImpl(repositoryMock);
    }

    @Test
    void count() {

        // configuracion escenario
        when(repositoryMock.count()).thenReturn(5);

        // ejecutar el comportamiento a testear
        Integer result = service.count();

        // Aserciones y verificaciones
        assertNotNull(result);
        assertEquals(5, result);
    }

    @Test
    void findAll() {
        // configuracion escenario mock

        // ejecutar el comportamiento a testear

        // Aserciones y verificaciones
    }

    @Test
    void findOne() {
    }

    @Test
    void findOneOptional() {

        // configuracion
        // when(repositoryMock.findOne());
        // comportamiento
        Optional<Employee> employeeOpt = service.findOneOptional(1L);

    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAll() {
    }
}