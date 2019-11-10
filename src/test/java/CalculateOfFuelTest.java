import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateOfFuelTest {

    @Test
    void countDistance() {
        CalculateOfFuel calculateOfFuel = new CalculateOfFuel();
        double countExpense=10.0;
        double countGasTank=100.0;
        double distance;
        distance=calculateOfFuel.calc(countExpense,countGasTank);
        assertEquals(10,distance);

    }
}