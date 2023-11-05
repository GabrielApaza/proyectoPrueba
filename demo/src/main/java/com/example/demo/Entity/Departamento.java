package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idDepartamento;
    private String nombreDepartamento;
    private String jerarquia;

    @ManyToMany(fetch=FetchType.EAGER,cascade= CascadeType.MERGE)
   @JoinTable(
            name="departamento_usuario", joinColumns = @JoinColumn(name = "id_departamento", referencedColumnName = "idDepartamento"),
            inverseJoinColumns = @JoinColumn(name = "id_usuario",referencedColumnName = "idUsuario"))
    private List<Usuario> usuarios ;

    @JoinTable(
            name="departamento_cargo", joinColumns = @JoinColumn(name = "id_departamento", referencedColumnName = "idDepartamento"),
            inverseJoinColumns = @JoinColumn(name = "id_cargo",referencedColumnName = "idCargo"))
    private List<Cargo> cargos;


}
