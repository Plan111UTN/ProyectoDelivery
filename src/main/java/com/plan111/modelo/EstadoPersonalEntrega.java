package com.plan111.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estado_personal_entrega")
@Getter @Setter @NoArgsConstructor
public class EstadoPersonalEntrega implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idEstadoPersonalEntrega;

  @Column(name = "nombre")
  private  String nombre;

  @Column(name = "descripcion")
  private  String descripcion;
}
