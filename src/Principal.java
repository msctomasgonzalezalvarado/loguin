import gestor.interfaz.Sesion;
import gestor.interfaz.Menu;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Principal {
    public static  void main(String[] args){
        JFrame frame = new JFrame("Inicio de Sesión");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width/2)-300;
        int y = (pantalla.height/2)-200;

	    Sesion loguin = new Sesion();

        frame.setContentPane(loguin.getPanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(600,450);
        frame.setLocation(x,y);


        frame.setVisible(true);

    }
}















