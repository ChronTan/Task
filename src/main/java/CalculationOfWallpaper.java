
public class CalculationOfWallpaper {


    public double countR(double lengthRoom, double widthRoom,double widthWallpaper, double lengthWallpaper, double heightRoom){
        double totalRolls=1.0;
        double perimetr=2*(lengthRoom+widthRoom);
        double countSheet=Math.ceil(perimetr/widthWallpaper);
        double countPerRoll=Math.floor(lengthWallpaper/(heightRoom));
        totalRolls=countSheet/countPerRoll;

        return totalRolls;
    }
}
