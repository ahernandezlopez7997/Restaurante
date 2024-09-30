package com.example.restaurante.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mesa",schema = "restaurante", catalog = "postgres")
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
