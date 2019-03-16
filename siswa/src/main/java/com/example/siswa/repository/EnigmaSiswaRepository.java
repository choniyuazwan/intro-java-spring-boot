package com.example.siswa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.siswa.entity.EnigmaSiswaEntity;

@Repository
public interface EnigmaSiswaRepository extends JpaRepository<EnigmaSiswaEntity, Integer> {
	
}
