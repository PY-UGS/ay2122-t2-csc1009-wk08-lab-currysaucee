import java.io.*;
import java.util.*;

class UserDefinedException2 extends Exception{ public UserDefinedException2(String message){ super(message); } }

class CheckingAccount{
    private float balance;
    private String accountNum;

    public void deposit(float value) throws UserDefinedException2{ 
        if(value<=0){ throw new UserDefinedException2("Value is negative or zero!"); }
        this.balance+= value; 
    }
    public void withdraw(float value) throws UserDefinedException2{
        if(value<=0){ throw new UserDefinedException2("Value is negative or zero!"); }
        if(this.balance<value){ throw new UserDefinedException2("Sorry, but your account is short by:$" + (value-this.getBalance())); }
        this.balance-= value; 
    }
    public float getBalance(){ return this.balance; }
    public String getNumber(){ return this.accountNum; }
}

public class qns2 {
    public static void main(String[] args) throws UserDefinedException2{
        CheckingAccount obj = new CheckingAccount();        
        Scanner scan = new Scanner(System.in);
        int choice=-1;
        float value;
        while(choice!=0){
            System.out.println("Welcome to the Bank!\n[1]Deposit\n[2]Withdraw\n[3]Check Balance\n[0]Exit");
            choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1:
                    System.out.print("How much do you want to deposit:");
                    value = scan.nextFloat();
                    obj.deposit(value);
                    break;
                case 2:
                    System.out.print("How much do you want to withdraw:");
                    value = scan.nextFloat();
                    obj.withdraw(value);
                    break;
                case 3:
                    System.out.println("You have:$" + obj.getBalance());
                    break;
            }
        }
        System.out.println("Thank you for banking with us");
        

    }    
}
