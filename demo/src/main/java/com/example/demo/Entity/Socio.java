package com.example.demo.Entity;

import com.example.demo.Enum.Tipo_Socio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

    @Data
    @Entity
        @Table(name="socios")
        public class Socio implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id_socio;

        @Column(name="cuit_empresa", nullable=false, length = 12)
        private String cuit_empresa;

        @Column(name="nombre_empresa", nullable=false, length = 50)
        private String nombre_empresa;

        // ID DOMICIO verificar relacion muchos a uno

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

        //@Enumerated(value=EnumType.STRING)
        //private enum Activo activo;
        // ID SECTOR como codificar relacion muchos a uno
        public Socio() {
        }

        public Socio(Long id_socio, String cuit_empresa, String nombre_empresa, String telefono,
                     String telefono_fax, String email, String pagina_web, String perfil_socio,
                     Date fecha_alta,Date fecha_modificacion, Date fecha_baja, Tipo_Socio tipo_socio)
        {
            this.id_socio = id_socio;
            this.cuit_empresa = cuit_empresa;
            this.nombre_empresa = nombre_empresa;
            this.telefono = telefono;
            this.telefono_fax = telefono_fax;
            this.email = email;
            this.pagina_web = pagina_web;
            this.perfil_socio = perfil_socio;
            this.fecha_alta = fecha_alta;
            this.fecha_modificacion = fecha_modificacion;
            this.fecha_baja = fecha_baja;
            this.tipo_socio = tipo_socio;
        }

        public Socio(String cuit_empresa, String nombre_empresa, String telefono, String telefono_fax,
                     String email, String pagina_web, String perfil_socio, Date fecha_alta,
                     Date fecha_modificacion, Date fecha_baja, Tipo_Socio tipo_socio)
        {
            this.cuit_empresa = cuit_empresa;
            this.nombre_empresa = nombre_empresa;
            this.telefono = telefono;
            this.telefono_fax = telefono_fax;
            this.email = email;
            this.pagina_web = pagina_web;
            this.perfil_socio = perfil_socio;
            this.fecha_alta = fecha_alta;
            this.fecha_modificacion = fecha_modificacion;
            this.fecha_baja = fecha_baja;
            this.tipo_socio = tipo_socio;
        }

        public Long getId_socio() {
            return id_socio;
        }

        public String getCuit_empresa() {
            return cuit_empresa;
        }

        public String getNombre_empresa() {
            return nombre_empresa;
        }

        public String getTelefono() {
            return telefono;
        }

        public String getTelefono_fax() {
            return telefono_fax;
        }

        public String getEmail() {
            return email;
        }

        public String getPagina_web() {
            return pagina_web;
        }

        public String getPerfil_socio() {
            return perfil_socio;
        }

        public Date getFecha_alta() {
            return fecha_alta;
        }

        public Date getFecha_modificacion() {
            return fecha_modificacion;
        }

        public Date getFecha_baja() {
            return fecha_baja;
        }

        public Tipo_Socio getTipo_socio() {
            return tipo_socio;
        }

        public void setId_socio(Long id_socio) {
            this.id_socio = id_socio;
        }

        public void setCuit_empresa(String cuit_empresa) {
            this.cuit_empresa = cuit_empresa;
        }

        public void setNombre_empresa(String nombre_empresa) {
            this.nombre_empresa = nombre_empresa;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public void setTelefono_fax(String telefono_fax) {
            this.telefono_fax = telefono_fax;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPagina_web(String pagina_web) {
            this.pagina_web = pagina_web;
        }

        public void setPerfil_socio(String perfil_socio) {
            this.perfil_socio = perfil_socio;
        }

        public void setFecha_alta(Date fecha_alta) {
            this.fecha_alta = fecha_alta;
        }

        public void setFecha_modificacion(Date fecha_modificacion) {
            this.fecha_modificacion = fecha_modificacion;
        }

        public void setFecha_baja(Date fecha_baja) {
            this.fecha_baja = fecha_baja;
        }

        public void setTipo_socio(Tipo_Socio tipo_socio) {
            this.tipo_socio = tipo_socio;
        }
    }
