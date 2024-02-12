package org.iesvdm.tarea1_1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Socio {

    @Id
    private Long DNI;
    private String Nombre;
    private String Apellidos;
    @OneToOne
    private Tarjeta tarjeta;

}
