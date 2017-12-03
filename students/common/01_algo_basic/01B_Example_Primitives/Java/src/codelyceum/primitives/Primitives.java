package codelyceum.primitives;

public class Primitives {

    /**
     * Point d'entrée de l'application.
     */
	public static void main (String[] args) {
		int signed_32_int_a = 0;
		int signed_32_int_b = -1;
		int signed_32_int_c = 1;
		int signed_32_int_d = 42;
		int signed_32_int_e = 65465 * 45 + 54545 * 12 - 5154 + 1 - 54 * 8;
		int signed_32_int_min = (int) - Math.pow(2, 31);
		int signed_32_int_max = (int) + Math.pow(2, 31);
		
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		System.out.println("signed_32_int_b: " + signed_32_int_b);
		System.out.println("signed_32_int_c: " + signed_32_int_c);
		System.out.println("signed_32_int_d: " + signed_32_int_d);
		System.out.println("signed_32_int_e: " + signed_32_int_e);
		System.out.println("signed_32_int_e: " + (signed_32_int_e+1)*2);
		System.out.println("signed_32_int_min: " + signed_32_int_min);
		System.out.println("signed_32_int_max: " + signed_32_int_max);
		
		signed_32_int_a++;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		signed_32_int_a++;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		signed_32_int_a = signed_32_int_a + 1;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		signed_32_int_a = signed_32_int_a + 1;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		signed_32_int_a--;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		signed_32_int_a--;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
		signed_32_int_a = signed_32_int_a - 2;
		System.out.println("signed_32_int_a: " + signed_32_int_a);
	}

}
