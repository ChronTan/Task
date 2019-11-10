package Sportmaster;

public class SportMaster {
    public static void main(String[] args) {
        SMService smService = new SMService(25000,7200);
//        SMService smService = new SMService(25000,700,"silver");
//        SMService smService = new SMService(25000,700,"gold");
        smService.levelCard(smService.getCostOfAllPurchases());
        System.out.println(smService.accounting(smService));


    }
}
