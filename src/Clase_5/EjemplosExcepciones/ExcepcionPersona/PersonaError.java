/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones1.ExcepcionPersona;

/**
 *
 * @author Claudia
 */
public class PersonaError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

                
                /*********Tiempo de ejecucion*///
                try {
		Persona persona = new Persona();
		persona.setEdad(-10);
                    PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
                    persona1.imprimir();
                    PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
                    persona2.imprimir();

 } catch (Exception e) {
		System.out.println(e.getMessage());
	}



        }
    
}
