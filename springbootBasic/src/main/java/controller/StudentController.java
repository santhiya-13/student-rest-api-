package controller;


import org.springframework.web.bind.annotation.*;

import model.Studentrequest;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // In-memory storage
    private List<Studentrequest> studentList = new ArrayList<>();

    // 1. Add new student
    @PostMapping
    public String addStudent(@RequestBody Studentrequest student) {
        studentList.add(student);
        return "Student added successfully";
    }

    // 2. View all students
    @GetMapping
    public List<Studentrequest> getAllStudents() {
        return studentList;
    }

    // 3. Get student by ID
    @GetMapping("/{id}")
    public Object getStudentById(@PathVariable int id) {
        for (Studentrequest student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return "Student not found";
    }

    // 4. Update student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Studentrequest updatedStudent) {
        for (Studentrequest student : studentList) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setCourse(updatedStudent.getCourse());
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }

    // 5. Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        for (Studentrequest student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                return "Student deleted successfully";
            }
        }
        return "Student not found";
    }
}




