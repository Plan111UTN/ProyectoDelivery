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
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idPersonalEntrega;

  @Column
  private String nombre;

  @Column
  private String apellido;

  @Column
  private Integer telefono;

  @Column
  private Integer numeroCarnet;

  @Column
  @Temporal(TemporalType.DATE)
  private Date fechaVencimientoCarnet;

  @OneToOne
  @JoinColumn(name="vehiculo")
  private Vehiculo vehiculo;

  @OneToOne
  @JoinColumn(name="estado_personal_entrega")
  private EstadoPersonalEntrega estadoPersonalEntrega;
}
