package Java_study;

public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("Jane","Smith");
        //连续操作
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户："+bank.getCustomer(0).getFirstname()+","+bank.getCustomer(0).getLastname()+"的余额为"+balance);
    }
}
