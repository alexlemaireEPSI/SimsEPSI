/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simsepsi;

import java.util.Random;

public class Travail {

	private String nomSim;
	private String dateTravail;
	
	public Travail(String nom ,String date) {
		// TODO Auto-generated method stub
		nomSim = nom;
		dateTravail = date;
		

		System.out.println(date+" : "+nom+" va au travail.");
		Random aléatoire = new Random ();
		int nb = aléatoire.nextInt(5);	
		switch (nb) {
		case 0 : discute();
		case 1 : gateau();
		case 2 : bourreauTravail();
		case 3 : patron();
		case 4 : 
		}
		System.out.println(date+" : "+nom+" va manger.");
		System.out.println(date+" : "+nom+" quitte le travail.");
	}
	
	private void discute()
	{
		System.out.println(dateTravail+" : "+nomSim+" discute avec son collègue.");
		System.out.println("Sociabilité +1");
	}
	
	private void gateau()
	{
		System.out.println(dateTravail+" : "+nomSim+" trouve un mars sur son bureau.");
		System.out.println("Faim +1");
	}
	
	private void bourreauTravail()
	{
		System.out.println(dateTravail+" : "+nomSim+" a très bien travaillé aujourd'hui.");
		System.out.println("Satisfaction Personnel +1");
		System.out.println("Faim -1");
		System.out.println("Energie -3");
	}
	
	
	private void patron()
	{
		System.out.println(dateTravail+" : "+nomSim+" est convoqué par le patron.");
		System.out.println("Stress +1");
		System.out.println(dateTravail+" : "+nomSim+" est rassuré, l'entretien s'est bien passé.");
		System.out.println("Stress -5");
	}
}
