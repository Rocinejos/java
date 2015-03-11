   import java.util.*;

   public class Ejercicio02a17 {
   	//********************************************
      public static boolean esVocal(char c) {
         boolean vocal=false;
         switch (c) {
            case 'a':;
            case 'e':;
            case 'i':;
            case 'o':;
            case 'u':;
            case 'A':;
            case 'E':;
            case 'I':;
            case 'O':;
            case 'U':vocal=true;
               break;
         }
         return vocal;
      }
   
   	//********************************************
      public static boolean esMayuscula(char c) {
         return (c>=65 && c<=90);
      }
   
   	//********************************************
      public static boolean esMinuscula(char c) {
         return (c>=97 && c<=122);
      }
   	
   	//********************************************
   	
      public static char aMayuscula(char c) {
         char caracterADevolver = c;
         if (esMinuscula(c)) {
            caracterADevolver = (char)(c-32);
         }
         return caracterADevolver;
      }
   	   
   	//********************************************
      public static char aMinuscula(char c) {
         char caracterADevolver = c;
         if (esMayuscula(c)) {
            caracterADevolver = (char)(c+32);
         }
         return caracterADevolver;
      }
   	
   	//********************************************
      public static int numMinusculas(String cad) {
         int numMinusculas = 0;
         for (int i=0; i<cad.length(); i++) {
            if (esMinuscula(cad.charAt(i))) {
               numMinusculas++;
            }
         }
         return numMinusculas;
      }
   	   
   	//********************************************
      public static int numMayusculas(String cad) {
         int numMayusculas = 0;
         for (int i=0; i<cad.length(); i++) {
            if (esMayuscula(cad.charAt(i))) {
               numMayusculas++;
            }
         }
         return numMayusculas;
      }
   	   
   	//********************************************
      public static int numVocales(String cad) {
         int numVocales = 0;
         for (int i=0; i<cad.length(); i++) {
            if (esVocal(cad.charAt(i))) {
               numVocales++;
            }
         }
         return numVocales;
      }
   	   
   	//********************************************
      public static int numVecesChar(String cad, char c) {
         int contador = 0;
         for (int i=0; i<cad.length(); i++) {
            if (c == cad.charAt(i) ) {
               contador++;
            }
         }
         return contador;
      }
   	
   	//********************************************
      public static String quitaEspacios(String cadenaConEspacios) {
         String cadenaSinEspacios = "";
         for (int i=0; i<cadenaConEspacios.length(); i++) {
            if (cadenaConEspacios.charAt(i)!=' ') {
               cadenaSinEspacios += cadenaConEspacios.charAt(i);
            }
         }
         return cadenaSinEspacios;
      }
   	
   	//********************************************
      public static String reves(String cadena) {
         String cadReves = "";
         for (int i=cadena.length()-1; i >= 0; i--) {
            cadReves += cadena.charAt(i);
         }
         return cadReves;
      }
   	
   	//********************************************
      public static String charAMay(String cad, char c) {
         String sol = "";
         for (int i=0; i<cad.length(); i++) {
            if (cad.charAt(i) == c) {
               sol += aMayuscula(cad.charAt(i));
            }
            else {
               sol += cad.charAt(i);
            }
         }
         return sol;
      }
   	
   	//********************************************
      public static String vocAMay(String cad) {
         String sol ;
         sol = charAMay(cad,'a');
         sol = charAMay(sol,'e');
         sol = charAMay(sol,'i');
         sol = charAMay(sol,'o');
         sol = charAMay(sol,'u');
         return sol;
      }
   	
   	//********************************************
      public static String vocalizacion(String cad, char c) {
         String sol = "";
         for (int i=0; i<cad.length(); i++) {
            char actual = cad.charAt(i);
            if (esVocal(actual)) {
               sol += c; // sol = sol + c;
            }
            else {
               sol += actual;
            }
         }
         return sol;
      }
   
   	//********************************************
      public static String generoYNumero(String cad) {
         String sol = "";
         char ultimo = cad.charAt(cad.length()-1);
         char penultimo = cad.charAt(cad.length()-2);
         switch (ultimo) {
            case 'o': sol = "masculino singular";
               break;
            case 'a': sol = "femenino singular";
               break;
            case 's': 
               switch (penultimo) {
                  case 'o': sol = "masculino plural";
                     break;
                  case 'a': sol = "femenino plural";
                     break;
                  default: sol = "desconocido"; 
                     break;
               }
               ;
               break;
            default: sol = "desconocido";
               break;
         }
      	
         return sol;
      }
   
   	//********************************************
      private static char quitaTilde(char c) {
         char sol;
         if (c == 'Á') {
            sol='A';
         }
         else if (c == 'É') {
            sol = 'E';
         }
         else if (c == 'Í') {
            sol = 'I';
         }
         else if (c == 'Ó') {
            sol = 'O';
         }
         else if (c == 'Ú') {
            sol = 'U';
         }
         else if (c == 'á') {
            sol = 'a';
         }
         else if (c == 'é') {
            sol = 'e';
         }
         else if (c == 'í') {
            sol = 'i';
         }
         else if (c == 'ó') {
            sol = 'o';
         }
         else if (c == 'ú') {
            sol = 'u';
         }
         else {
            sol = c;
         }
      	
         return sol;
      }
   
   	//********************************************
      public static String quitaTildes(String cad) {
         String sol = "";
         for (int i=0;i<cad.length();i++) {
            sol += quitaTilde(cad.charAt(i));
         }
         return sol;
      }
   	
   	//********************************************
      private static String aMinusculas(String cad) {
         String sol = "";
         for (int i=0; i<cad.length();i++) {
            sol += aMinuscula(cad.charAt(i));
         }
         return sol;
      }
   	
   	//********************************************
      public static boolean esPalindromo(String cad) {
         String filtrada = "";
         filtrada = quitaEspacios(cad);
         filtrada = quitaTildes(filtrada);
         filtrada = aMinusculas(filtrada);
      	//String filtrada = aMinusculas(quitaTildes(quitaEspacios(cad)));
         return filtrada.equals(reves(filtrada));
      }
   
   //--------------------------------------------------------------
   //--------------------------------------------------------------
   //--------------------------------------------------------------
   
      public static void main(String[] args) {
         String cadena = "";
         char caracter = ' ';
      
      //Ejercicio 02
         System.out.println("Mayúsculas");
         System.out.println("==========");
         for (int i=65;i<=(65+25);i++) {
            System.out.println((char)i +"="+esVocal((char)i));
         }
         System.out.println("\nMinúsculas");
         System.out.println("==========");
         for (int i=97;i<=(97+25);i++) {
            System.out.println((char)i +"="+esVocal((char)i));
         }
      	
      	//Ejercicio 03
         System.out.println("\n\nCOMPROBACIÓN de MAYÚSCULAS");
      
         for (int i=32;i<=126;i++) {
            System.out.println((char)i +"="+esMayuscula((char)i));
         }
      	
      	//Ejercicio 04
         System.out.println("\n\nCOMPROBACIÓN de MINúSCULAS");
      
         for (int i=32;i<=126;i++) {
            System.out.println((char)i +"="+esMinuscula((char)i));
         }
      	
      	//Ejercicio 05
         System.out.println("\n\nCONVERSIÓN a MAYúSCULAS");
      
         for (int i=32;i<=126;i++) {
            System.out.println((char)i +"="+aMayuscula((char)i));
         }
      	
      	//Ejercicio 06
         System.out.println("\n\nCONVERSIÓN a MINúSCULAS");
      
         for (int i=32;i<=126;i++) {
            System.out.println((char)i +"="+aMinuscula((char)i));
         }
      	
      	//Ejercicio 07
         System.out.println("\n\nNúmero de minúsculas");
         System.out.println(numMinusculas("AAAABBBBBB0923872832-+}")); //0
         System.out.println(numMinusculas("AAAAAAAAAAAaBBBBBBBBBBB")); //1
         System.out.println(numMinusculas("aAAAAAAAAA")); //1
         System.out.println(numMinusculas("AAAAAAAAAa")); //1
         System.out.println(numMinusculas("bAAAAbAAAAAb")); //3
      	
      	//Ejercicio 08 - a
         System.out.println("\n\nNúmero de mayúsculas");
         System.out.println(numMayusculas("aaaab+0987aaaaaa")); //0
         System.out.println(numMayusculas("aaaaAaaaaaa")); //1
         System.out.println(numMayusculas("Aaaaaaa")); //1
         System.out.println(numMayusculas("aaaaA")); //1
         System.out.println(numMayusculas("AaaaaaaAAAaaaaA")); //5
      
      	//Ejercicio 08 - b
         System.out.println("\n\nNúmero de vocales");
         System.out.println(numVocales("bcvghylñj0987++Ç")); //0
         System.out.println(numVocales("aePpprrrtt")); //2
         System.out.println(numVocales("ka")); //1
         System.out.println(numVocales("kak")); //1
         System.out.println(numVocales("AaEeIiOoUupppppppppppppp")); //10
      	
      	//Ejercicio 09
         System.out.println("\n\nNúmero de veces que aparece un carácter");
         System.out.println(numVecesChar("1234567890",'e')); //0
         System.out.println(numVecesChar("e234567890",'e')); //1
         System.out.println(numVecesChar("123456e890",'e')); //1
         System.out.println(numVecesChar("123456789e",'e')); //1
         System.out.println(numVecesChar("e23eee789e",'e')); //5
      	
      	//Ejercicio 10
         System.out.println("\n\nEliminador de espacios en blanco");
         System.out.println("abcde"+"//"+quitaEspacios("abcde"));
         System.out.println("    abcde"+"//"+quitaEspacios("    abcde"));
         System.out.println("abcde     "+"//"+quitaEspacios("abcde     "));
         System.out.println("ab   cde"+"//"+quitaEspacios("ab    cde"));
         System.out.println(" a b    c   d  e"+"//"+quitaEspacios(" a b    c   d  e"));
      
      	//Ejercicio 11
         System.out.println("\n\nCadenas al revés");
         cadena = "hola";System.out.println(cadena+"//"+reves(cadena));
         cadena = "que tal";System.out.println(cadena+"//"+reves(cadena));
         cadena = "123";System.out.println(cadena+"//"+reves(cadena));
         cadena = "12321";System.out.println(cadena+"//"+reves(cadena));
         cadena = "x-y-x";System.out.println(cadena+"//"+reves(cadena));
         cadena = "al re ves + * ";System.out.println(cadena+"//"+reves(cadena));
      
      	//Ejercicio 12
         System.out.println("\n\nCaracteres de cadenas a mayúscula");
         cadena = "xxxxyyyyzzzz";caracter='w';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
         cadena = "xxxxyyyyzzzz";caracter='x';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
         cadena = "xxxxyyyyzzzz";caracter='y';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
         cadena = "xxxxyyyyzzzz";caracter='z';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
         cadena = "xXxXyYYyyzZZZzz";caracter='x';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
         cadena = "xXxXyYYyyzZZZzz";caracter='y';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
         cadena = "xXxXyYYyyzZZZzz";caracter='z';System.out.println(cadena+","+caracter+"//"+charAMay(cadena,caracter));
      	
      	//Ejercicio 13
         System.out.println("\n\nVocales de un String a mayúscula");
         cadena = "hola";System.out.println(cadena+"//"+vocAMay(cadena));
         cadena = "bcgf";System.out.println(cadena+"//"+vocAMay(cadena));
         cadena = "aAeEiIoU";System.out.println(cadena+"//"+vocAMay(cadena));
         cadena = "aAbBcCUu";System.out.println(cadena+"//"+vocAMay(cadena));
      
      	//Ejercicio 14
         System.out.println("\n\nVocalización: sustituye vocales por un char dado");
         cadena = "aAbBeEzZ";caracter='#';System.out.println(cadena+","+caracter+"//"+vocalizacion(cadena,caracter));
         cadena = "aAeEiIoOuU";caracter='#';System.out.println(cadena+","+caracter+"//"+vocalizacion(cadena,caracter));
         cadena = "cabran";caracter='#';System.out.println(cadena+","+caracter+"//"+vocalizacion(cadena,caracter));
      	     
      	//Ejercicio 15
         System.out.println("\n\nGénero y número de palabras");
         cadena = "gato";System.out.println(cadena+"//"+generoYNumero(cadena));
         cadena = "gata";System.out.println(cadena+"//"+generoYNumero(cadena));
         cadena = "gatos";System.out.println(cadena+"//"+generoYNumero(cadena));
         cadena = "gatas";System.out.println(cadena+"//"+generoYNumero(cadena));
         cadena = "pez";System.out.println(cadena+"//"+generoYNumero(cadena));
         cadena = "verdes";System.out.println(cadena+"//"+generoYNumero(cadena));
         cadena = "hombre";System.out.println(cadena+"//"+generoYNumero(cadena));
      	
      	//Ejercicio 16
         System.out.println("\n\nQuitador de tildes");
         cadena = "áÁéÉíÍóÓúÚbBcCzZ";System.out.println(cadena+"//"+quitaTildes(cadena));
      	
      	//Ejercicio 17
         System.out.println("\n\nPalíndromos");
         cadena = "Allí si María avisa y así va a ir a mi silla";System.out.println(cadena+" // "+esPalindromo(cadena));
         cadena = "A la catalana banal atácala";System.out.println(cadena+" // "+esPalindromo(cadena));
         cadena = "Dábale arroz a la zorra el abad";System.out.println(cadena+" // "+esPalindromo(cadena));
         cadena = "Ésta no es palíndroma";System.out.println(cadena+" // "+esPalindromo(cadena));
         cadena = "Y ésta aún menos";System.out.println(cadena+" // "+esPalindromo(cadena));
      	
      }
   }