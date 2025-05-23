package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController extends CRUDcontroller<String, Student> {

    Student s1 = new Student("2020ICT01", "Alan", 21, "ICT", 3.9);
    Student s2 = new Student("2020ICT02", "Kane", 27, "ICT", 3.2);
    Student s3 = new Student("2020ICT03 ", "Rayan", 32, "ICT", 2.9);

    public StudentController() {
        getmap().put(s1.getRegNo(), s1);
        getmap().put(s2.getRegNo(), s2);
        getmap().put(s3.getRegNo(), s3);

    }
}