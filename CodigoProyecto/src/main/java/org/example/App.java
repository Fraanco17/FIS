package org.example;

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
        System.out.println("Buenos dias");
        cuser.getGUI().show();
    }
}
