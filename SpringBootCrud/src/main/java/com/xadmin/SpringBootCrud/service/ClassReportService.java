package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.ClassReport;
import com.xadmin.SpringBootCrud.repository.ClassReportRepository;

@Service
public class ClassReportService {
	@Autowired
	public ClassReportRepository classreportRepo;
	
	public List<ClassReport> getClassReport(String id){
		List<ClassReport> classreport = new ArrayList<>();
		classreport = classreportRepo.getClassReport(id);
		return classreport;
	}
}
