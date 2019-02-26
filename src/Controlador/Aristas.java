/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Aristas {
  private ArrayList<Arista> aristas = new ArrayList<>();
    
    
    public void añade(Arista a){
        aristas.add(a);
    }
    
    public Arista artista(int i){
        if(i<0 || i>=aristas.size())
            return null;
        
        return aristas.get(i);
    }  
}
