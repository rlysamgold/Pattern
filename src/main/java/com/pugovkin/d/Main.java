package com.pugovkin.d;

import com.pugovkin.d.control.Control;
import com.pugovkin.d.model.Model;
import com.pugovkin.d.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        Control control = new Control();
        Model model;
        View view = new View();

        boolean cycle = true;


        Integer number;
        String inputString;
        BufferedReader readerContinue = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerNumber = new BufferedReader(new InputStreamReader(System.in));


        while (cycle) {
            view.continu();
            cycle = readerContinue.readLine().equals("y");
            if (cycle) {
                try {


                    view.askNumber();
                    inputString = readerNumber.readLine();

                    number = Integer.parseInt(inputString);
                } catch (Exception e) {

                    System.out.println(" wrong Input int");
                    System.out.println("Asshole - input proper number");
                    continue;
                } finally {

                }

                model = new Model(number);
                model.setOutputNumber(control.pow(model.getInputNumber()));
                view.draw(model.getOutputNumber());

                continue;
            }
            break;


        }
    }
}