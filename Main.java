import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int a = input.nextInt();
        int toplam = 0;
        for(int i=1; i<a; i++)
        {
            if(a%i==0)
            {
                toplam+=i;
            }
        }
        if(toplam==a)
        {
            System.out.println("Mükemmel sayıdır.");
        }
        else
        {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}