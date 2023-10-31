package com.example.demo.Entity;

import com.example.demo.Enum.Tipo_Socio;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@Entity
@Table
public class Sector {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_sector;

   @Enumerated(value=EnumType.STRING)
   private Sector sector;

}
