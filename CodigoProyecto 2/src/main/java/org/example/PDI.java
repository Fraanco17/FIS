package org.example;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : PDI.java
//  @ Date : 03/05/2022
//  @ Author : 
//
//




public class PDI extends Observadores {
	private String codigoTrabajador;
	private String categoriaPDI;
	public Aula aulaI;
	public Actuadores actuadores;

	public PDI(String codigoTrabajador, String categoriaPDI) {
		this.codigoTrabajador = codigoTrabajador;
		this.categoriaPDI = categoriaPDI;
	}

	public void setCodigoTrabajador(String codigoTrabajador) {
		this.codigoTrabajador = codigoTrabajador;
	}

	public void setCategoriaPDI(String categoriaPDI) {
		this.categoriaPDI = categoriaPDI;
	}

	public String getCodigoTrabajador() {
		return codigoTrabajador;
	}

	public String getCategoriaPDI() {
		return categoriaPDI;
	}

	public void destroy() {
	
	}
}
