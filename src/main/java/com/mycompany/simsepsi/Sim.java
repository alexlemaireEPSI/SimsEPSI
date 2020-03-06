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
    int energie=20, faim=20, sociabilite=20, stress=20, fierte=20;
    String nom, prenom;
    Travail travail;
    
    public Sim()
    {
        
    }
    
    public void Travailler()
    {
        travail = new Travail(this, "8h");
        
    }
}
