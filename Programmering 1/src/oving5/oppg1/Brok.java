package oving5.oppg1;

public class Brok {
  private int teller;
  private int nevner;

  public Brok(int teller, int nevner) {
    if(nevner == 0){
      throw new IllegalArgumentException("Nevner kan ikke være 0");

    }
      this.teller = teller;
      this.nevner = nevner;


  }
  public Brok(int teller){
    this(teller, 1);
    }

    //getters
  public int getNevner() {
     return nevner;
  }
  public int getTeller() {
    return teller;
  }
  public void add(Brok annen) {
    int nyTeller = teller*annen.getNevner()+nevner*annen.getTeller();
    int nyNevner = nevner*annen.getNevner();

    teller = nyTeller;
    nevner = nyNevner;

  }
  public void subtract(Brok annen) {
    int nyTeller = teller*annen.getNevner()-nevner*annen.getTeller();;
    int nyNevner = nevner*annen.getNevner();
    teller = nyTeller;
    nevner = nyNevner;

  }
  public int multiply(Brok annen) {
    int nyTeller = teller*annen.getTeller();
    int nyNevner = nevner*annen.getNevner();
    teller = nyTeller;
    nevner = nyNevner;
    return nyTeller;
  }
  public void divide(Brok annen) {
    int nyTeller = teller*annen.getNevner();
    int nyNevner = nevner*annen.getTeller();
    teller = nyTeller;
    nevner = nyNevner;
  }
}


