package com.example.siswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.siswa.entity.EnigmaSiswaEntity;
import com.example.siswa.repository.EnigmaSiswaRepository;

@EnableWebMvc
@RestController
@RequestMapping(path="/siswa")
public class EnigmaSiswaController {
	@Autowired
	EnigmaSiswaRepository enigmaSiswaRepository;
	
	@GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<EnigmaSiswaEntity> getList() throws Exception {
		List<EnigmaSiswaEntity>	enigmaSiswaEntity = enigmaSiswaRepository.findAll();
		return enigmaSiswaEntity;
	}
}
