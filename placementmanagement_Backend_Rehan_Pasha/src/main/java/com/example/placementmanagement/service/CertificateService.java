package com.example.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.entity.CertificateEntity;
import com.example.placementmanagement.repository.CertificateRepo;

@Service
public class CertificateService {

	@Autowired
	private CertificateRepo certificateRepo;
	
//	create
	public CertificateEntity registercertificate(CertificateEntity certificateEntity) {
		return certificateRepo.save(certificateEntity);
		
	}
	
//	read
	public List<CertificateEntity> getCertificate(){
		return (List<CertificateEntity>) certificateRepo.findAll();
	}
	
//	delete
	public void deletecertificate(long id) {
		certificateRepo.deleteById(id);
	}
	
//	update
	public CertificateEntity updatecertificate(long id,CertificateEntity certificateEntity) {
		
		CertificateEntity existcertificate = certificateRepo.findById(id).orElse(null);
		
		if(existcertificate != null) {
			existcertificate.setCollege(certificateEntity.getCollege());
			existcertificate.setYear(certificateEntity.getYear());;
		}
		return certificateRepo.save(existcertificate);
		
	}
}
