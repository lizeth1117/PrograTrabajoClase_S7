/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progratrabajo_s9_veterinaria;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class PrograTrabajo_S9_Veterinaria {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
     

    Scanner sc = new Scanner(System.in);
    double precioservicio = 0; 
    double precioanim = 0,preciotamanio = 0, totalcaja=0,cuenta=0;
    int continuarcompra, opciontamanioperro=0, nuevafactura;
    caja c=new caja();  // variable de instancia aclase servicios y caja  
        do{
            c.borrarlista();
            do {
            System.out.println("Bienvenido a la veterinaria Nuestro Esfuerzo\n"
                    + "Seleccione su tipo de atencion\n"
                    + "1. Banio (Lps. 450)\n"
                    + "2. Servicios Medicos (Lps. 500)\n"
                    + "3. Banios y Servicios medicos (Lps. 140)");       
            int opcionservicio = sc.nextInt();
            
            System.out.println("Seleccione su tipo de animal:");
            System.out.println("1. Perros (Lps. 70)");
            System.out.println("2. Gatos (Lps. 50)");
            int opcionanim = sc.nextInt();
            
            if(opcionanim==1){
                    System.out.println("Que tamanio de perro?");
                    System.out.println("1. Grande (Lps. 100)");
                    System.out.println("2. Mediano(Lps. 75)");
                    System.out.println("3. Pequenio(Lps. 50)");
                    opciontamanioperro = sc.nextInt();
                }
          precioservicio=c.calcularprecios(opcionservicio, opcionanim, opciontamanioperro);// uso del metodo calcularprecios
          cuenta=cuenta+precioservicio;  // sumar servicio a cuenta actual
          totalcaja=(totalcaja+cuenta);  //sumar la cuenta actual a total de ventas del dia
            
            System.out.println("Desea ingresar otro servicio? 1.Si / 2.No");
            continuarcompra = sc.nextInt();
            c.listacostos();
            } // fin de do
            while(continuarcompra==1);
            c.mostrarfactura(cuenta);
            System.out.println("Desea crear una nueva factura? 1.Si / 2.No");
            nuevafactura=sc.nextInt();

        } // fin de do
      while(nuevafactura==1);
            c.cerrarcaja(totalcaja);
    }

    }
    


