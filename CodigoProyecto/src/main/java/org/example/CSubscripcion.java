/*package org.example;

import servidor.Autenticacion;
import servidor.ObtencionDeRol;
import servidor.UPMUsers;

import java.util.HashMap;

public class CSubscripcion implements ICSuscripcion {
    private GUI_Subscripcion guiSubscripcion;
    //Al utilizar un hashmap no podemos asegurarnos de que
    //este ordenado, pero esto no es relevante.
    //Los subs se ordenaran por su DNI
    private HashMap<Long,String> listaAulaSubs;

    public CSubscripcion(){
        guiSubscripcion = new GUI_Subscripcion(this);
        listaAulaSubs = new HashMap<Long, String>();
    }


    @Override
    public void Suscribirse(Usuario suscriptor, Aula aula) {
        UPMUsers rol = ObtencionDeRol.get_UPM_AccountRol(suscriptor.getCorreo());

    }
}
*/