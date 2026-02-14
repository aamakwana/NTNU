package oving6;


import java.util.Random;

public class RandomGenerator {
  public static void main(String[]args){
    Random random= new java.util.Random();

    int[] antall=new int[10]; //intervall


    for(int i=0;i<1000;i++) {
      int number = random.nextInt(10);
      antall[number]++;
    }
    for(int i=0;i<10;i++) {
      System.out.println("Tallet "+ i  +"har kommet" +antall[i]+ "ganger");
    }






  }


}

