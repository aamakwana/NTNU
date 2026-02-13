package oving4.oppg2;

public class Main {
  public static void main(String[] args) {
    //have players a and b
    Spill spillerA = new Spill();
    Spill spillerB = new Spill();
    int runde = 1;

    while (!spillerA.erFerdig() && !spillerB.erFerdig()) {
      spillerA.kastTerning();
      spillerB.kastTerning();

      System.out.println("Runde " + runde);
      System.out.println("Spiller A fikk " + spillerA.getSumPoeng());
      System.out.println("Spiller B fikk " + spillerB.getSumPoeng());
      runde++;




    }
    if (spillerA.erFerdig()) {
      System.out.println("Spiller A vant " + spillerA.getSumPoeng());
    } else {
      System.out.println("Spiller B vant " + spillerB.getSumPoeng());

    }



  }
}

