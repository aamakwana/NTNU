package oving4.oppg1;

import java.util.Scanner;

public class Main {
  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      //Create objects
      Valuta dollar=new Valuta("Dollar",10.5);
      Valuta euro=new Valuta("Euro",11.5);
      Valuta pound=new Valuta("Pound",13.5);



      boolean isRunning=true;
      while(isRunning){
        System.out.println("*************");
        System.out.println("Velg Valuta:");
        System.out.println("1:Dollar");
        System.out.println("2:Euro");
        System.out.println("3:Pounds");
        System.out.println("4:Avslutt");
        int choice = scanner.nextInt();

        Valuta valgtValuta=null;

        switch(choice){
          case 1 -> valgtValuta=dollar;
          case 2->valgtValuta=euro;
          case 3-> valgtValuta=pound;
          case 4-> isRunning=false;
          default-> System.out.println("Ugyldig valg");
        }


      }
}
