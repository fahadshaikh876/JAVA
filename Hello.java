import java.io.*;
import java.util.*;

class Account {
    private String title;
    private int balance;

    Account() {
        title = "";
        balance = 0;
    }

    Account(String s, int b) {
        this.title = s;
        this.balance = b;
    }

    protected int getBalance() {
        return balance;
    }

    protected void showDetails() {
        System.out.print("title: " + title + ", Balance: " + balance);
        // System.out.println();
    }

}

class SavingAccount extends Account{
    private int profitRatio;
    
    SavingAccount(String s, int b, int p){
        super(s, b);
      this.profitRatio = p;
      
    }
    protected void showDetails(){
      super.showDetails();
      System.out.println(", Profit: "+profitRatio);
      
    }
     
  }


  
class LoanAccount extends Account{
    protected int intestrate;
    LoanAccount(String s, int b, int i){
      super(s, b);
      this.intestrate = i;
    }
     protected void showDetails(){
      super.showDetails();
      System.out.println(", Interests: "+intestrate);
      
    }
  }

public class Hello {

   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        int c = 0;
        while (c<(inp*3)) {
          // System.out.println(scan.next());
          String a = scan.nextLine();
          
          int x = scan.nextInt();
          int y = scan.nextInt();
          if (x>0){
            SavingAccount s1 = new SavingAccount(a, x, y);
            s1.showDetails();
          }
          else{
              LoanAccount l1 = new LoanAccount(a, x, y);
            l1.showDetails();
          }
          c+=1;
        }
        
    }
}