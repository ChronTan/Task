package Sportmaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SMServiceTest {

    @Test
    void testingNameLevel() {
        SMService smService = new SMService(10_000_000,1_000);
        float cost=smService.getCostOfAllPurchases();
        smService.levelCard(cost);
        assertEquals("Gold",smService.getLevelCard());

    }
}