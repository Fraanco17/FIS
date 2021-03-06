//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : CUsuario.java
//  @ Date : 19/05/2022
//  @ Author : 
//
//
package org.example;

import servidor.Autenticacion;

import java.util.LinkedList;
import java.util.List;

public class CUsuario implements ICUsuario {
	private GUI_CUsuario gui;
	private List<Usuario> listaUsuarios;

	public CUsuario(String dni, String nombre, String apellido1, String apellido2, String contrasenia) {
		gui=new GUI_CUsuario(this);
		listaUsuarios=new LinkedList<>();
	}

	public void AltaUsuario (String dni,String nombre, String apellido1, String apellido2,String correo, String contrasenia) {

		if(!new Autenticacion().existeCuentaUPM(correo)){
			if(dni.length()==9 && dni.charAt(9) > 'A' && dni.charAt(9) < 'Z'){
				if(nombre != null && apellido1 != null){
					if (contrasenia.length()>8){
						listaUsuarios.add(new Usuario(dni,nombre,apellido1,apellido2,contrasenia,correo));
					}
				}
			}
		}

		/*if (dni.length() == 9 && dni.charAt(9) > 'A' && dni.charAt(9) < 'Z')
			if (nombre != null)
				if (apellido1 != null)
					if (contrasenia.length() > 8)
						return;
		*/
		/*if (find(dni) && new Autenticacion().existeCuentaUPM(email))
		{
			rol= ObtencionDeRol.get_UPM_AccountRol(email);

		//	if......

			listaUsuarios.add();
		}*/
	}
	
	public void obtener(int id) {
		listaUsuarios.get(id);
	}
	
	public void destroy() {
	
	}
}
