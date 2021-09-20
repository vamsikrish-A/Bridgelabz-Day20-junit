package com.practice;

public class Demo {
    //junit5 in intelliJ(BrainFraser)
    private String liquidType;
    private double percentageFull;

    public Demo(String liquidType, double percentageFull) {
        this.liquidType = liquidType;
        this.percentageFull = percentageFull;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getPercentageFull() {
        return percentageFull;
    }

    public void setPercentageFull(double percentageFull) {
        this.percentageFull = percentageFull;
    }
}
