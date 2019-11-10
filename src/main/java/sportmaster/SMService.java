package sportmaster;

public class SMService {

    private float costOfAllPurchases;
    private float costPurchases;
    private String levelCard;

    public SMService(float costOfAllPurchases, float costPurchases) {
        this.costOfAllPurchases = costOfAllPurchases;
        this.costPurchases = costPurchases;
    }

    public float getCostOfAllPurchases() {
        return costOfAllPurchases;
    }

    public void setCostOfAllPurchases(float costOfAllPurchases) {
        this.costOfAllPurchases = costOfAllPurchases;
    }

    public float getCostPurchases() {
        return costPurchases;
    }

    public void setCostPurchases(float costPurchases) {
        this.costPurchases = costPurchases;
    }

    public String getLevelCard() {
        return levelCard;
    }

    public void setLevelCard(String levelCard) {
        this.levelCard = levelCard;
    }

    public void levelCard(float cost){
        if(cost<=15000){
            levelCard="Standart";
        }else if(cost<=150000){
            levelCard="Silver";
        }else{
            levelCard="Gold";
        }
    }

    public float accounting(SMService sms){
        float bonus=0;
        switch (sms.levelCard){
            case "Standart":
                bonus=(float)Math.floor(costPurchases/1000)*50;
                break;
            case "Silver":
                bonus=(float)Math.floor(costPurchases/1000)*70;
                break;
            case "Gold":
                bonus=(float)Math.floor(costPurchases/1000)*100;
                break;
        }

        return bonus;
    }
}
