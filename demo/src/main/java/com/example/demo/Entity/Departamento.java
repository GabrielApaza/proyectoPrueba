package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idDepartamento;

    private String nombreDepartamento;

    private String jerarquia;


    @ManyToMany
    @JoinTable(
            name="departamento_usuario",
            JoinColumn = @JoinColumn(name= "id_departamento",referencedColumnName = "idDepartamento"),
            inverseJoinColumns = @JoinColumn(name= "id_usuario", referencedColumnName = "idUsuario")
}
