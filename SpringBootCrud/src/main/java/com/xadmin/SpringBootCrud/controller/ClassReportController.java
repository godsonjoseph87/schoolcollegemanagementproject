package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.ClassReport;
import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.service.ClassReportService;

@RestController
public class ClassReportController {
	@Autowired
	private ClassReportService classReportService;

	@RequestMapping(method = RequestMethod.GET, value="/getClassReport/{id}")
	public List<ClassReport> getClassReport(@PathVariable String id)
	{
		List<ClassReport> clsreport = classReportService.getClassReport(id);
		return classReportService.getClassReport(id);
	}
}
