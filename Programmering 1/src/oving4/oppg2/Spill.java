package oving4.oppg2;
import java.util.Random;

public class Spill {
  //variables
  Random rand = new Random();
  private int sumPoeng;
  private Random terning;

  public Spill() {
    this.sumPoeng = 0;
    this.terning = terning;

  }

  public int getSumPoeng() {
    return sumPoeng;
  }

  public void kastTerning() {
    int kast = rand.nextInt(6) + 1; //rand.nextint(6) give 5 therefore add 1
    if (kast == 1) {
      sumPoeng += 0;
    } else {
      sumPoeng++;
    }

  }

  public boolean erFerdig() {
    if (sumPoeng> 100) {
      return true;
    } else {
      return false;

    }


  }
}
