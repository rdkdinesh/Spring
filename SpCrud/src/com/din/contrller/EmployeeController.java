package com.din.contrller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.din.entity.Employee;
import com.din.service.EmployeeManager;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeManager emr;
	
	//private static final Logger logger = LoggerFactory.
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView listAllEmp(ModelMap map, Integer offset){
		Integer maxResults = 2;
		map.addAttribute("employeeList",emr.listEmployee(offset, maxResults));
		map.addAttribute("count", emr.empCount());
		map.addAttribute("offset", offset);
		return new ModelAndView("editEmployeeList", map);
	}
	
	@RequestMapping(value="/listuser/{empid}", method=RequestMethod.GET)
	public ModelAndView listEmp(@PathVariable("empid") Integer employeeId, ModelMap map){
		map.addAttribute("employeeList",emr.listEmp(employeeId));
		System.out.println(employeeId);
		
		return new ModelAndView("emp", map);
	}
	
	@RequestMapping(value="/delete/{empid}", method=RequestMethod.GET)
	public String deleteEmp(@PathVariable("empid") Integer empId, ModelMap map){
		emr.deleteEmp(empId);
		return "redirect:/list";		
	}

	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addEmp(@ModelAttribute("empForm") Employee em, BindingResult result){
		
		return new ModelAndView("addEmp");
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addEmpAdd(@Valid @ModelAttribute("empForm") Employee empForm, BindingResult result){
		
		if(result.hasErrors()){
			return "/add";
		}
		Integer e_id = emr.addEmp(empForm);
		System.out.println(e_id);
		return "redirect:/list";
	}
}
