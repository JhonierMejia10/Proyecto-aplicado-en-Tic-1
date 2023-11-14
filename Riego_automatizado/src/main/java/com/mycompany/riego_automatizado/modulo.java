package com.mycompany.riego_automatizado;

public class modulo {
    private String planta;
    private int cant_plantas;
    private int vlr_min_h;
    private int vlr_max_h;
    private int vlr_act_h;
    private Boolean riego;

    public modulo(String planta, int cant_plantas, int vmin, int vmax) {
        this.planta = planta;
        this.cant_plantas = cant_plantas;
        this.vlr_min_h = vmin;
        this.vlr_max_h = vmax;
        this.vlr_act_h = vmax;
        this.riego = false;
    }

    public void reducir_humedad(double temperatura){
        vlr_act_h-=temperatura*cant_plantas*0.02;
    }
    
    public double regar(){
        vlr_act_h=vlr_max_h;
        
        double agua_gastada;
        agua_gastada = cant_plantas*0.02;
        return agua_gastada;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public int getCant_plantas() {
        return cant_plantas;
    }

    public void setCant_plantas(int cant_plantas) {
        this.cant_plantas = cant_plantas;
    }

    public int getVlr_min_h() {
        return vlr_min_h;
    }

    public void setVlr_min_h(int vlr_min_h) {
        this.vlr_min_h = vlr_min_h;
    }

    public int getVlr_max_h() {
        return vlr_max_h;
    }

    public void setVlr_max_h(int vlr_max_h) {
        this.vlr_max_h = vlr_max_h;
    }

    public int getVlr_act_h() {
        return vlr_act_h;
    }

    public void setVlr_act_h(int vlr_act_h) {
        this.vlr_act_h = vlr_act_h;
    }

    public Boolean getRiego() {
        return riego;
    }

    public void setRiego(Boolean riego) {
        this.riego = riego;
    }
}
