package com.pugovkin.d.view;

/**
 * Created by Abrite on 01.11.15.
 */
public class View {

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
