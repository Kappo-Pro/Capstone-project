package com.capstone.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String emailId;
    private String password;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    List<TaskCategory> taskCategory = new ArrayList<>();
}
