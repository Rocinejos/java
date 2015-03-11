package prog.ud12.ejercicios.ej03;

public class Translator {
    public String translate(String word) {
       String palabra=null;
       switch (word) {
          case "hola":palabra="hello";
             break;
          case "adios":palabra="bye";
             break;
          default:palabra="unknown";
             break;
       }
       return palabra;
    }
 }
