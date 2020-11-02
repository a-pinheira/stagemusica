package com.sony.codestage.models.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_dados")
public class Music extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String dadosYtb;
	private Long views;
	private String inscritos;
	private String engajamento;
	/*@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING,
    pattern = "yyyy-MM-dd")
	//private Date Data; ou
	@JsonFormat(shape = JsonFormat.Shape.STRING, 
	pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	//private Instant Data;*/ 
	private String dataEstimativas; 

	public Music(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	

	public String getDadosYtb() {
		return dadosYtb;
	}

	public void setDadosYtb(String dadosYtb) {
		this.dadosYtb = dadosYtb;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public String getInscritos() {
		return inscritos;
	}

	public void setInscritos(String inscritos) {
		this.inscritos = inscritos;
	}

	public String getEngajamento() {
		return engajamento;
	}

	public void setEngajamento(String engajamento) {
		this.engajamento = engajamento;
	}
	
}
