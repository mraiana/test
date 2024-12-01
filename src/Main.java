//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a-b;
            System.out.println("Результат: " + c);
        }
        catch (ArithmeticException e) {
            //throw new ArithmeticException("Делить на ноль нельзя");
            System.out.println("Делить на ноль нельзя");
        }
        System.out.println("The end");

    }
}