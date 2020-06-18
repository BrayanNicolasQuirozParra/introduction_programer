package sistemas;

import javax.swing.*;
import java.awt.*;

public class form_acercade extends JFrame {
    public form_acercade(){
        setLayout(new BorderLayout());

        //panel superior
        JPanel panel_superior =new JPanel();
        JLabel label_menu= new JLabel("Acerca de",SwingConstants.CENTER);
        label_menu.setFont(new Font("Algerian", 0, 20));
        panel_superior.add(label_menu);

        //panel central
        JPanel panel_central =new JPanel();
        JLabel label_maker= new JLabel(" Brayan nicolas quiroz parra | studied at santo tomas university | mail brayan.quiroz@usantoto.edu.co ",SwingConstants.CENTER);
        panel_central.add(label_maker);


        //agragamos las imagenes
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("img/logo2.png"));
        JLabel logo2 = new JLabel();
        logo2.setIcon(new ImageIcon("img/y.jpg"));
        JPanel panelfoto = new JPanel();
        panelfoto.add(logo);
        panelfoto.add(logo2);

        //agregamos los paneles al formulario
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.WEST);
        add(panelfoto,BorderLayout.SOUTH);

        //parametros del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
    }
}

