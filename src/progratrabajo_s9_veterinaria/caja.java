/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajo_s9_veterinaria;

/**
 *
 * @author lizet
 */
public class caja extends servicios {
    String listacostos="";
    public  void listacostos() {
        listacostos=(listacostos+"tiposervicio= " + tiposervicio +"...."
                +costoservicio+ "\nAnimal= " + animal +"...."+costoanimal+
                "\nTamanio= " + tamanio +"...."+costotamanio+"\n");
    }
        
    public void borrarlista(){
listacostos="";
}
  
        
   public void cerrarcaja(double totalcaja){
        
        System.out.println("--- Resumen del dia ---");
        System.out.println("Banios dados: "+banios);
        System.out.println("Servicios Medicos dados: "+serviciosmedicos);
        System.out.println("Combo banio y servicio dados: "+banioymed);
        System.out.println("Gatos atendidos: "+gatosatendidos);
        System.out.println("Perros pequeños atendidos: " +perrospequenios);
        System.out.println("Perros medianos atendidos: " +perrosmedianos);
        System.out.println("Perros grandes atendidos: " +perrosgrandes);
        System.out.println("Total en caja: Lps."+totalcaja);
        System.out.println("¡Gracias por venir, lo esperamos pronto!");
   }
   public void mostrarfactura(double cuenta){
       System.out.println("\n**********FACTURA***********\n"+
              listacostos+"\nEl total de su factura es "+cuenta);
    }
}
