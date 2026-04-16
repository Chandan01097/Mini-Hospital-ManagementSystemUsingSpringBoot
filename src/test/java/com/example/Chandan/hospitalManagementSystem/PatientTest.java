package com.example.Chandan.hospitalManagementSystem;

import com.example.Chandan.hospitalManagementSystem.dto.bloodGruopResponseEntity;
import com.example.Chandan.hospitalManagementSystem.entity.Patient;
import com.example.Chandan.hospitalManagementSystem.entity.type.bloodGroupType;
import com.example.Chandan.hospitalManagementSystem.repository.PatientRepository;
import com.example.Chandan.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.Arrays;
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
//       List<Patient> patientList = patientRepository.findBornAfterDate(LocalDate.of(1992,12,1));

//       List<Object[]> patientList = patientRepository.countEachBloodGroupType();
//        for(Object[] patient:patientList) {
//            System.out.println(patient[0]+" "+patient[1]);
//        }
//
//        List<Patient> patients = patientRepository.findAllPatient();
//        for(Patient patient:patients) {
//            System.out.println(patient);
//        }

//        int updateName = patientRepository.updateNameWithId("Arav Sharma",1L);
 //       System.out.println(updateName);


//    List<bloodGruopResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//    for (bloodGruopResponseEntity bloodGroupCountResponse:bloodGroupList) {
//       System.out.println(bloodGroupCountResponse);
//
//       }

        Page<Patient> patients = patientRepository.findAllPatient(PageRequest.of(0,2));
        for(Patient patient:patients) {
            System.out.println(patient);
        }

    }
}
