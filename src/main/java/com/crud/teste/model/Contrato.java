package com.crud.teste.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="TB_CONTRATO")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String serie;
    private String comentario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inquilino_id")
    private Inquilino inquilino;

}
