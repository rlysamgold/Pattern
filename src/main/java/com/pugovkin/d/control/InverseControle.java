package com.pugovkin.d.control;

/**
 * Created by Abrite on 01.11.15.
 */
public class InverseControle extends AbstractControl {
    @Override
    public Integer pow(Integer operationNumber) {
        return (int) Math.sqrt(operationNumber);
    }

    @Override
    public Integer sqrt(Integer operationNumber) {
        return operationNumber * operationNumber;
    }

    @Override
    public double quub(Integer operationNumber) {
        return Math.sqrt((int) Math.sqrt(operationNumber));

    }
}
