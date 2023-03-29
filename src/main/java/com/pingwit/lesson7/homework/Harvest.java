package com.pingwit.lesson7.homework;

public class Harvest {

    /*Task 1
Создайте класс Harvest, в котором будут храниться данные об урожае на ферме.
У Harvest есть поля
Long id - уникальный идентификатор
String field - название поля, с которого был собран урожай (урожаев за год может быть несколько собрано с одного поля)
String plant - название растения (рожь, пшеница, клубника, картошечка и т.д.)
BigDecimal weight - вес собранного урожая

Создайте класс HarvestStatistic
String plant - название растения
BigDecimal totalWeight - общий вес урожая со всех полей

Создайте класс HarvestStatisticService, добавьте классу метод, который будет получать аргументом массив Harvest[],
а возвращать массив HarvestStatistic[] с посчитанной статистикой.

Внутри метода посчитайте статистику для каждого растения:
- общий вес урожая для каждого растения*/
    private long id;
    private String field;

    private String plant;

    private double weight;

    public Harvest (long id, String field, String plant, double weight){
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    

    @Override
    public String toString() {
        return "Harvest: [ " + "id: " + id + ", field: " + field + ", plant: " + plant + ", weight: " + weight + ";]";
    }
}
