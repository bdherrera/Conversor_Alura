/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Conversor {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenidos al Desafio Alura !", "Alura- Latam -Oracle", 2);

        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre por favor :");
        JOptionPane.showMessageDialog(null, "Hola  " + nombre + ", estás listo para la aventura? ¡Vamos!", "Programa Conversor . Version 1.0", 1);

        String[] Converter = {"Calcular el Tipo de Cambio Monetario", "Conversor de unidades", "Salir"};
        String option = (String) JOptionPane.showInputDialog(null, "Elija la operación a realizar : ", "Programa Conversor . Version 1.0",
                JOptionPane.PLAIN_MESSAGE, null, Converter, Converter[0]);

        while (option != "Salir") {

            if (option == "Calcular el Tipo de Cambio Monetario") {

                convertir();

                int resp = JOptionPane.showConfirmDialog(null, "Deseas abandonar el Programa?");
                if (JOptionPane.OK_OPTION == resp) {
                    JOptionPane.showMessageDialog(null, "Hasta Pronto  " + nombre + " Programa Finalizado", "Programa Conversor . Version 1.0", 1);

                    break;

                }

            } else {
                UnidadMedida();
                int resp = JOptionPane.showConfirmDialog(null, "Deseas abandonar el Programa?");
                if (JOptionPane.OK_OPTION == resp) {
                    JOptionPane.showMessageDialog(null, "Hasta Pronto  " + nombre + " Programa Finalizado", "Programa Conversor . Version 1.0", 1);

                    break;
                }

            }
        }

    }

    private static void UnidadMedida() {

        String[] EdadSideral = {"pulgadas a metros", "Metros a pulgadas", "°c a °Kelvin", "°Kelvin a °c"};
        String Medida = (String) JOptionPane.showInputDialog(null, "Elija la unida de medida: ", "Unidad De medida",
                JOptionPane.PLAIN_MESSAGE, null, EdadSideral, EdadSideral[0]);

        switch (Medida) {

            case "pulgadas a metros":

                String name = JOptionPane.showInputDialog("Ingrese las pulgadas");
                double num = Double.parseDouble(name);
                double result = num / 0.0254;

                JOptionPane.showMessageDialog(null, "La medida es: " + (String.format("%.2f", result) + "m"));
                break;

            case "Metros a pulgadas":

                String name2 = JOptionPane.showInputDialog("Ingrese los Metros");
                double num2 = Double.parseDouble(name2);
                double result2 = num2 * 0.0254;

                JOptionPane.showMessageDialog(null, "La medida es:  " + (String.format("%.2f", result2) + " ´´ "));
                break;

            case "°c a °Kelvin":

                String name3 = JOptionPane.showInputDialog("Ingrese la temperatutra en °c");
                double num3 = Double.parseDouble(name3);
                double result3 = num3 + 273.15;

                JOptionPane.showMessageDialog(null, "La Temperatura es: " + (String.format("%.2f", result3) + "K "));
                break;

            case "°Kelvin a °c":

                String name4 = JOptionPane.showInputDialog("Ingrese la temperatutra en °K");
                double num4 = Double.parseDouble(name4);
                double result4 = num4 -  273.15;

                JOptionPane.showMessageDialog(null, "La Temperatura es : " + (String.format("%.2f", result4) + "°c "));
                break;

        }
    }

    private static void convertir() {

        String[] Divisa = {"Pesos Colombianos a Dólares", "Pesos Colombianos a Eúros", "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a yuan", "Pesos Colombianos a Won-Sul Coreano", "Dólares a Pesos Colombianos", "Eúros a Pesos Colombianos", "Yen Japonés a Pesos Colombianos", "Won-Sul Coreanos a Pesos Colombianos"};
        String money = (String) JOptionPane.showInputDialog(null, "Elija el tipo de cambio: ", "Divisas según ultima cotización Oficial",
                JOptionPane.PLAIN_MESSAGE, null, Divisa, Divisa[0]);

        switch (money) {

            case "Pesos colombianos a Dólares":
                String name = JOptionPane.showInputDialog("Ingrese la cantidad de pesos colombianos");
                double num = Double.parseDouble(name);
                double result = num / 4750 ;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result) + " Dolares"));
                break;
            case "Pesos colombianos  a Eúros":

                String name2 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
                double num2 = Double.parseDouble(name2);
                double result2 = num2 / 5080.60;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result2) + " Euros"));
                break;
            case "Pesos colombianos a Libras Esterlinas":

                String name3 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS ");
                double num3 = Double.parseDouble(name3);
                double result3 = num3 / 5746.91;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result3) + " Libras Esterlinas"));
                break;
            case "Pesos Colombianos a Yuan":

                String name4 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
                double num4 = Double.parseDouble(name4);
                double result4 = num4 / 692.82;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result4) + " Yuan"));
                break;
            case "Pesos Colombianos a Won-Sul Coreano":

                String name5 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
                double num5 = Double.parseDouble(name5);
                double result5 = num5 / 3.68;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result5) + " Wones Coreanos"));
                break;
            case "Dólares a Pesos Colombianos":

                String name6 = JOptionPane.showInputDialog("Ingrese la cantidad de USD ");
                double num6 = Double.parseDouble(name6);
                double result6 = num6 * 4750;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result6) + " Pesos Colombianos"));
                break;
            case "Eúros a Pesos Colombianos":

                String name7 = JOptionPane.showInputDialog("Ingrese la cantidad de EUR");
                double num7 = Double.parseDouble(name7);
                double result7 = num7 * 5080.60;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result7) + " Pesos Colombianos"));
                break;
            case "Libras Esterlinas a Pesos Colombianos ":

                String name8 = JOptionPane.showInputDialog("Ingrese la cantidad de GBP");
                double num8 = Double.parseDouble(name8);
                double result8 = num8 * 5746.91 ;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result8) + " Pesos Colombianos"));
                break;

            case "Yuan a Pesos Colombianos":

                String name9 = JOptionPane.showInputDialog("Ingrese la cantidad de JPY");
                double num9 = Double.parseDouble(name9);
                double result9 = num9 * 692.82 ;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result9) + " Pesos Colombianos"));
                break;
            case "Won-Sul Coreanos a Pesos Colombianos":

                String name10 = JOptionPane.showInputDialog("Ingrese la cantidad de KRW");
                double num10 = Double.parseDouble(name10);
                double result10 = num10 * 3.68;

                JOptionPane.showMessageDialog(null, "Usted recibirá: $ " + (String.format("%.2f", result10) + " Pesos Colombianos"));
                break;

        }
    }

}

