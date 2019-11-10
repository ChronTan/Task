import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationOfWallpaperTest {

    @Test
    void countRolls() {
        CalculationOfWallpaper calculationOfWallpaper=new CalculationOfWallpaper();
        double result=calculationOfWallpaper.countR(5.0,7.0,1.0,10.0,4.0);
        assertEquals(12,result);
    }
}