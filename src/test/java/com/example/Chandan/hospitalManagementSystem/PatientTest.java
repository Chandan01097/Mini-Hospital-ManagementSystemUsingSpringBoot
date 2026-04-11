package com.example.Chandan.hospitalManagementSystem;

import com.example.Chandan.hospitalManagementSystem.entity.Patient;
import com.example.Chandan.hospitalManagementSystem.entity.type.bloodGroupType;
import com.example.Chandan.hospitalManagementSystem.repository.PatientRepository;
import com.example.Chandan.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    public PatientRepository patientRepository;
//
//    @Autowired
//    public PatientService patientService;
//
//    @Test
//    public void patientRepository(){
//      List<Patient> pateintList=patientRepository.findAll();
//        System.out.println(pateintList);
//    }
//
//    @Test
//    public void testTransactionMethods(){
//        Patient patient = patientService.getPatientById(1L);
//        System.out.println(patient);
//    }
    @Test
    public void testCustomQuerry(){
//       Patient patient = patientRepository.findByName("Aarav Sharma");
//        System.out.println(patient);
  //      List<Patient> patientList = patientRepository.findByBirthdateOrEmail(LocalDate.of(1992,12,1),"diya.patel@example.com");
 //       List<Patient> patientList = patientRepository.findByBirthdateOrEmail(LocalDate.of(1992,12,1),"diya.patel@example.com");
//       List<Patient> patientList = patientRepository.findByBloodGroup(bloodGroupType.A_POSITIVE);
        List<Patient> patientList = patientRepository.findBornAfterDate(LocalDate.of(1992,12,1));


        for(Patient patient:patientList) {
            System.out.println(patient);
        }
    }
}
