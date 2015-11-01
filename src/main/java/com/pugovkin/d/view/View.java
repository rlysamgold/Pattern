package com.pugovkin.d.view;

import com.pugovkin.d.interfaces.IView;

/**
 * Created by Abrite on 01.11.15.
 */
public class View implements IView {

    public void continu() {
        System.out.println("CONTINUE? (y/n)?");
    }

    public void askNumber() {
        System.out.println("ENTER NUMBER:");
    }

    public void draw(Integer drawNumber) {
        System.out.println("Draw after pow = " + drawNumber);
    }
}
