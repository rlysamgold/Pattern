package com.pugovkin.d.control;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Abrite on 01.11.15.
 */
public class TestControl {

    @Test
    public void testPow() {

        Control control = new Control();


        assertTrue(4 == control.pow(2));


        assertFalse(3 == control.pow(2));

    }


}
