/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simsepsi;

import java.util.Random;

public class Travail {

	private String dateTravail;
	private Random aléatoire = new Random ();
	private Sim simTravail;
	
	public Travail(Sim sim,String date) {
		// TODO Auto-generated method stub
		dateTravail = date;
		simTravail = sim;
		
		int nb;
		
		System.out.println(date+" : "+simTravail.nom+" va au travail.");
		int heure = simTravail.main.GetHeure();
		int minute = simTravail.main.GetMinute();
		if (heure > 8)
		{
			System.out.println(simTravail.nom+" très en retard, son patron est très mécontent !");
			System.out.println("Fierté -2");
			simTravail.fierte = simTravail.fierte-2;
			System.out.println("Détente -3");
			simTravail.detente = simTravail.detente-2;
		}
		
		nb = aléatoire.nextInt(5);
		for (int i =0;i<nb;i++) 
		{
			
			nb = aléatoire.nextInt(5);	
			switch (nb) 
			{
				case 0 : discute();
				case 1 : gateau();
				case 2 : bourreauTravail();
				case 3 : patron();
				case 4 : 
			}
		}
		simTravail.main.ReglerHeure(12, 0);
		System.out.println("12h00 : "+simTravail.nom+" va manger.");
		nb = aléatoire.nextInt(5);
		for (int i =0;i<nb;i++) 
		{
			
			nb = aléatoire.nextInt(5);	
			switch (nb) 
			{
				case 0 : discute();
				case 1 : gateau();
				case 2 : bourreauTravail();
				case 3 : patron();
				case 4 : 
			}
		}
		System.out.println(date+" : "+simTravail.nom+" quitte le travail.");
	}
	
	private void discute()
	{
		 int nb = aléatoire.nextInt(5);
		for (int i =0;i<nb;i++) 
		{
			
			nb = aléatoire.nextInt(5);	
			switch (nb) 
			{
				case 0 : System.out.println(simTravail.nom+" discute avec son collègue.");
						System.out.println("Sociabilité +1");
						simTravail.sociabilite = simTravail.sociabilite+1;
				case 1 : System.out.println(simTravail.nom+" se dispute avec son collègue.");
						System.out.println("Sociabilité -2");
						simTravail.sociabilite = simTravail.sociabilite-2;
				case 2 : System.out.println(simTravail.nom+" se sent seul, son collègue est en congé.");
						System.out.println("Sociabilité -1");
						simTravail.sociabilite = simTravail.sociabilite-1;
				case 3 : System.out.println(simTravail.nom+" offre un café à un collègue et discute un peu avec lui.");
						System.out.println(simTravail.nom+" réalise que c'est en fait son supérieur.");
						System.out.println("Detente +1");
						simTravail.detente = simTravail.detente+1;
				case 4 : System.out.println(simTravail.nom+" demande à un collègue comment fonctionne la nouvelle imprimante.");
			}
		}
		
	}
	
	private void gateau()
	{
		
		 int nb = aléatoire.nextInt(5);
			for (int i =0;i<nb;i++) 
			{
				
				nb = aléatoire.nextInt(5);	
				switch (nb) 
				{
					case 0 : System.out.println(simTravail.nom+" trouve un mars sur son bureau.");
							System.out.println("Satiété +1");
							simTravail.satiete = simTravail.satiete+1;
					case 1 : System.out.println(simTravail.nom+" est convié à un petit déjeuner avec ses collègues.");
							System.out.println("Sociabilité +3");
							simTravail.sociabilite = simTravail.sociabilite-3;
							System.out.println("Satiete +3");
							simTravail.satiete = simTravail.satiete+3;
					case 2 : System.out.println(simTravail.nom+" partage avec la nouvelle stagiaire la brioche qu'elle a apporté.");
							System.out.println("Detente +1");
							simTravail.detente = simTravail.detente+1;
							System.out.println("Satiété +1");
							simTravail.satiete = simTravail.satiete+1;
					case 3 : System.out.println(simTravail.nom+" fait tomber son gateau au chocolat par terre.");
							System.out.println("Detente -1");
							simTravail.detente = simTravail.detente-1;
					case 4 : System.out.println(simTravail.nom+" se rend au distributeur automatique de friandises.");
							System.out.println("Satiete +1");
							simTravail.satiete = simTravail.satiete+1;
				}
			}
			
		}
	
	private void bourreauTravail()
	{
		System.out.println(simTravail.nom+" a très bien travaillé aujourd'hui.");
		System.out.println("Fierté +1");
		simTravail.fierte = simTravail.fierte+1;
		System.out.println("Satiete -1");
		simTravail.satiete = simTravail.satiete-1;
		System.out.println("Energie -3");
		simTravail.energie = simTravail.energie-3;
	}
	
	
	private void patron()
	{
		System.out.println(simTravail.nom+" est convoqué par le patron.");
		System.out.println("Detente -1");
		simTravail.detente = simTravail.detente-1;
		System.out.println(simTravail.nom+" est rassuré, l'entretien s'est bien passé.");
		System.out.println("Detente +5");
		simTravail.detente = simTravail.detente+5;
	}
}
