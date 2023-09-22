package com.EXAMPLE.userManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
@Entity
public class UserManagment {

    @Id
    private Integer userId;
    @NotBlank
    private String userName;
    @NotNull
    private LocalDate dateOfBirth;
    @Email(message="a valid mail")
    private String mail;
    @Size(min=10,max=10)
    private String phoneNumber;
    private Date date;
    private Time time;
}
