import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int balance = 10000;

System.out.print("Enter PIN: ");
String pin = sc.next();

if (pin.equals("1234")) {
System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit");
int ch = sc.nextInt();

if (ch == 1)
System.out.println("Balance: " + balance);

else if (ch == 2) {
System.out.print("Enter amount: ");
int amt = sc.nextInt();

if (amt <= balance && amt % 100 == 0) {
balance -= amt;
System.out.println("Withdraw Successful");
} else
System.out.println("Invalid Transaction");
}

else if (ch == 3) {
System.out.print("Enter amount: ");
int amt = sc.nextInt();

if (amt % 100 == 0 && amt < 40000) {
balance += amt;
System.out.println("Deposit Successful");
} else
System.out.println("Invalid Amount");
}

else
System.out.println("Invalid Choice");
} else {
System.out.println("Incorrect PIN");
}

sc.close();
}
}