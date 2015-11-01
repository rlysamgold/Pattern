package com.pugovkin.d.model;

/**
 * Created by Abrite on 01.11.15.
 */
public class Model {

    private Integer inputNumber;
    private Integer outputNumber;

    public Model(Integer number) {
        this.inputNumber = number;

    }

    public Integer getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(Integer inputNumber) {
        this.inputNumber = inputNumber;
    }

    public Integer getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(Integer outputNumber) {
        this.outputNumber = outputNumber;
    }
}