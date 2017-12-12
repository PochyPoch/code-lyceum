package codelyceum.findPrimes;

import java.io.IOException;
import java.util.ArrayList;

public class PrimeFinder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Instanciation d'une liste vide
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		// Tant que la taille de la liste est <100 on cherche de nouveaux nbres premiers
		for (int currentInteger = 1; primeNumbers.size() < 100 ; currentInteger++) {
			// Self-explanatory :)
			if (isPrime(currentInteger)) primeNumbers.add(currentInteger);
		}
		
		System.out.println(primeNumbers.toString());
		
	}
	
	/**
	 * Permet de savoir si un nombre est premier.
	 * @param nbToTest Un entier positif à tester pour sa primalité.
	 * @return <code>true</code> si {@code nb} est premier, <code>false</code> sinon.
	 */
	private static boolean isPrime(int nbToTest) {
		// Un nombre est premier s'il est divisible uniquement par 1 et par lui-même
		// On va checker tous les nombres compris entre 2 et nb-1 pour voir s'ils divisent nbSaisi ou pas
		for (int currentInt = 2; currentInt<nbToTest; currentInt++) {
			if (nbToTest % currentInt == 0) {
				// Inutile de tester tous les autres diviseurs, autant sortir du for
				return false; 
			}
		}
		
		return true;
	}
	
}
