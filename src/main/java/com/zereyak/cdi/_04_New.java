package com.zereyak.cdi;

import com.zereyak.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newTuto")
@ApplicationScoped
public class _04_New{

    //produced
    @Produces
    public String producedData(@New StudentDto studentDto){
        studentDto = StudentDto.builder().studentID(0L).studentName("Taha").studentSurname("zereyak").build();

        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private  String InjectData;
}
