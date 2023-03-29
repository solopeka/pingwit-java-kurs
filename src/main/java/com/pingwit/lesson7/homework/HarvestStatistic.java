package com.pingwit.lesson7.homework;
/*Создайте класс HarvestStatistic
String plant - название растения
BigDecimal totalWeight - общий вес урожая со всех полей*/
public class HarvestStatistic {

    private String plant;
    private double totalWeight;

    public HarvestStatistic(String plant, double weight){
        this.plant = plant;
    }

    public HarvestStatistic(double totalWeight){
        this.totalWeight = totalWeight;
    }

    public static void main(String[] args) {

        Harvest[] arr = new Harvest[16];

        arr[0] = new Harvest(1, "1", "rye", 51 );
        arr[1] = new Harvest(2, "1", "wheat", 15.25 );
        arr[2] = new Harvest(3, "1", "strawberries", 18.36 );
        arr[3] = new Harvest(4, "1", "potatoes", 13.12 );
        arr[4] = new Harvest(5, "2", "rye", 84.01 );
        arr[5] = new Harvest(6, "2", "wheat", 18.33 );
        arr[6] = new Harvest(7, "2", "strawberries", 28.03 );
        arr[7] = new Harvest(8, "2", "potatoes", 20.18 );
        arr[8] = new Harvest(9, "3", "rye", 15 );
        arr[9] = new Harvest(10, "3", "wheat", 65.23 );
        arr[10] = new Harvest(11, "3", "strawberries", 34.27 );
        arr[11] = new Harvest(12, "3", "potatoes", 99 );
        arr[12] = new Harvest(13, "4", "rye", 58 );
        arr[13] = new Harvest(14, "4", "wheat", 63.10 );
        arr[14] = new Harvest(15, "4", "strawberries", 73 );
        arr[15] = new Harvest(16, "4", "potatoes", 70 );

        HarvestStatistic[] rye = new HarvestStatistic[4];

        rye[0] = new HarvestStatistic("Rye1", arr[0].getWeight());
        rye[1] = new HarvestStatistic("Rye2", arr[4].getWeight());
        rye[2] = new HarvestStatistic("Rye3", arr[8].getWeight());
        rye[3] = new HarvestStatistic("Rye4", arr[12].getWeight());

        double totalWeight1 = rye.length;
        for (HarvestStatistic num: rye) {
            totalWeight1 = arr[0].getWeight() + arr[4].getWeight() + arr[8].getWeight() + arr[12].getWeight();
        }

        HarvestStatistic[] wheat = new HarvestStatistic[4];

        wheat[0] = new HarvestStatistic("Wheat1", arr[1].getWeight());
        wheat[1] = new HarvestStatistic("Wheat2", arr[5].getWeight());
        wheat[2] = new HarvestStatistic("Wheat3", arr[9].getWeight());
        wheat[3] = new HarvestStatistic("Wheat4", arr[13].getWeight());

        double totalWeight2 = wheat.length;
        for (HarvestStatistic num: wheat) {
            totalWeight2 = arr[1].getWeight() + arr[5].getWeight() + arr[9].getWeight() + arr[13].getWeight();
        }

        HarvestStatistic[] strawberries = new HarvestStatistic[4];

        strawberries[0] = new HarvestStatistic("Strawberries1", arr[2].getWeight());
        strawberries[1] = new HarvestStatistic("Strawberries2", arr[6].getWeight());
        strawberries[2] = new HarvestStatistic("Strawberries3", arr[10].getWeight());
        strawberries[3] = new HarvestStatistic("Strawberries4", arr[14].getWeight());

        double totalWeight3 = strawberries.length;
        for (HarvestStatistic num: strawberries) {
            totalWeight3 = arr[2].getWeight() + arr[6].getWeight() + arr[10].getWeight() + arr[14].getWeight();
        }

        HarvestStatistic[] potatoes = new HarvestStatistic[4];

        potatoes[0] = new HarvestStatistic("Potatoes1", arr[3].getWeight());
        potatoes[1] = new HarvestStatistic("Potatoes2", arr[7].getWeight());
        potatoes[2] = new HarvestStatistic("Potatoes3", arr[11].getWeight());
        potatoes[3] = new HarvestStatistic("Potatoes4", arr[15].getWeight());

        double totalWeight4 = potatoes.length;
        for (HarvestStatistic num: potatoes) {
            totalWeight4 = arr[3].getWeight() + arr[7].getWeight() + arr[11].getWeight() + arr[15].getWeight();
        }

        System.out.println(totalWeight1);

    }



//    public static double totalWeight(double ... rye){
//        double sum = rye.length;
//        for (double num: rye) {
//            sum = ;
//        }
//        return sum;
//    }

    public String getPlant(){
        return plant;
    }
    public void setPlant(String plant){
        this.plant = plant;
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "Harveststatistic: [" + "Plant: " + plant + ", Totalweight: " + totalWeight + ";]";
    }

}
