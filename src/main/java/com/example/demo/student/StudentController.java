package com.example.demo.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import com.example.demo.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
//get mapping for student controller
    @GetMapping()
	public List<Student> getStudents() {
		return List.of(
			new Student(
				1L,
				"Mehdi",
				"Mehdi@gmail.com",
				LocalDate.of(2000, Month.FEBRUARY, 5),
				21
			)
		);
	}
}
