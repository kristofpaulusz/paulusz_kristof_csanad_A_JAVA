/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin227
 */
public class Bankfiok {
    private ArrayList<Automata> automatak = new ArrayList<>();

    public Bankfiok() {
        telepit(new Automata("BP202301", 10000000));
        telepit(new Automata("BP202302", 20000000));
    }
    public void telepit(Automata automata) {
        automatak.add(automata);
    }

    public ArrayList<Automata> getAutomatak() {
        return automatak;
    }

    public void leszerel(String azon) {
        automatak.remove(keres(azon));
    }
    private int keres(String azon) {
        boolean nincsMeg = true;
        int i = 0;
        int valasz = -1;
        while (nincsMeg && i<automatak.size()) {            
            if (automatak.get(i).getAzonosito().equals(azon)) {
                valasz = i;
                nincsMeg = false;
            }
            i++;
        }
        
        return  valasz;
    }

    public void jelentes() {
        try {
            FileOutputStream fileos = new FileOutputStream("automatak.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fileos);
            oos.writeObject(automatak);
            oos.close();
            fileos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bankfiok.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bankfiok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void frissit() {
        try {
            FileInputStream fis = new FileInputStream("automatak.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            automatak = (ArrayList<Automata>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bankfiok.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bankfiok.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bankfiok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
