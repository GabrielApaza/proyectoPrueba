package com.example.demo.Entity;

import com.example.demo.Enum.Activo;
import com.example.demo.Enum.Sector;
import com.example.demo.Enum.TipoSocio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

  @Data
    @Entity
        @Table(name="socios")
        @AllArgsConstructor
        @NoArgsConstructor
        public class Socio implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long idSocio;

        @Column(name="nombreSocio", nullable=false, length = 12)
        private String nombreSocio;

        @Column(name="cuit", nullable=false, length = 50)
        private String cuit;

        @Column(name="telefono", nullable=false, length = 13)
        private String telefono;


        @Column(name="email", nullable=true, length = 30, unique=true)
        private String email;

        @Column(name="pagina_web", nullable=true, length = 13)
        private String paginaWeb;

        @Column(name="perfil_socio", nullable=true, length = 20)
        private String perfilSocio;

        @Column(name="fecha_alta")
        @Temporal(TemporalType.DATE)
        private Date fechaAlta;

        @Column(name="fecha_modificacion")
        @Temporal(TemporalType.DATE)
        private Date fechaModificacion;
        @Column(name="fecha_baja")
        @Temporal(TemporalType.DATE)
        private Date fechaBaja;

        @Enumerated(value=EnumType.STRING)
        private TipoSocio tipoSocio;

        @Enumerated(value=EnumType.STRING)
        private Activo activo;

        @Enumerated(value=EnumType.STRING)
        private Sector sector;

        @ManyToOne
        @JoinColumn(name="domicilio")
        Domicilio domicilio;

    }
