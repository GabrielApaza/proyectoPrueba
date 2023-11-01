package com.example.demo.Entity;

import com.example.demo.Enum.Tipo_Socio;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table
public class Sector {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idSector;

    @Enumerated(value=EnumType.STRING)
    private String nombreSector;

    //como funciona esta relación??? en consultas Preguntar a Ezequiel
    @OneToMany(mappedBy = "sector")
    List<Socio> socioList;

}
