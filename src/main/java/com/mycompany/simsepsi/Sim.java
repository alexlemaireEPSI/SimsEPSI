/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simsepsi;

import java.util.Date;

/**
 *
 * @author gauti
 */
public class Sim {
    protected int energie=20, satiete=20, sociabilite=20, detente=20, fierte=20;
    protected String nom, prenom;
    protected Travail travail;
    protected JouerSim main;
    
    public Sim(JouerSim pmain)
    {
        main = pmain;
    }
    
    public boolean Travailler()
    {
        travail = new Travail(this, "8h");
        main.ReglerHeure(16, 0);
        energie -= 5;
        if (energie>=0){
            return true;
        }
        return false;
        
        
    }
    
    public void PrendreRepas()
    {
        satiete = 20;
    }
    
    
}
