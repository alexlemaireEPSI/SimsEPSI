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
    protected int energie=20, satiete=20, sociabilite=20, stress=20, fierte=20;
    protected String nom, prenom;
    protected Travail travail;
    protected Main main;
    
    public Sim(Main pmain)
    {
        main = pmain;
    }
    
    public void Travailler()
    {
        travail = new Travail(this, nom, "8h");
        main.reglerHeure(16, 0);
        energie -= 5;
        
    }
    
    public void PrendreRepas()
    {
        satiete = 20;
    }
    
    
}
