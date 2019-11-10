
public class CalculationOfWallpaper {

//    public static void main(String[] args) {
//        CalculationOfWallpaper calculationOfWallpaper=new CalculationOfWallpaper();
//        double heightRoom=5.0;
//        double widthRoom=7.0;
//        double lengthRoom=6.0;
//        double widthWallpaper=1.0;
//        double lengthWallpaper=10.0;
//
//    }

    public double countR(double lengthRoom, double widthRoom,double widthWallpaper, double lengthWallpaper, double heightRoom){
        double totalRolls=1.0;
        double perimetr=2*(lengthRoom+widthRoom);
        double countSheet=Math.ceil(perimetr/widthWallpaper);
        double countPerRoll=Math.floor(lengthWallpaper/(heightRoom));
        totalRolls=countSheet/countPerRoll;

        return totalRolls;
    }
}
