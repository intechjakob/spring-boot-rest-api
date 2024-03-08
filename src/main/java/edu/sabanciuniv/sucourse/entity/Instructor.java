package edu.sabanciuniv.sucourse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer insId;

    private String insName;

    private String insTitle;

    private String insDepartment;

    private String insEmail;

    @OneToMany(mappedBy = "instructor")
    private Set<Course> courses;
    // Getters and setters (optional with Lombok @Data)
}
