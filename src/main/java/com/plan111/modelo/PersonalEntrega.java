package com.plan111.modelo;

import java.util.Date;

public class PersonalEntrega extends Persona {
  private Integer numeroCarnet;
  private Date fechaVencimientoCarnet;
  private Vehiculo vehiculo;
  private EstadoPersonalEntrega estado;

  public PersonalEntrega(String nombre, String apellido, Integer dni, Integer telefono) {
    super(nombre, apellido, dni, telefono);
  }

  public void conocerEstadoPersonalEntrega() {
    // code
  }

  public void confirmarEntrega() {
    // code
  }

  public void conocerVehuiculo() {
    // code
  }

  public void entregar() {
    // code
  }

  public void registrarPersonalEntrega() {
    // code
  }

}
