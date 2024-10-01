package com.example.restaurante.modelos;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cliente",schema = "restaurante", catalog = "postgres")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Cliente {

    //Con los @ se definen las anotaciones de JPA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "dni", nullable = false)
    private String dni;

}
