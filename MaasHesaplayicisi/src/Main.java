import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee("Damla",2000,45,1985);

        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.string();


    }
}