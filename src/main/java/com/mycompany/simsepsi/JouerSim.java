/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simsepsi;

/**
 *
 * @author gauti
 */
public class JouerSim {
    
    private static int jour = 1;
    private static int heure = 6;
    private static int minute = 0;
    public static String newLine = System.getProperty("line.separator");
    
    public void Run()
    {
        Sim sim = new Sim(this);
        sim.nom = "Truc-bidule";
        sim.prenom = "Alex";
        
    }
    
    public int GetHeure(){return heure;}
    public int GetMinute(){return minute;}
    
    public void PasserTemps(int heure, int minute)
    {
        
    }
    
    public void ReglerHeure(int heure, int minute)
    {
        
    }
    
    public void Afficher()
    {
        clearScreen();
        
    }
    
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
