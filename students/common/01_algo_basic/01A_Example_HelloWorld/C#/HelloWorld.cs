using System;

namespace CodeLyceum
{
    class HelloWorld
    {
        static void Main()
        {
            // Pour la forme on stocke le message dans un objet String
            String message = "Hello, world !";
            // On demande à la console system de l'afficher
            Console.WriteLine(message);
            // Fini !

            // Apparemment nécessaire pour maintenir la console ouverte en C# (?)
            Console.WriteLine("Press any key to exit.");
            Console.ReadKey();
        }
    }
}