import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        for (int i=a; i<=b;i++){
            if(i%d==c){
                System.out.print(i+" ");
            }
        }
    }
}
