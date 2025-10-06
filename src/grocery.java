import java.util.ArrayList;
import java.util.Scanner;
public class grocery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String[] grocery = new String[100];
    int count = 0;
    while (count < grocery.length) {
System.out.println("Add item (x = exit)");
String item  = in.nextLine(); 
         if (item.equalsIgnoreCase("x")) {
         break;
         }
         grocery[count] = item;
         count++;
    }
    for (int i= 0; i < count; i++)
System.out.println(grocery[i] + " ");
}
}
