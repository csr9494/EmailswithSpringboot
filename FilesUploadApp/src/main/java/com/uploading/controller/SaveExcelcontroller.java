package com.uploading.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uploading.Entitys.RawdataF;
import com.uploading.Service.SaveExcel;
import com.uploading.helper.Helper;
@CrossOrigin
@RestController
@RequestMapping("/new")
public class SaveExcelcontroller {

	@Autowired
	private SaveExcel service;
	
	@PostMapping("/new")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){
		
		if(Helper.checkExcelFormet(file)) {
			this.service.save(file);
			return ResponseEntity.ok(file);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("plese upload Excel File");
	}
	@GetMapping("/new")
	public List<RawdataF> getrawdata(){
		
		return service.getrawdata();
		
		
	}
}
