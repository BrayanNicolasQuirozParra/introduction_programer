package sistemas;

import javax.swing.*;
import java.awt.*;

public class form_proyecto extends JDialog{
    public form_proyecto (java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());

        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("List all social projection", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);

        //panel central
        String[] columnsNames ={"Name", "Code", "Faculty", "Director"};
        file_data_social file_data_proyecto1=new file_data_social ();
        JTable tabla_datos= new JTable(file_data_proyecto1.f_all_data_proyecto(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);

        //añadimos los dos paneles al formulario
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);

        //Parametros generales del formularioy
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); // modal

    }
}

