package com.zereyak;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//DTO = data transfer object
public class StudentDto {
    private Long studentID;
    private String studentName;
    private String studentSurname;
}
