package com.mycompany.riego_automatizado;

public class modulo {
    String planta;
    int cant_plantas;
    int vlr_min_h, vlr_max_h, vlr_act_h = 0;
    Boolean riego;

    public modulo(String planta, int cant_plantas, int vmin, int vmax, Boolean riego) {
        this.planta = planta;
        this.cant_plantas = cant_plantas;
        this.vlr_min_h = vmin;
        this.vlr_max_h = vmax;
        this.riego = riego;
    }

}
