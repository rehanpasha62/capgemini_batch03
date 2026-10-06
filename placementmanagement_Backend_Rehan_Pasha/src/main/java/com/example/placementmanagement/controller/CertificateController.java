package com.example.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.placementmanagement.entity.CertificateEntity;
import com.example.placementmanagement.service.CertificateService;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService certificateService;
	
	@PostMapping("/savecertificate")
	public CertificateEntity registercertificate(@RequestBody CertificateEntity certificateEntity) {
		return certificateService.registercertificate(certificateEntity);
		
	}
	
	@GetMapping("/getcertificate")
	public List<CertificateEntity> getcertificate(){
		return certificateService.getCertificate();
		
	}
	
	@DeleteMapping("/deletecertificate/{id}")
	public void deleteCer(@PathVariable("id") long id) {
		certificateService.deletecertificate(id);
	}
	
	@PutMapping("/updatecertificate/{id}")
	public CertificateEntity updateCer(@PathVariable("id")long id,@RequestBody CertificateEntity certificateEntity) {
		return certificateService.updatecertificate(id, certificateEntity);
		
	}
}
