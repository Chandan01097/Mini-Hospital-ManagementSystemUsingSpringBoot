package com.example.Chandan.hospitalManagementSystem.dto;

import com.example.Chandan.hospitalManagementSystem.entity.type.bloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class bloodGruopResponseEntity {
 private bloodGroupType bloodGroupType;
 private Long count;
}
