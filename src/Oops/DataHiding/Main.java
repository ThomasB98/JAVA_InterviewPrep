package Oops.DataHiding;
class Account{
    private double balance;
    public double getBalane(){
        return balance=1000.0d;
    }
}
public class Main {
    public static void main(String[] args) {
        Account a=new Account();
        System.out.println(a.getBalane());
    }
}