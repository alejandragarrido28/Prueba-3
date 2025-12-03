/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memoria;

/**
 *
 * @author User
 */
public class Lista {
    private Nodo inicio= null;
    private int size=0;
    
    public boolean isEmpty(){
        return inicio==null;
    }
    
    public void add(Nodo obj){
        if(obj==null)
            return;
        if(isEmpty()){
            inicio=obj;
        }else{
            Nodo tmp=inicio;
            while(tmp.sigte!=null){
                tmp=tmp.sigte;
            }
            tmp.sigte=obj;
        }
        size++;
    }
    public void print(){
        Nodo tmp=inicio;
        while(tmp!=null){
            System.out.println(x:tmp);
            tmp=tmp.sigte;
        }
    }
    
    public Nodo get(int code){
        Nodo tmp=inicio;
        while(tmp!=null){
            if (tmp.codigo==code)
                return tmp;
            tmp=tmp.sigte;
        }
        return null;
    }
}
