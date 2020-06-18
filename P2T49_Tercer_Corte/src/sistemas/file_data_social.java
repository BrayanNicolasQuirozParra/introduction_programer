package sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_social {
    public static boolean f_add_student (String p_faculty, String p_name, String p_code, String p_director) {
        //description: este método crea una nueva línea en un archivo C:/Users/NICOLAS/Documents/P_D_P_S.txt
        boolean result;
        try {
            File myFile = new File("C:/Users/NICOLAS/Documents/P_D_P_S.txt");
            if (myFile.exists()) {
                //instanciamos el archivo con TRUE para agregar nuevas lineas.
                FileWriter myFile2 = new FileWriter(myFile, true);
                //cargar la data del archivo en memoria
                BufferedWriter dataMyFile = new BufferedWriter(myFile2);
                dataMyFile.write("\n" +p_faculty+ "|" + p_code + "|"  + p_name +  "|" + p_director);
                dataMyFile.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[][] f_all_data_proyecto () {
        //description: Este método devuelve todos los datos (todas las líneas) del archivo C:/Users/NICOLAS/Documents/P_D_P_S.txt
            String[][] matrix_project;
            String linea_texto, linea_tmp, linea_tmp1, linea_tmp2;
            int row = 0, total_lines = 0, separador1, separador2, separador3;
            try {
                File myfile = new File("C:/Users/NICOLAS/Documents/P_D_P_S.txt");
                if (myfile.exists()) {
                    Scanner myfile3 = new Scanner(myfile);
                    while (myfile3.hasNextLine()) {
                        total_lines++;
                        myfile3.nextLine();
                    }
                    myfile3.close();
                    matrix_project = new String[total_lines][4];
                    myfile3 = new Scanner(myfile);
                    while (myfile3.hasNextLine()) {
                        linea_texto = myfile3.nextLine();
                        separador1 = linea_texto.indexOf("|");
                        if (separador1 != -1) {
                            matrix_project[row][0] = linea_texto.substring(0, separador1);// Nombre
                            linea_tmp = linea_texto.substring(separador1 + 1);
                            separador2 = linea_tmp.indexOf("|");
                            matrix_project[row][1] = linea_tmp.substring(0, separador2); // Codigo
                            linea_tmp1 = linea_tmp.substring(separador2 + 1);
                            separador3 = linea_tmp1.indexOf("|");
                            matrix_project[row][2] = linea_tmp1.substring(0, separador3); // facultad
                            linea_tmp2 = linea_tmp1.substring(separador3 + 1);
                            matrix_project[row][3] = linea_tmp2; // proyento social
                            row++;
                        }
                    }
                    myfile3.close();
                    return matrix_project;
                } else {
                    return null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }


