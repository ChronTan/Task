import java.util.Scanner;

public class CalculateOfFuel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введетите расход топлива на 100 км: ");
        float countExpense=sc.nextInt();
        System.out.println("Введетите размер бензобака: ");
        float countGasTank=sc.nextInt();
        float distance;
        distance=countGasTank/countExpense;
        String formattedDistance = String.format("%.1f", distance);
        System.out.println("Топлива хватит на "+ formattedDistance+ " км");

    }
}
