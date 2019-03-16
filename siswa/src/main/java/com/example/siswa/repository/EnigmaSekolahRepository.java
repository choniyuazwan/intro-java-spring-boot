package com.example.siswa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.siswa.entity.EnigmaSekolahEntity;

@Repository
public interface EnigmaSekolahRepository extends JpaRepository<EnigmaSekolahEntity, Integer> {

}
