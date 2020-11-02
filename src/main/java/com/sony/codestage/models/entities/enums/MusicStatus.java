package com.sony.codestage.models.entities.enums;

public enum MusicStatus {
//status do canal
	private int code;
	
	private MusicStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
 
 //metodo estático que converte um valor númerico para um tipo ENUM 
	public static MusicStatus valueOf(int code) {
		for (MusicStatus value : MusicStatus.values()) {
			if (value.getCode() == code) {
				return value;				
			}
		}
		//se o cod digitado não for = a nenhu, exceção
		throw new IllegalArgumentException("Status Inválido MusicStatus code");
	}


}


