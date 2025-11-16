package edu.icet.Controller;

import edu.icet.model.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void add(@RequestBody Student student){

        studentService.add(student);
    }

    @GetMapping("/all")
    public List<Student> getAll(){

        return studentService.getAll();
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteById(@PathVariable String id) {

        return studentService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Student student){
        return studentService.update(student);
    }




}
