package com.uploading.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.uploading.Entitys.RawdataF;
import com.uploading.helper.Helper;
import com.uploading.repo.Rawdata;

@Service
public class SaveExcel {
	@Autowired
	private Rawdata rawdatarepo;

	public void save(MultipartFile file) {
		
			try {
				
	List<RawdataF>	data = 		Helper.converListOfRawData(file.getInputStream());
				this.rawdatarepo.saveAll(data);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	public List<RawdataF> getrawdata() {
		// TODO Auto-generated method stub
		return rawdatarepo.findAll();
	}

	
	
}
