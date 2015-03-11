   class ArgsException extends Exception {
   }

   public class Calculadora {
      public static void main(String[] args) {
         try {
            if (args.length != 3) {
               throw new ArgsException();
            }
         
            double op1 = Double.parseDouble(args[1]); 
            double op2 = Double.parseDouble(args[2]);
         
            switch (args[0]) {
               case "suma":
                  System.out.println(op1+op2);
                  break;
               case "resta":
                  System.out.println(op1-op2);
                  break;
               case "mul":
                  System.out.println(op1*op2);
                  break;
               case "div":
                  System.out.println(op1/op2);
                  break;
               default:throw new ArgsException();
            }
         
            System.out.println();
         }
            catch (ArgsException e) {
               System.out.println("Usage: java Calculadora {suma | resta | mul |div} <operando1> <operando2>");
            }
      }
   }