package codelyceum.primitives;

public class PrimitivesLimits {

    /**
     * Point d'entrée de l'application.
     */
	public static void main (String[] args) {
		int nombreEntier1 = 5;
		int nombreEntier2 = -12;
		int nombreEntier3 = 54 * 451 - 12 + 48 * 468464;
		
		System.out.println("nb1: " + nombreEntier1);
		System.out.println("nb2: " + nombreEntier2);
		System.out.println("nb3: " + nombreEntier3);
		System.out.println("nb3^2: " + nombreEntier3*nombreEntier3);
		
		float nombreDecimal1 = 0f;
		float nombreDecimal2 = 0.1f;
		float nombreDecimal3 = 0.000000000000000000000000000000000000000000001f;
		float nombreDecimal4 = 100000000000000000000000000000000000000.000000000000000000000000000000000000000000001f;
		float nombreDecimal5 = 99999999999999999999999999999999999999.00000000000000000000000001f;
		
		System.out.println(nombreDecimal1);
		System.out.println(nombreDecimal2 - nombreDecimal3*1000000000*1000000000*1000000000*1000000000*1000000000);
		System.out.println(nombreDecimal3);
		System.out.println(nombreDecimal4);
		System.out.println(nombreDecimal5);
	}

}
