import java.util.Scanner;

public class star {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Integer i,z,x;
        for(x=1;x<=2;x++) {
            for (z = 1; z <= 3; z++) {
                for (i = 1; i <= 5; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
