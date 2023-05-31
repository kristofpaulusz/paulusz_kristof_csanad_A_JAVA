/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.ArrayList;
import modell.Automata;
import modell.Bankfiok;

/**
 *
 * @author Admin227
 */
public class BankfiokAutomata {
    public static void main(String[] args) {
       Bankfiok ba = new Bankfiok();
       ba.telepit(new Automata("SH231501", 5000000));
        System.out.println("A bankfiók állapota:");
       kiir(ba.getAutomatak());
       ba.jelentes();
       ba = null;
       ba = new Bankfiok();
       ba.frissit();
    }

    private static void kiir(ArrayList<Automata> automatak) {
        for (Automata automata : automatak) {
            System.out.println("\t"+automata.toString());
        }
}
    
}
