import java.util.Scanner;
public class Main {

    static void desen(int n) {

        if(n>0){
            System.out.print(n+ " ");

            desen(n-5);
        }
        System.out.print(n+" ");
    }

    public static void main(String[] args) {

        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        k=input.nextInt();
        desen(k);

    }
}
