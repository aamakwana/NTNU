package oving4.oppg1;

public class Valuta {
  private String navn;
  private double kurs;

  public Valuta(String navn, double kurs) {
    this.navn = navn;
    this.kurs = kurs;
  }
  public double tokroner(double beløp){
    return beløp*kurs;
  }
  public double fromkroner(double beløp){
    return beløp/kurs;

  }
  public String getNavn() {
    return navn;
  }
}

