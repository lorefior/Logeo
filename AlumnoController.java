package com.curso.escuela.logeo.Controller;

	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;

	import com.curso.escuela.logeo.com.curso.escuela.logeo.Alumno;

	public class AlumnoController {

	    @GetMapping("/greeting")
	    public String greetingForm(Model model) {
	        model.addAttribute("greeting", new Alumno());
	        return "greeting";
	    }
	    @PostMapping("/greeting")
	    public String greetingSubmit(@ModelAttribute Alumno greeting) {
	        return "result";
	    }
	    @PutMapping("/greeting")
	    public String greetingForm1(Model model) {
	        return "greeting";
	    }
	    @DeleteMapping("/greeting")
	    public String greetingForm2(Model model) {
	        return "greeting";
	    }
	}
