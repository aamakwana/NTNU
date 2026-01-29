package oving4.oppg1;

public class Valuta {
  private String navn;
  private double kurs;

  public Valuta(String navn, double kurs) {
    this.navn = navn;
    this.kurs = kurs;
  }
  public double tokroner(double beløp){
    if(beløp < 0){
      throw new IllegalArgumentException("Beløpet kan ikke være negativt");

    }
    return beløp*kurs;
  }
  public double fromkroner(double kroner) {
    if (kroner < 0) {
      throw new IllegalArgumentException("Beløpet kan ikke være negativt");
    }

      return kroner / kurs;

  }
    public String getNavn () {
      return navn;
    }
  }

