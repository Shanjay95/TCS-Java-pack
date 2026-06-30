import java.util.Scanner;

public class BinaryToInt {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String binary = sc.next();

int num = Integer.parseInt(binary, 2);
System.out.println(num);
}
}