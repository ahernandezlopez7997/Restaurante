package com.example.restaurante;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate; // Import the LocalDate class

@Entity
@Table(name = "clientes",schema = "Sabores_de_casa", catalog = "postgres")
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

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "dni", nullable = false)
    private String dni;

}
