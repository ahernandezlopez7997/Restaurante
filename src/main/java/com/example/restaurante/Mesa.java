package com.example.restaurante;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate; // Import the LocalDate class

@Entity
@Table(name = "mesa",schema = "Sabores_de_casa", catalog = "postgres")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "num_mesa")
    private Integer num_mesa;

    @Column(name = "capacidad")
    private Integer capacidad;


}
