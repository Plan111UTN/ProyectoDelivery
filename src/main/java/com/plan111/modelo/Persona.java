package com.plan111.modelo;

import java.util.Date;

/**
 * @author Guido
 */

public class Persona {
  private String nombre;
  private String apellido;
  private Integer dni;
  private Date fechaNacimiento;
  private Integer telefono;

  public Persona(String nombre, String apellido, Integer dni, Integer telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.telefono = telefono;
  }
}
