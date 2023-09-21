package com.ucp.tetris;

public class Clock {
    public int tiempo = 0;
    public int getClock;

    public Clock(){
    }

    public void tick() {
        tiempo = tiempo + 1;
        System.out.println("Tiempo: " + tiempo);
    }

    public void setClock(int nuevoTiempo) {
        tiempo = nuevoTiempo;
    }

    public int getClock() {
        return tiempo;
    }
}





