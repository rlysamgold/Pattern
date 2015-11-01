package com.pugovkin.d.control;

import com.pugovkin.d.interfaces.IControl;

/**
 * Created by Abrite on 01.11.15.
 */
public abstract class AbstractControl implements IControl {
    @Override
    public abstract Integer pow(Integer operationNumber);

    @Override
    public abstract Integer sqrt(Integer operationNumber);

    @Override
    public abstract double quub(Integer operationNumber);
}
