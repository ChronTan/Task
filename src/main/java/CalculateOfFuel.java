import java.util.Scanner;

public class CalculateOfFuel {

    public static void main(String[] args) {
        CalculateOfFuel calculateOfFuel=new CalculateOfFuel();
        double countExpense=2.0;
        double countGasTank=100.0;
        double distance;
        distance=calculateOfFuel.calc(countExpense,countGasTank);
        String formattedDistance = String.format("%.1f", distance);
        System.out.println("Топлива хватит на "+ formattedDistance+ " км");

    }

    public double calc(double countExpence, double countGasTank){
        double distance;
        distance=countGasTank/countExpence;
        return distance;
    }
}
