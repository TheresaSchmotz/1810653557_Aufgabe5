package Aufgabe4;

import javax.swing.*;

public class Vergleichen {

    public static void main(String[] args) {

        String wert1 = JOptionPane.showInputDialog("Gib Wert 1 ein.");
        String wert2 = JOptionPane.showInputDialog("Gib Wert 2 ein.");
        String wert3 = JOptionPane.showInputDialog("Gib Wert 3 ein.");


        boolean gleich = false;
        if (wert1.equals(wert2))
        {
            gleich = true;
        }
        else if (wert1.equals(wert3))
        {
            gleich = true;
        }
        else if (wert2.equals(wert3))
        {
            gleich = true;
        }

        if (gleich)
        {
            System.out.println("2 der Variablen sind gleich.");
        }
        else
        {
            System.out.println("Keine der Variablen ist gleich.");
        }

    }
}
