//INCAPSULATION
//using of get elemnt .
class ATM {
    private int TotalBalance = 10000;

    public void getTotalBalance() {
        System.out.println("Total Balance: " + TotalBalance);
    }

    public void setTotalBalance(int amount) {
        if (amount > 0) {
            TotalBalance += amount;
            System.out.println("Amount " + TotalBalance + " is now Balance");
        }
    }
    public void setBalance(int amount) {
        if(amount<=TotalBalance) {
            TotalBalance -= amount;
            System.out.println("Amount " + TotalBalance + " is now Balance");
        }


    }
}
public class c14 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getTotalBalance();
        atm.setTotalBalance(1000);
       atm.setBalance(1000);
    }
}
