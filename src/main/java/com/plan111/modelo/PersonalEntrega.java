package com.plan111.modelo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="personal_entrega")
public class PersonalEntrega implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idPersonalEntrega; 
  
  @Column(insertable = true,length = 25,nullable = false,unique = false,updatable = true,name = "nombre")
  private String nombre;

  @Column
  private String apellido;
  
  @Column
  private String dni;
  
  @Column
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaNacimiento;
  
  @Column
  private Integer telefono;

  @Column
  private Integer numeroCarnet;

  @Column
  @Temporal(TemporalType.DATE)
  private Date fechaVencimientoCarnet;

  @OneToMany
  @JoinColumn(name="vehiculo")
  private List<Vehiculo> vehiculo ;

  @OneToOne
  @JoinColumn(name="estado_personal_entrega")
  private EstadoPersonalEntrega estadoPersonalEntrega;
}
