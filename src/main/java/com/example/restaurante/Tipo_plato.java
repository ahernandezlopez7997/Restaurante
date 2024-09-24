package com.example.restaurante;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_plato",schema = "Sabores_de_casa", catalog = "postgres")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Tipo_plato {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tipo", nullable = false)
    private Integer tipo;

    @Column(name = "precio")
    private Double precio;

}
