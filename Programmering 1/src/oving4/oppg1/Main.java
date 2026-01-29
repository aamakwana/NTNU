package oving4.oppg1;



import java.util.InputMismatchException;
import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      //Create objects
      Valuta dollar = new Valuta("Dollar", 10.5);
      Valuta euro = new Valuta("Euro", 11.5);
      Valuta pound = new Valuta("Pound", 13.5);


      boolean isRunning = true;
      while (isRunning) {
        System.out.println("*************");
        System.out.println("Velg Valuta:");
        System.out.println("1:Dollar");
        System.out.println("2:Euro");
        System.out.println("3:Pounds");
        System.out.println("4:Avslutt");


        Valuta valgtValuta = null;
        try{
          int choice=Integer.parseInt(scanner.next());
          switch (choice) {
            case 1 -> valgtValuta = dollar;
            case 2 -> valgtValuta = euro;
            case 3 -> valgtValuta = pound;
            case 4 -> isRunning = false;
            default -> throw new IllegalArgumentException("Ugyldig valg");
          }

        }catch(NumberFormatException e){
          System.out.println("Ugyldig valg");
          scanner.nextLine();
          continue;
        }catch(IllegalArgumentException e){
          System.out.println(e.getMessage());

        }

        if(!isRunning|| valgtValuta==null) continue;
        System.out.println("Trykk på hvilken valuta vil du bruke:");
        System.out.println("1: kroner til " + valgtValuta.getNavn() );
        System.out.println("2: " + valgtValuta.getNavn()+ " til kroner");

        int t;
        try {
          t = scanner.nextInt();
        }catch(InputMismatchException e){
          System.out.println("Ugyldig valg");
          scanner.next();
          continue;
        }
          if (t == 1) {
            try {
              System.out.print("Beløp i kroner: ");
              double beløp = scanner.nextDouble();
              System.out.println("I " + valgtValuta.getNavn() + ":" + valgtValuta.fromkroner(beløp));
            }catch(InputMismatchException e){
              System.out.println("Ugyldig valg");
              scanner.next();
            }catch(IllegalArgumentException e){
              System.out.println(e.getMessage());
            }


          } else if (t == 2) {
            try {
              System.out.print("Beløp: ");
              double b = scanner.nextDouble();
              System.out.println("I kroner" + valgtValuta.tokroner(b));
            }catch(InputMismatchException e){
              System.out.println("Ugyldig valg");
            }catch(IllegalArgumentException e){
              System.out.println(e.getMessage());
            }


          } else {
            System.out.println("Ugyldig valg");
          }
      }
      scanner.close();
          }





      }


