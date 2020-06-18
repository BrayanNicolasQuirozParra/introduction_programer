package sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// AUTHOR: Brayan Nicolas Quiroz Parra
// DATE: XX / XX / XXXX
//DESCREIPTION: XXXXXXXXXXXXX....
public class form_principal extends JFrame {
    public form_principal () {
        setTitle("SAC JAVA versión 1.0");
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menú principal", SwingConstants.CENTER);
        label_menu.setFont(new Font("Algerian", 0, 20));
        panel_superior.add(label_menu);
        //panel izquierdo (donde van a estar los botones)
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3, 1));
        //creamos el primer boton
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setFont(new Font("Algerian", 0, 20));
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                //
                form_estudent form_estudent1 = new form_estudent();

            }
        });
        panel_izquierdo.add(boton_formulario1);
        //creamos el segundo boton
        JButton boton_formulario3 = new JButton("Social Projection Projects");
        boton_formulario3.setFont(new Font("Algerian", 0, 20));
        boton_formulario3.setBounds(0, 0, 100, 30);
        boton_formulario3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                form_social form_social1 = new form_social();

            }

        });
        // Creamos el tercer boton
        panel_izquierdo.add(boton_formulario3);
        panel_izquierdo.add(boton_formulario1);
        JButton boton_formulario4 = new JButton("List all social projection ");
        boton_formulario4.setFont(new Font("Algerian", 0, 20));
        boton_formulario4.setBounds(0, 0, 100, 30);
        boton_formulario4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                f_abrir_form_proyecto(actionEvent);

            }

        });

        panel_izquierdo.add(boton_formulario4);
        //creamos el cuarto boton
        JButton boton_formulario2 = new JButton("List all students");
        boton_formulario2.setFont(new Font("Algerian", 0, 20));
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);

            }

        });

        panel_izquierdo.add(boton_formulario2);
        //creamos el quito boton (acercade).
        JButton boton_acercade = new JButton("Acerca de...");
        boton_acercade.setFont(new Font("Algerian", 0, 20));
        boton_acercade.setBounds(0, 0, 100, 50);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                form_acercade form_acercade1 = new form_acercade();

            }
        });

        panel_izquierdo.add(boton_acercade);
        // creamos el panel inferior
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por: Nicolas quiroz"));
        panel_inferior.setFont(new Font("Algerian", 0, 20));
        //agregar los paneles al formulario (jframe).
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);

        //parametros generales del formularios
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 642, 900);
        setLocationRelativeTo(null);
    }

    private void f_abrir_form_show_all_student (java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student(this);

    }
    private void f_abrir_form_proyecto (java.awt.event.ActionEvent evt){
        form_proyecto form_proyecto1 = new form_proyecto(this);

    }
}



