package com.uploading.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uploading.Entitys.RawdataF;

public interface Rawdata extends JpaRepository<RawdataF, Integer> {

}
