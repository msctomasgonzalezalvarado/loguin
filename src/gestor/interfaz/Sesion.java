package gestor.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sesion extends JFrame implements ActionListener{
    private JButton btnMensaje;
    private JPanel panelMain;
    private JTextField txtUsuario;
    private JButton btnIngresar;
    private JButton btnCerrar;
    private JPasswordField txtPass;
    private JButton btnSaludo;

    public Sesion() {
        btnIngresar.addActionListener(this);
        btnCerrar.addActionListener(this);
    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIngresar) {
            JOptionPane.showMessageDialog(null, "verificar usuario: " + txtUsuario.getText() + " y contraseña: " + txtPass.getText());


        }
        else
            if (e.getSource() ==btnCerrar){
                JOptionPane.showMessageDialog(null, "Adios");
                System.exit(0);
            }
    }

}
