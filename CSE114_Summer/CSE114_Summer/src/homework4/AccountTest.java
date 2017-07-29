package homework4;

//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 4: Account Class testing





public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount acct1 = new CheckingAccount(1122, 20000.0, 4.5);

        acct1.withdraw(1200);
        acct1.deposit(3000);

     
        
        System.out.println(acct1);
        
        
        SavingsAccount acct2 = new SavingsAccount(1000, 7000.00, 3.4);
        
        acct2.withdraw(7001);
        acct2.deposit(43);
        
        System.out.println(acct2);
    }
    
}
