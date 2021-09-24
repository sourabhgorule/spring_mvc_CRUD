package com.studentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentApp.bean.StudentInfo;
import com.studentApp.dao.StudentDao;

@Controller
public class AppController {

	@Autowired
	private StudentDao dao;

	@RequestMapping({ "/", "/index" })
	public String indexPage() {
		return "index";

	}

	@RequestMapping("/view")
	public String viewStudents(ModelMap modelMap) {

		List<StudentInfo> students = dao.viewStudents();

		modelMap.addAttribute("studentList", students);

		return "view-students";

	}

	@RequestMapping("/addstudent")
	public String addstudentPage(Model model) {

		model.addAttribute("command", new StudentInfo());

		return "addstudent";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("students") StudentInfo students) {

		dao.saveStudent(students);

		return "redirect:/view";

	}
	
	@RequestMapping("/edit")
	public String editStudent(Model model,@RequestParam int rollnumber) {
		
		System.out.println("in edit page"+rollnumber);
		
		StudentInfo stuInfo=dao.getByRollnumber(rollnumber);
		
		model.addAttribute("command", stuInfo);
		return "edit-student";
		
	}

	
	@RequestMapping("/updateRecord")
	public String updateStudentRecord(@ModelAttribute("students") StudentInfo students) {
		
		dao.updateStudet(students);
		
		return "redirect:/view";
		
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int rollnumber) {
		
		dao.deleteRecord(rollnumber);
		
		return "redirect:/view";
		
	}
	
}
