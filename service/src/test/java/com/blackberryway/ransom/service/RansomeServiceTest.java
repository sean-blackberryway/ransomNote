package com.blackberryway.ransom.service;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RansomeServiceTest {

    @Test
    public void isRansomNotePossibleTrue(){
        RansomeService ransomeService = new RansomeService();
        assertTrue("This will succeed.", ransomeService.isRansomPossible("I am here", "to be here or not to be here I am I said"));
    }

    @Test
    public void isRansomNotePossibleFalse(){
        RansomeService ransomeService = new RansomeService();
        assertFalse("This will fail.", ransomeService.isRansomPossible("Simon I am here Sean", "to be here or not to be here I am I said"));
    }

    @Test
    public void isRansomNotePossibleFalseDuplicate(){
        RansomeService ransomeService = new RansomeService();
        assertFalse("This will fail.", ransomeService.isRansomPossible("I am here I", "to be here or not to be here I am I said"));
    }
}
