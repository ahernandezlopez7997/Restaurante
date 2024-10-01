package com.example.restaurante.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "plato",schema = "restaurante", catalog = "postgres")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "ingredientes", length = Integer.MAX_VALUE)
    private String ingredientes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_plato", nullable = false)
    private Tipo_plato idTipoPlato;

}
