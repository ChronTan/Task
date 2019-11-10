package sportmaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SMServiceTestAccounting {

    @Test
    void accounting() {
        SMService smService = new SMService(10_000,1_500);
        smService.levelCard(smService.getCostOfAllPurchases());
        float result=smService.accounting(smService);
        assertEquals(50,result);


    }
}