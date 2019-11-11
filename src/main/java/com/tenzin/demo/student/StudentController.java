package com.tenzin.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        UUID.randomUUID(),
                        "tenzin",
                        "sean",
                        "tenzin@gmail.com",
                        Student.Gender.Male),
                new Student(
                        UUID.randomUUID(),
                        "chokrab",
                        "tenzin",
                        "chokrab@gmail.com",
                        Student.Gender.Female)
        );
    }
}
