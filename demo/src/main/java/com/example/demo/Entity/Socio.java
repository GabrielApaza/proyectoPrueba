package com.example.demo.Entity;

import com.example.demo.Enum.Activo;
import com.example.demo.Enum.Tipo_Socio;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

    @Data
    @Entity
        @Table(name="socios")
        public class Socio implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long idSocio;

        @Column(name="cuit_empresa", nullable=false, length = 12)
        private String cuit;

        @Column(name="nombre_empresa", nullable=false, length = 50)
        private String nombreSocio;

        @Column(name="telefono", nullable=false, length = 13)
        private List<String> telefonos;
/**
        @Column(name="telefono_fax", nullable=true, length = 13)
        private String telefono_fax;
*/
        @Column(name="email", nullable=true, length = 30, unique=true)
        private String email;

        @Column(name="pagina web", nullable=true, length = 13)
        private String paginaWeb;

        @Column(name="perfil socio", nullable=true, length = 20)
        private String perfilSocio;

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
        private TipoSocio tipoSocio;

        @Enumerated(value=EnumType.STRING)
        private Boolean activo;

        @ManyToOne
        @JoinColumn(name="domicilio")
        Domicilio domicilio;

        @ManyToOne
        @JoinColumn(name="sector")
        Sector sector;
        }

