/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDominio;

import dominio.JuDiscapacidad;
import dominio.JuPatronal;
import dominio.JuVejez;
import dominio.Seguro;
import java.util.Scanner;

public class TestSeguro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        JuDiscapacidad jd = new JuDiscapacidad();
        JuPatronal jp = new JuPatronal();
        JuVejez jv = new JuVejez();
        JuPatronal auxjp = new JuPatronal();
        JuVejez auxjv =new JuVejez();
        JuDiscapacidad auxjd =new JuDiscapacidad();
        String enter, nombre = " ";
        int opc = 0, tipo = 0, cedula = 0, anios = 0,discapacidad=0;
        float salario = 0;
        boolean salir = false;
        while (!salir) {

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("----------------- MENU -----------------");
            System.out.println("SEGURO SOCIAL ");
            System.out.println("1.- TIPO DE JUBILACION \n2.-INGRESAR DATOS DEL JUBILADO \n3.-CALCULAR SU PENCION");
            System.out.println("\nSI QUIERES SALIR DEL MENU\n4.-SALIR");
            opc = entrada.nextInt();
            if (opc == 1) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("SELECCIONE EL TIPO DE JUBILACION");
                System.out.println("1.JUBILACION POR VEJES\n2.-JUBILACION POR DISCAPACIDAD\n3.-JUVILACION PATRONAL");
                tipo = entrada.nextInt();
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();
            }
            if (opc == 2) {

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("INGRESE LOS DATOS DEL JUBILADO");
                if (tipo == 1) {
                    System.out.print("JUBILACION POR VEJES\n\nINGRESE EL NOMBRE: ");
                    nombre = jv.ingresNombres();
                    System.out.print("INGRESE LA CEDULA: ");
                    cedula = jv.ingresCedula();
                    System.out.print("INGRESE LOS AÑOS TRABAJADO: ");
                    anios = jv.ingresaAnios();
                    System.out.print("INGRESE EL SALARIO: ");
                    salario = jv.ingresaSalario();
                    auxjv = new JuVejez(salario ,anios);

                }
                if (tipo == 2) {
                    System.out.print("JUBILACION POR DISCAPACIDAD\n\nINGRESE EL NOMBRE: ");
                    nombre = jd.ingresNombres();
                    System.out.print("INGRESE LA CEDULA: ");
                    cedula = jd.ingresCedula();
                    System.out.print("INGRESE LOS AÑOS TRABAJADOS: ");
                    anios = jd.ingresaAnios();
                    System.out.print("INGRESE EL SALARIO: ");
                    salario = jd.ingresaSalario();
                    System.out.print("INGRESE SU PORCENTAJE DE DISCAPACIDAD <0-100> ");
                    discapacidad=entrada.nextInt();
                    auxjd =new JuDiscapacidad(salario,anios,discapacidad);
                    
                    

                }
                if (tipo == 3) {
                    System.out.print("JUVILACION PATRONAL\n\nINGRESE EL NOMBRE: ");
                    nombre = jp.ingresNombres();
                    System.out.print("INGRESE LA CEDULA: ");
                    cedula = jp.ingresCedula();
                    System.out.print("INGRESE LOS AÑOS TRABAJADO: ");
                    anios = jp.ingresaAnios();
                    System.out.print("INGRESE EL SALARIO: ");
                    salario = jp.ingresaSalario();
                    int empresa=0;
                    boolean bandera= true;
                    while (bandera) {
                        System.out.println("SI TRABAJO EN EMPRESA PUBLICA DIJITE < 1 >\nSI TRABAJO EN EMPRESA PRIVADA DIJITE<2>");
                        empresa = entrada.nextInt();
                        if(empresa==1|| empresa == 2 ){
                            bandera =false;
                        }
                    }
                    auxjp = new JuPatronal(salario, anios, empresa);

                }

                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();

            }
            if (opc == 3) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                if (tipo == 1) {
                    System.out.println("CALCULAR SU PENCION POR VEJES ");
                    System.out.println(nombre + "           C.I: " + cedula + "       AÑOS TRABAJADOS  " + anios );
                    auxjv.pagoPencion();

                }
                if (tipo == 2) {
                    System.out.println("CALCULAR SU PENCION POR DISCAPACIDAD");
                    System.out.println(nombre + "           C.I: " + cedula + "       AÑOS TRABAJADOS  " + anios );
                    auxjd.pagoPencion();

                }
                if (tipo == 3) {
                    System.out.println("CALCULAR SU PENCION PATRONAL");
                    System.out.println(nombre + "           C.I: " + cedula + "       AÑOS TRABAJADOS  " + anios );
                    auxjp.pagoPencion();
                }
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();
            }
            if (opc == 4) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                salir = true;
                System.out.println("---------- FIN DEL PROGRAMA ----------");
            }
        }

    }
}
