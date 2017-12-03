package codelyceum;

public class HelloWorld {

    /**
     * Point d'entrée de l'application.
     */
    public static void main (String[] args) {
        // On instancie une String contenant le message à afficher
        String message = "Hello, World !"; // Même chose que d'écrire String message = new String("Hello, World");
        // On demande à la console système gérée par la JVM d'afficher cette variable (console en dév, sinon terminal)
        System.out.println(message);
    }

}