package com.example.Chandan.hospitalManagementSystem.entity;
import com.example.Chandan.hospitalManagementSystem.entity.type.bloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@ToString
@Entity
@Getter
@Setter
@Table(
        name = "patient",
        uniqueConstraints = {
                @UniqueConstraint(name = "patient_email", columnNames = {"email"}),
                @UniqueConstraint(name = "Patient_name_with_Birthdate", columnNames = {"name", "birth_date"})
        },
        indexes = {
                @Index(name = "Patient_Birthdate", columnList = "birth_date")
        }
)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 40)
    private String name;

    @ToString.Exclude
    private String gender;

    @Column(nullable = false)
    private String email;

    @Column(name = "birth_date")
    private LocalDate birthdate;

    @Column(name = "blood_group")
    @Enumerated(EnumType.STRING)
    private bloodGroupType bloodGroup;

}
