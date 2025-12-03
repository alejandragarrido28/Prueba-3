/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.Semana1;

/**
 *
 * @author User
 */
public class FuncionesRecursivas {
    public static int sumaUP(int num){
        if(num>=1)
            return sumaUP(num-1)+num;
        return 0;
    }
    
    public static int sumaDOWN(int num){
        return sumaDOWN(num, 0);
    }
    private static int sumaDOWN(int num, int sumar){
        if(num>=1)
            return sumaDOWN (num-1,sumar+num);
        return sumar;
    }
    
    public static int potUP( int base, int exp){
        if(exp>0)
            return potUP(base,exp-1)*base;
        return 1;
    } 
    
    public static int potDOWN(int base, int exp){
        return potDOWN(base,exp,1);
    }
    
    private static int potDOWN(int base, int exp, int pot){
        if(exp>0)
            return potDOWN(base,exp-1,pot*base);
        return pot;
    }
    
    public static boolean isPalindromo(String pal){
        return isPalindromo(pal,0,pal.length()-1);
    }
    
    private static boolean isPalindromo(String word, int inicio, int fin){
        if(inicio<fin)
        {
         if(word.charAt(inicio)==word.charAt(fin))
             return isPalindromo(word,inicio+1,fin-1);
         return false;
        }
        return true;
    }  
   
            
}
