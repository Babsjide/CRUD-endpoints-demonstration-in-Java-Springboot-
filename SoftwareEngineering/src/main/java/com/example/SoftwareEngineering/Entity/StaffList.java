package com.example.SoftwareEngineering.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffList {
    @Id
    private String id;
    private String name;
    private String role;
    private String grade;
    private String gender;

}
