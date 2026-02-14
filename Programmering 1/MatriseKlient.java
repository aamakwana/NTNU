public class MatriseKlient {
    public static void main(String[] args) {
        // Create two matrices
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] data2 = {{7, 8, 9}, {10, 11, 12}};

        Matrise m1 = new Matrise(data1);
        Matrise m2 = new Matrise(data2);

        System.out.println("Matrise 1:");
        m1.skrivUt();

        System.out.println("Matrise 2:");
        m2.skrivUt();

        // Test addition
        System.out.println("Addisjon (m1 + m2):");
        Matrise sum = m1.addere(m2);
        if (sum != null) {
            sum.skrivUt();
        } else {
            System.out.println("Addisjon ikke mulig");
        }

        // Test multiplication
        System.out.println("Multiplikasjon (m1 × m2):");
        Matrise produkt = m1.multiplisere(m2);
        if (produkt != null) {  //m1 wont work since columns of first (3) must equal rows of second (2)
            produkt.skrivUt();
        } else {
            System.out.println("Multiplikasjon ikke mulig");
        }

        // Test transpose
        System.out.println("Transponering av m1:");
        Matrise transponert = m1.transponere();
        transponert.skrivUt();

        // Test multiplication with compatible matrices
        System.out.println(" Test med compatible matriser ");
        int[][] data3 = {{1, 2}, {3, 4}};
        int[][] data4 = {{5, 6}, {7, 8}};

        Matrise m3 = new Matrise(data3);
        Matrise m4 = new Matrise(data4);

        System.out.println("Matrise 3:");
        m3.skrivUt();

        System.out.println("Matrise 4:");
        m4.skrivUt();

        System.out.println("Multiplikasjon (m3 × m4):");
        Matrise produkt2 = m3.multiplisere(m4);
        if (produkt2 != null) {
            produkt2.skrivUt();
        }
    }
}

