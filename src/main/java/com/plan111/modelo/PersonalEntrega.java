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
public class PersonalEntrega implements Serializable {
  // TODO relaciones entre las tablas
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

//  public PersonalEntrega(String nombre, String apellido, Integer dni, Integer telefono) {
//    super(nombre, apellido, dni, telefono);
//  }

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

  public Integer getIdPersonalEntrega() {
    return idPersonalEntrega;
  }

  public void setIdPersonalEntrega(Integer idPersonalEntrega) {
    this.idPersonalEntrega = idPersonalEntrega;
  }

  public Integer getNumeroCarnet() {
    return numeroCarnet;
  }

  public void setNumeroCarnet(Integer numeroCarnet) {
    this.numeroCarnet = numeroCarnet;
  }

  public Date getFechaVencimientoCarnet() {
    return fechaVencimientoCarnet;
  }

  public void setFechaVencimientoCarnet(Date fechaVencimientoCarnet) {
    this.fechaVencimientoCarnet = fechaVencimientoCarnet;
  }

  public Vehiculo getVehiculo() {
    return vehiculo;
  }

  public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }

  public EstadoPersonalEntrega getEstado() {
    return estado;
  }

  public void setEstado(EstadoPersonalEntrega estado) {
    this.estado = estado;
  }
}
