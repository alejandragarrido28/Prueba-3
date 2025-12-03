/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.Semana4;
import  java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Enums {
    public static void main(String[] args) {
        Calendar hoy = Calendar.getInstance();
        Scanner lea= new Scanner(System.in).useDelimiter("\n");
        
        int mes =hoy.get(Calendar.APRIL);
        TipoPeaje tipo =TipoPeaje.EJES3;
        
        System.out.println(tipo.name());
        System.out.println("Tipo de Peaje: ");
        String tipoP= lea.next();
        tipo =TipoPeaje.valueOf(tipoP.toUpperCase());
        System.out.println("Resultado: "+tipo);
        for (TipoPeaje tp: TipoPeaje.values()){
            //tp.precio=0;
            System.out.println("-["+tp.ordinal()+"]: "+tp.name()+" - $"+tp.precio);
        }
    }
            
}
