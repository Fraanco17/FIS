package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    CUsuario cuser =new CUsuario();
    CAula caula=new CAula();

    public static void main( String[] args )
    {
        new App().start();
    }

    private void start() {
        String var;
        System.out.println("Buenos dias\nDesea realizar actividades con el 'aula' o con el 'usuario'");
        Scanner sc = new Scanner(System.in);
        var = sc.nextLine();
        switch (var){
            case "aula":
                caula.getGUI().show();
            case "usuario":
                cuser.getGUI().show();
        }//error

    }
}
