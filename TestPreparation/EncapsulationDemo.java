
class Bank_Account {
    private String ano, name;
    private double balance;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }

    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Balance After withdraw: " + balance);
        } else {
            System.out.println("with draw not possible");
        }
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account();
        b.setAno("11111100034");
        b.setName("Chidu");
        b.setBalance(10000);
        b.deposit(2000);
        b.withdraw(4000);

    }
}
