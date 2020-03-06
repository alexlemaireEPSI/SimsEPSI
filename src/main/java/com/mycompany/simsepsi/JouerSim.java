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
    public Sim sim;
    
    public void Run()
    {
        sim = new Sim(this);
        sim.nom = "Truc-bidule";
        sim.prenom = "Alex";
        Afficher();
        
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
        System.out.println("Jour " + jour );
        System.out.print("Energie : ");
        for(int i = 1; i <= sim.energie; i++)
        {
            System.out.print("*");
        }
        for(int i = 1; i < 21 - sim.energie; i++)
        {
            System.out.print("_");
        }
        System.out.print(sim.energie + "/20" + newLine);
        
        System.out.print("Satiete : ");
        for(int i = 1; i <= sim.satiete; i++)
        {
            System.out.print("*");
        }
        for(int i = 1; i < 21 - sim.satiete; i++)
        {
            System.out.print("_");
        }
        System.out.print(sim.satiete + "/20" + newLine);
        
        System.out.print("Sociabilite : ");
        for(int i = 1; i <= sim.sociabilite; i++)
        {
            System.out.print("*");
        }
        for(int i = 1; i < 21 - sim.sociabilite; i++)
        {
            System.out.print("_");
        }
        System.out.print(sim.sociabilite + "/20" + newLine);
        
        System.out.print("Detente : ");
        for(int i = 1; i <= sim.detente; i++)
        {
            System.out.print("*");
        }
        for(int i = 1; i < 21 - sim.detente; i++)
        {
            System.out.print("_");
        }
        System.out.print(sim.detente + "/20" + newLine);
        
        System.out.print("Fierte : ");
        for(int i = 1; i <= sim.fierte; i++)
        {
            System.out.print("*");
        }
        for(int i = 1; i < 21 - sim.fierte; i++)
        {
            System.out.print("_");
        }
        System.out.print(sim.fierte + "/20" + newLine);
        
    }
    
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
