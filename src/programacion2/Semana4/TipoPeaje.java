/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package programacion2.Semana4;

/**
 *
 * @author User
 */
public enum TipoPeaje {
    LIVIANO(22.5),EJES2(42.2),EJES3(70.86),EJES4(256.5);
    
    double precio;
    
    TipoPeaje(double precio){
        this.precio=precio;
    }
}
