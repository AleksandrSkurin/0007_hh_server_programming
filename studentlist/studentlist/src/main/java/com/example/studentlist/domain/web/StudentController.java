package com.example.studentlist.domain.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.studentlist.domain.Student;

@Controller
public class StudentController {
	private ArrayList<Student> students = new ArrayList<Student>();
//	public List<Student> students = Arrays.asList(student_1, student_2, student_3);
	
	@RequestMapping(value="/hello")
	public String greeting(Model model) {
		students.add(new Student("Uglanov", "Alex"));
		students.add(new Student("Juslin", "Jukka"));
		students.add(new Student("Hinkula", "Juha"));
//		model.addAttribute("students", students.toArray());
		model.addAttribute("students", students);
		return "hello";
	}
}
