package com.example.restaurante.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_plato",schema = "restaurante", catalog = "postgres")
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
    private String tipo;

    @Column(name = "precio")
    private Double precio;

}
