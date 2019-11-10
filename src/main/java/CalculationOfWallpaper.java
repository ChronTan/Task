import java.util.Scanner;

public class CalculationOfWallpaper {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите высоту комнаты: ");
        float heightRoom=sc.nextFloat();
        System.out.println("Введите ширину комнаты: ");
        float widthRoom=sc.nextFloat();
        System.out.println("Введите длину комнаты: ");
        float lengthRoom=sc.nextFloat();
        System.out.println("Введите ширину обоев: ");
        float widthWallpaper=sc.nextFloat();
        System.out.println("Введите длину обоев: ");
        float lengthWallpaper=sc.nextFloat();
        float perimetr=2*(lengthRoom+widthRoom);
        System.out.println("perimetr: "+perimetr);
        double countSheet=Math.ceil(perimetr/widthWallpaper);
        System.out.println("countSheet: "+countSheet);
        double countPerRoll=Math.floor(lengthWallpaper/(heightRoom));
        System.out.println("количество из одного рулона: "+countPerRoll);
        double totalRolls=countSheet/countPerRoll;
        System.out.println("Total rolls: "+totalRolls);

    }
}
