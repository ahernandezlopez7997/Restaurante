package com.example.restaurante;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate; // Import the LocalDate class

@Entity
@Table(name = "bebida",schema = "restaurante", catalog = "postgres")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Double precio;

}
