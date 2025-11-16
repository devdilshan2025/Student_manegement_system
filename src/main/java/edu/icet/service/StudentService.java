package edu.icet.service;

import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void add(Student student){
        studentRepository.save(new StudentEntity(
                student.getId(),
                student.getName(),
                student.getAddress(),
                student.getEmail(),
                student.getPhone(),
                student.getBirthday()
        ));
    }
}
