package oving6;

public class Matrise {
  private int[][] matrise;  //det blir laget 2D matrise

  // Constructor
  public Matrise(int[][] matrise) {
    this.matrise = matrise;
  }

  // Get number of rows
  public int getAntallRader() { //rad
    return matrise.length;
  }

  // Get number of columns
  public int getAntallKolonner() {//kolonner
    return matrise[0].length;
  }

  // Addition
  public Matrise addere(Matrise annen) {
    // Sjekker samme dimesjoner så det blir ikke en m 2x3 og den anden 3x2
    if (this.getAntallRader() != annen.getAntallRader() ||
        this.getAntallKolonner() != annen.getAntallKolonner()) {
      return null;  // Impossible
    }

    // Create new matrix for result
    int[][] resultat = new int[this.getAntallRader()][this.getAntallKolonner()];

    // Add each element
    for (int i = 0; i < this.getAntallRader(); i++) {
      for (int j = 0; j < this.getAntallKolonner(); j++) {
        resultat[i][j] = this.matrise[i][j] + annen.matrise[i][j];
      }
    }

    return new Matrise(resultat);
  }

  // Multiplication
  public Matrise multiplisere(Matrise annen) {
    // Check if multiplication is possible
    if (this.getAntallKolonner() != annen.getAntallRader()) { ////tallet av kollonner første matrisen må være lik andre mtriser rade
      return null;  // Impossible
    }

    // Create new matrix for result
    int[][] resultat = new int[this.getAntallRader()][annen.getAntallKolonner()];

    // Multiply
    for (int i = 0; i < this.getAntallRader(); i++) {//se på rad av først matrise
      for (int j = 0; j < annen.getAntallKolonner(); j++) {  //kolonne av andre matrise
        for (int k = 0; k < this.getAntallKolonner(); k++) { //
          resultat[i][j] += this.matrise[i][k] * annen.matrise[k][j];
        }
      }
    }

    return new Matrise(resultat);
  }

  // Transpose flip rows f.eks 2 rows x 3 kolonne da blir  3rad x 2 kolonne
  public Matrise transponere() {
    // Create new matrix with flipped dimensions
    int[][] resultat = new int[this.getAntallKolonner()][this.getAntallRader()];

    // Flip rows and columns
    for (int i = 0; i < this.getAntallRader(); i++) {
      for (int j = 0; j < this.getAntallKolonner(); j++) {
        resultat[j][i] = this.matrise[i][j];
      }
    }

    return new Matrise(resultat);
  }

  // Print matrix (helper method)
  public void skrivUt() {
    for (int i = 0; i < matrise.length; i++) {
      for (int j = 0; j < matrise[i].length; j++) {
        System.out.print(matrise[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
