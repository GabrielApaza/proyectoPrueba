package com.example.demo.Entity;

import com.example.demo.Enum.Tipo_Socio;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

    @Data
    @Entity
    @NoArgsConstructor
    @Table(name="socios")
    public class Socio implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id_socio;

        @Column(name="cuit_empresa", nullable=false, length = 12)
        private String cuit_empresa;

        @Column(name="nombre_empresa", nullable=false, length = 50)
        private String nombre_empresa;

        // ID DOMICIO

        @Column(name="telefono", nullable=false, length = 13)
        private String telefono;

        @Column(name="telefono_fax", nullable=true, length = 13)
        private String telefono_fax;

        @Column(name="email", nullable=true, length = 30, unique=true)
        private String email;

        @Column(name="pagina web", nullable=true, length = 13)
        private String pagina_web;

        @Column(name="perfil socio", nullable=true, length = 20)
        private String perfil_socio;

        @Column(name="fecha_alta")
        @Temporal(TemporalType.DATE)
        private Date fecha_alta;

        @Column(name="fecha_modificacion")
        @Temporal(TemporalType.DATE)
        private Date fecha_modificacion;
        @Column(name="fecha_baja")
        @Temporal(TemporalType.DATE)
        private Date fecha_baja;

        @Enumerated(value=EnumType.STRING)
        private Tipo_Socio tipo_socio;
        //private enum Activo activo; Verificar activo
        // ID SECTOR

    }
