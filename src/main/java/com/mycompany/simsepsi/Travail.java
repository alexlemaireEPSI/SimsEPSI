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
	private Random aléatoire = new Random ();
	public Travail(String nom ,String date) {
		// TODO Auto-generated method stub
		nomSim = nom;
		dateTravail = date;
		int nb;
		
		System.out.println(date+" : "+nom+" va au travail.");
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
		System.out.println(date+" : "+nom+" va manger.");
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
		System.out.println(date+" : "+nom+" quitte le travail.");
	}
	
	private void discute()
	{
		 int nb = aléatoire.nextInt(5);
		for (int i =0;i<nb;i++) 
		{
			
			nb = aléatoire.nextInt(5);	
			switch (nb) 
			{
				case 0 : System.out.println(dateTravail+" : "+nomSim+" discute avec son collègue.");
						System.out.println("Sociabilité +1");
				case 1 : System.out.println(dateTravail+" : "+nomSim+" se dispute avec son collègue.");
						System.out.println("Sociabilité -2");
				case 2 : System.out.println(dateTravail+" : "+nomSim+" se sent seul, son collègue est en congé.");
						System.out.println("Sociabilité -1");
				case 3 : System.out.println(dateTravail+" : "+nomSim+" offre un café à un collègue et discute un peu avec lui.");
						System.out.println(nomSim+" réalise que c'est en fait son supérieur.");
						System.out.println("Stress -1");
				case 4 : System.out.println(dateTravail+" : "+nomSim+" demande à un collègue comment fonctionne la nouvelle imprimante.");
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
					case 0 : System.out.println(dateTravail+" : "+nomSim+" trouve un mars sur son bureau.");
							System.out.println("Faim +1");
					case 1 : System.out.println(dateTravail+" : "+nomSim+" est convié à un petit déjeuner avec ses collègues.");
							System.out.println("Sociabilité +3");
							System.out.println("Faim +3");
					case 2 : System.out.println(dateTravail+" : "+nomSim+" partage avec la nouvelle stagiaire la brioche qu'elle a apporté.");
							System.out.println("Stress -1");
							System.out.println("Faim +1");
					case 3 : System.out.println(dateTravail+" : "+nomSim+" fait tomber son gateau au chocolat par terre.");
							System.out.println("Stress +1");
					case 4 : System.out.println(dateTravail+" : "+nomSim+" se rend au distributeur automatique de friandises.");
							System.out.println("Faim +1");
				}
			}
			
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
