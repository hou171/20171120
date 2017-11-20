import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a,b;
        for(a=1;a<=5;a++){
            for(b=5;b>=a;b--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
