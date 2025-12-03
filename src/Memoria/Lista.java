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
    private Nodo inicio = null;
    private int size = 0;

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(Nodo obj) {
        if (obj == null) {
            return;
        }
        if (isEmpty()) {
            inicio = obj;
        } else {
            Nodo tmp = inicio;
            while (tmp.sigte != null) { 
                tmp = tmp.sigte;
            }
            tmp.sigte = obj; 
            obj.sigte = null; 
        }
        size++;
    }

    public void print() {
        Nodo tmp = inicio;
        while (tmp != null) {
            System.out.println(tmp.toString()); 
            tmp = tmp.sigte;
        }
    }

    public Nodo get(int code) {
        Nodo tmp = inicio;
        while (tmp != null) {
            if (tmp.codigo == code) {
                return tmp;
            }
            tmp = tmp.sigte;
        }
        return null;
    }

 
    public int size() {
        return size;
    }

    public boolean remove(int codigo) {
        if (isEmpty()) {
            return false;
        }

        if (inicio.codigo == codigo) {
            inicio = inicio.sigte;
            size--;
            return true;
        }

        Nodo actual = inicio;
        Nodo anterior = null;

        while (actual != null && actual.codigo != codigo) {
            anterior = actual;
            actual = actual.sigte;
        }

        if (actual == null) {
            return false;
        }

        anterior.sigte = actual.sigte;
        size--;
        return true;
    }


    public void add(int index, Nodo obj) {
        if (obj == null) {
            return;
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice fuera de límites: " + index + ", Tamaño actual: " + size);
        }

        if (index == 0) {
            obj.sigte = inicio;
            inicio = obj;
        }
        else {
            Nodo actual = inicio;
            for (int i = 0; i < index - 1; i++) {
                actual = actual.sigte;
            }
            obj.sigte = actual.sigte;
            actual.sigte = obj;
        }
        size++;
    }
}
