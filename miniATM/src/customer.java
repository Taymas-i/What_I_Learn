public class customer {

private int pin;
private double balance;

public customer(int pin,double balance){
    this.pin=pin;
    this.balance=balance;
}
public boolean pinDogrulama(int enterpin){
    return pin==0352;
}

public double checkBalance(){
    return balance;
}

public void paracekme(double Miktar){
    if (Miktar>balance){
        System.out.println("Yetersiz miktar");
    }
    else{
        System.out.println("Paranızı aşşağadan alabilirsiniz");
        balance-=Miktar;
        System.out.println("Paranız başarıyla çekildi" + Miktar + "TL");
    }
}
public  void parayatir(double Yatir){
    balance+=Yatir;
    System.out.println("paraniz basariyla yatirilmistir" + Yatir + "TL");
}



}
