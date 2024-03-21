package gestor.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
    private JPanel panel1;

    public JPanel getPanelMain() {
        return panel1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
