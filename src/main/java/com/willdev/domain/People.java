package com.willdev.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "people")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name es obligatorio")
    @NotEmpty(message = "Name no puede estar vacio")
    @Size(min = 4, max = 150, message = "Name debe tener mínimo 04 caracteres")
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @NotNull(message = "LastName es obligatorio")
    @NotEmpty(message = "LastName no puede estar vacio")
    @Size(min = 4, max = 150, message = "LastName debe tener mínimo 04 caracteres")
    @Column(name = "lastname", nullable = false, length = 150)
    private String lastName;
    /*
    @Column(name = "age", nullable = false)
    private int age;
    */
    @NotNull(message = "Gender es obligatorio")
    @NotEmpty(message = "Gender no puede estar vacio")
    @Size(min = 1, max = 1, message = "Gender debe tener solo 01 caracter")
    @Column(name = "gender", nullable = false, length = 1)
    private String gender;

    @NotNull(message = "Email es obligatorio")
    @NotEmpty(message = "Email no puede estar vacio")
    @Size(min = 20, max = 50, message = "Email debe tener mínimo 20 caracteres")
    @Email(message = "Email debe ser un correo válido")
    @Column(name = "email", nullable = false, length = 50)
    private String email;

}
