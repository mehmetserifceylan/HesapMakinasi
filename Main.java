import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz:");
        num1=input.nextInt();
        System.out.println("2. Sayıyı Giriniz:");
        num2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        int select=input.nextInt();
        switch (select){
            case 1:{
                System.out.println(num1+num2);
                break;
            }
            case 2:{
                System.out.println(num1-num2);
                break;
            }
            case 3:{
                System.out.println(num1*num2);
                break;
            }
            case 4:{
                if (num2!=0){
                    System.out.println(num1/num2);
                }
                else {
                    System.out.println("Sayı Sıfıra Bölünemez.");
                }
                break;
            }
            default:{
                System.out.println("Lütfen Geçerli bir işlem giriniz.");
                break;
            }


        }
    }
}