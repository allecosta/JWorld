package edu.tutorialspoint.basic.unicode;

public class UnicodeSystem02 {
    public static void main(String[] args) {
        char letterA = '\u0041';
        char letterSigma = '\u03A3';
        char copyrightSymbol = '\u00A9';
        char letterZ = 'Z';
        char letterOmega = 'Ω';
        char registeredSymbol = '®';

        System.out.println("*** Caracteres Unicode Usando Escape ***" );
        System.out.println("Letra " + letterA); //Letra A
        System.out.println("Sigma " + letterSigma); //Sigma Σ  
        System.out.println("Copyright " + copyrightSymbol); // Copyright ©  
        System.out.println("Letra " + letterZ); // Letra Z
        System.out.println("Omega " + letterOmega); // Omega Ω
        System.out.println(" Registrado " + registeredSymbol); // Registrado ®
    }
}
