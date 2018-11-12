package com.blackberryway.ransom;

import com.blackberryway.ransom.service.RansomeService;

public class RansomMain {

    public static void main(String[] args) {

        RansomeService ransomeService = new RansomeService();

        System.out.println(ransomeService.isRansomPossible("I am here I", "to be here or not to be here I am I said"));
    }
}
