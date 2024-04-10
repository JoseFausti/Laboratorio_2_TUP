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
public class Persona {
    private int edad;

	public int getEdad() {
		return this.edad;
	}

public void setEdad(int edad) throws Exception {
	if (edad <= 0)
		throw new Exception("La edad debe ser positiva.");
	this.edad = edad;
}
    
}
