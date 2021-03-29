/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solicitudes;

import gui.*;

/**
 *
 * @author jagum
 */
public class Solicitudes {
    
    static Principal principal;
    
    
    
    public static void main(String[] args){
        principal = new Principal();
        principal.setVisible(true);
        principal.requestFocus();
    }
}
