/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;

/**
 *
 * @author Admin227
 */
public class Automata implements Serializable {
    private String azonosito;
    private int penzosszeg;

    public Automata(String azonosito, int penzosszeg) {
        this.azonosito = azonosito;
        this.penzosszeg = penzosszeg;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public int getPenzosszeg() {
        return penzosszeg;
    }

    @Override
    public String toString() {
        return "Automata{" + "azonosito=" + azonosito + ", penzosszeg=" + penzosszeg + '}';
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }
    
}
