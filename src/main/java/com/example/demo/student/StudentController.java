package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import com.example.demo.student.Student;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    private final StudentService studentService ;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }

//get mapping for student controller
    @GetMapping()
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
