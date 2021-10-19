package com.spring.firstapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
@RequestMapping ("/H")
    public String heading(){

    return "We are welcoming you to our branded shop, All Kinds of Cloths and accessories available ";
}

    @RequestMapping ("/B")
    public String brands(){

        return "PUMA, ADDIDAS, NIKE, WILD CRAFT, LEE, LEVIS etc";
    }

    @RequestMapping ("/P")
    public String discount(){

        return "PICK ANY BRANDED ITEMS 50% DISCOUNT";
    }


}