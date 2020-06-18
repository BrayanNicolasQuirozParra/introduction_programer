package sistemas;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    //constructor se ejecuta ya me esta clase
    public form_menu() {
        //etiqueta de nombre del software
        JLabel label_menu = new JLabel("SAC version JAVA", SwingConstants.CENTER);
        label_menu.setBounds(200, 10, 200, 50);
        label_menu.setFont(new Font("Algerian",0,20));
        add(label_menu);
        //etiqueta quien lo creo
        JLabel label_maker = new JLabel("Creado por: Nicolas Quiroz", SwingConstants.LEFT);
        label_maker.setBounds(5, 300, 500, 20);
        label_maker.setFont(new Font("Algerian",0,20));
        add(label_maker);
        JButton boton_iniciar = new JButton("INICIAR");
        boton_iniciar.setBounds(250, 150, 120, 40);
        boton_iniciar.setFont(new Font("Algerian",0,20));
        //crear una accion para cuando le de clik
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                //va el codigo de lo que el va a hacer
                //crear una instancia del formulario principal
                form_principal form_principal1 = new form_principal();
                setVisible(false);
            }
        });
        add(boton_iniciar);
        //propiedades del formulario
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

