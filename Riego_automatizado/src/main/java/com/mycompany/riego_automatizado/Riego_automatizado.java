/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.riego_automatizado;

import Vistas.Principal;

public class Riego_automatizado {

    public static void main(String[] args) {
        try {
            Principal principal = new Principal();
            principal.setVisible(true);
        } 
        catch (Exception e) {
            System.out.println("Ocurrio un error en el main: "+e.getMessage());
        }
    }
}
