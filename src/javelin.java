import java.util.Scanner;

public class javelin {
    public static void main(String[] args) throws Exception { 
        double i;
        double i1;
        double i2;
        int j;
    Scanner in = new Scanner(System.in);
    System.out.println("Throw length");
    i= Double.parseDouble(in.nextLine());
    System.out.println("Throw length");
    i1 = Double.parseDouble(in.nextLine());
    System.out.println("Throw length");
    i2= Double.parseDouble(in.nextLine());
    double[] javelinThrows = new double [4];
    javelinThrows[1] = i;
    javelinThrows[2] = i1;
    javelinThrows[3] = i2;
    for (j=1; j<4; j++)
    System.out.println("Throws" + (j) + ":" + javelinThrows[j]);
    
    }
}
