package com.example.tone.capitalgame;

public class Capitais {
    private String estado;
    private String capital;

    public Capitais(){
        this.estado = "";
        this.capital = "";
    }
    public void add(String estado, String capital){
        this.estado = estado;
        this.capital = capital;
    }
    public String estado(){
        return this.estado;
    }
    public String capital(){
        return this.capital;
    }
}
