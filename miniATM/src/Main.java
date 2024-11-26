import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("TAYMAS BANK ATM'SİNE HOŞ GELDİNİZ");
        Scanner scanner = new Scanner(System.in);
        customer customer =new customer(0352,1000);

        System.out.println("Lütfen şifrenizi giriniz");
        int enterPin= scanner.nextInt();
        if (customer.pinDogrulama(enterPin)){
            int N;
            do {
                System.out.println("1. Bakiye sorgulama");
                System.out.println("2. Para çekme");
                System.out.println("3. para yatırma");
                System.out.println("4. çıkış");
                System.out.println("Seçiniz: ");
                N= scanner.nextInt();
            switch (N){
                case 1:
                    System.out.println("Bakiyeniz: "+ customer.checkBalance());
                break;
                case 2:
                    System.out.println("Çekmek istediğiniz miktar");
                    double Miktar = scanner.nextDouble();
                    customer.paracekme(Miktar);
                    break;
                case  3:
                    System.out.println("Lutfen paranızı koyunuz");
                    double Yatir = scanner.nextDouble();
                    customer.parayatir(Yatir);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("geçersiz seçenek tekrar deneyiniz");
            }
            }while (N != 4);
        }
        else {
            System.out.println("Yanlis pin");
        }
        scanner.close();
    }
}