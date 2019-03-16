package com.example.siswa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sekolah")
public class EnigmaSekolahEntity {
	@Id
	private int id;
	
	@Column(name="nama")
	private String nama;
	
	@Column(name="alamat")
	private String alamat;
	
	@Column(name="jumlah_guru")
	private String jumlah_guru;
	
	@Column(name="telp")
	private String telp;
	
	@Column(name="jumlah_siswa")
	private String jumlah_siswa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJumlah_guru() {
		return jumlah_guru;
	}

	public void setJumlah_guru(String jumlah_guru) {
		this.jumlah_guru = jumlah_guru;
	}

	public String getTelp() {
		return telp;
	}

	public void setTelp(String telp) {
		this.telp = telp;
	}

	public String getJumlah_siswa() {
		return jumlah_siswa;
	}

	public void setJumlah_siswa(String jumlah_siswa) {
		this.jumlah_siswa = jumlah_siswa;
	}
	
}
