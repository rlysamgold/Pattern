package com.pugovkin.d.model;

import com.pugovkin.d.interfaces.IModel;

/**
 * Created by Abrite on 01.11.15.
 */
public class Model implements IModel {

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