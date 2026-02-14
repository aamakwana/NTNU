package oving5.oppg1;

public class TestKlient {
  public static void main(String[] args) {

    Brok A1 = new Brok(1, 2);
    Brok A2 = new Brok(3, 4);
    Brok B2 = new Brok(5);

    System.out.println("Start:");
    System.out.println("A1 = " + A1.getTeller() + "/" + A1.getNevner());
    System.out.println("A2 = " + A2.getTeller() + "/" + A2.getNevner());
    System.out.println("B2 = " + B2.getTeller() + "/" + B2.getNevner());

    System.out.println("\nAfter addition:");
    A1.add(A2);
    System.out.println("A1 = " + A1.getTeller() + "/" + A1.getNevner());

    System.out.println("\nAfter subtraction:");
    A1.subtract(A2);
    System.out.println("A1 = " + A1.getTeller() + "/" + A1.getNevner());

    System.out.println("\nAfter multiplication:");
    A1.multiply(A2);
    System.out.println("A1 = " + A1.getTeller() + "/" + A1.getNevner());

    System.out.println("\nAfter division:");
    A1.divide(A2);
    System.out.println("A1 = " + A1.getTeller() + "/" + A1.getNevner());
  }
}


