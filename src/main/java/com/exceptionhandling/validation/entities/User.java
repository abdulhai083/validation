package com.exceptionhandling.validation.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user_table")
@Builder
public class User {
    @Id
    @GeneratedValue // for auto-generating user id
    private int userId;

    private String name;
    private String mobile;
    private String email;
    private String gender;
    private String age;
    private String nationality;
}
