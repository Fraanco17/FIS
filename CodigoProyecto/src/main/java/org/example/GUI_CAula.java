//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : GUI_CAula.java
//  @ Date : 19/05/2022
//  @ Author : 
//
//
package org.example;

import java.util.Scanner;

public class GUI_CAula {
	private final ICAula controlador;

	public GUI_CAula(ICAula entrada){
		this.controlador=entrada;
	}

	public void show(){
		int var;
		System.out.println("¿Que desea hacer?\n1. Dar de alta un aula\n2. Salir");
		Scanner sc= new Scanner(System.in);
		var = sc.nextInt();
		switch (var){
			case 1:
				//Pedir que introduzcan datos
				String nombreCentro = sc.nextLine();
				Long idInterno=sc.nextLong();
				Integer aforo= sc.nextInt();
				String tipoAula= sc.nextLine();
				controlador.AltaAula(nombreCentro,idInterno, aforo, tipoAula);
				break;
			case 2:
				break;
		}
	}
}
