/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajo_s9_veterinaria;

/**
 *
 * @author lizet
 */
public class servicios {
    String tiposervicio, animal,tamanio;
    int costoservicio,costotamanio,costoanimal;
    int perrosatendidos=0,perrospequenios = 0,gatosatendidos = 0,perrosmedianos = 0,
        perrosgrandes = 0, banios = 0, serviciosmedicos = 0, banioymed = 0,
            totalcaja=0, precioservicio=0;

    

    public servicios(){
        
    }
   
    
    public int calcularprecios(int opcionservicio,int opcionanim,int opciontamanio){
        int precioservicio=0;
        switch(opcionservicio){

            case 1:
                this.tiposervicio = "baño";
                this.costoservicio=450;
                precioservicio+=costoservicio;
                banios++;
                break;
            case 2:
                this.tiposervicio = "atencion medica";
                this.costoservicio=500;
                precioservicio+=costoservicio;
                serviciosmedicos++;
                break;
            case 3:    
                    
                this.tiposervicio = "Baños y Servicios medicos";
                this.costoservicio=600;
                precioservicio+=costoservicio;
                banioymed++;
                break;
            default:{
                System.out.println("Opción no válida, intente de nuevo.");
               
            }
                
        }
        switch(opcionanim){
            case 1:
                this.animal = "perro";
                this.costoanimal= 70;
                precioservicio+=costoanimal;
                perrosatendidos++;
                break;
            case 2:
                this.animal = "gato";
                this.costoanimal=50;
                precioservicio+=costoanimal; 
                gatosatendidos++;
                break;
        }
       switch(opciontamanio){
            case 1:
                this.tamanio = "grande";
                this.costotamanio=100;
                precioservicio+=costotamanio;
                perrospequenios++;
               
                break;
            case 2:
                this.tamanio = "mediano";
                this.costotamanio=75;
                precioservicio+=costotamanio;
                perrosmedianos++;
                break;
            case 3:
                this.tamanio = "pequeño";
                this.costotamanio=50;
                precioservicio+=costotamanio;
                perrosgrandes++;
                break;         
    }
    return precioservicio;

    }
    
}
