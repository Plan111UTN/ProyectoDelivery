package com.plan111.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Guido
 */

@Entity
@Table(name = "vehiculo")
@Setter @Getter @NoArgsConstructor
public class Vehiculo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idVehiculo;

  @Column
  private String patente;

  @Column
  private String modelo;

  @Column
  private String marca;

  @OneToOne
  @JoinColumn(name="tipo_vehiculo")
  private TipoVehiculo tipoVehiculo;
}
