package org.example;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Usuario.java
//  @ Date : 03/05/2022
//  @ Author :
//
//

import java.util.Scanner;



public class Usuario implements IUsuario {
	private String DNI;
	private String nombre;
	private String apellidos;
	private String contrasenia;
	public CUsuario cUsuario;
	public void registrarse() {

	}



	@Override
	public void Usuario(String dni, String nombre, String apellidos, String contrasenia) {
		this.DNI=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.contrasenia=contrasenia;
	}

	public void cambiarContrasenia(String dniIN) {
		Scanner sc = new Scanner(System.in);
		int cont=0;
		String dniNew;
		cont++;
		if(DNI.equals(dniIN)){
			contrasenia=sc.nextLine();
		}else{
			do{
				System.out.println("El DNI introducido no es correcto");
				dniNew=sc.nextLine();
				if(DNI.equals(dniNew)){
					System.out.println("Introduzca la nueva contraseña: \n");
					contrasenia= sc.nextLine();
				}
			}while(cont<4);
		}

	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}



	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public void destroy() {

	}
}
