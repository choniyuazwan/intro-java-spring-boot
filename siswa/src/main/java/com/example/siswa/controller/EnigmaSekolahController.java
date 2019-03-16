package com.example.siswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.siswa.entity.EnigmaSekolahEntity;
import com.example.siswa.repository.EnigmaSekolahRepository;

@EnableWebMvc
@RestController
@RequestMapping(path="/sekolah")
public class EnigmaSekolahController {
	@Autowired
	EnigmaSekolahRepository enigmaSekolahRepository;
	
	@GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<EnigmaSekolahEntity> getList() throws Exception {
		List<EnigmaSekolahEntity>	enigmaSekolahEntity = enigmaSekolahRepository.findAll();
		return enigmaSekolahEntity;
	}
}
