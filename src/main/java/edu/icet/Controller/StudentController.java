package edu.icet.Controller;

import edu.icet.model.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void add(@RequestBody Student student){

        studentService.add(student);
    }


}
