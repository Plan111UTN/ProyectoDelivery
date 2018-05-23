package com.plan111.modelo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="personal_entrega")
public class PersonalEntrega extends Persona implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idPersonalEntrega;

  @Column
  private Integer numeroCarnet;

  @Column
  @Temporal(TemporalType.DATE)
  private Date fechaVencimientoCarnet;

  @Column
  private Vehiculo vehiculo;

  @Column
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
