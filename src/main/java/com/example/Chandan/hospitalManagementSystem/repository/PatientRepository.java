package com.example.Chandan.hospitalManagementSystem.repository;
import com.example.Chandan.hospitalManagementSystem.dto.bloodGruopResponseEntity;
import com.example.Chandan.hospitalManagementSystem.entity.Patient;
import com.example.Chandan.hospitalManagementSystem.entity.type.bloodGroupType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

    @Query("SELECT  new com.example.Chandan.hospitalManagementSystem.dto.bloodGruopResponseEntity(p.bloodGroup,count(p)) FROM Patient p GROUP BY p.bloodGroup")
   // List<Object[]> countEachBloodGroupType();
    List<bloodGruopResponseEntity> countEachBloodGroupType ();

    @Query( value = "SELECT * from patient", nativeQuery = true)
    Page<Patient> findAllPatient(Pageable pageable); // Paging

    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET p.name = :name WHERE p.id = :id")
    int updateNameWithId(@Param("name") String name, @Param("id") Long id);

}
