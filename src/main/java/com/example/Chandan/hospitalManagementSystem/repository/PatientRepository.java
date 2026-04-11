package com.example.Chandan.hospitalManagementSystem.repository;
import com.example.Chandan.hospitalManagementSystem.entity.Patient;
import com.example.Chandan.hospitalManagementSystem.entity.type.bloodGroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    Patient findByName(String name);
    List<Patient> findByBirthdateOrEmail(LocalDate Birthdate, String email);

    @Query("SELECT p FROM Patient p where p.bloodGroup = ?1 ")
    List<Patient> findByBloodGroup(@Param("bloodGroup") bloodGroupType bloodGroup);

@Query("SELECT p FROM Patient p where p.birthdate > :birthdate")
List<Patient> findBornAfterDate(@Param("birthdate") LocalDate birthdate);
}
