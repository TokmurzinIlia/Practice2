package com.it_academy.practice.junit_basics;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class StringRandom {

    String[] randomString = new String[10];

    public String [] fillInArray(int lang){

        for (int i = 0; i < 10; i++){
            randomString[i] = RandomStringUtils.randomAlphabetic(lang);
        }
    return randomString;}

    public String [] capitalize(){

        for (int i = 0; i < 10; i++){
            randomString[i] = StringUtils.capitalize(randomString[i]);
        }
        return randomString;}

    public String [] toLowerCase(){

        for (int i = 0; i < 10; i++){
            randomString[i] = randomString[i].toLowerCase();
        }
        return randomString;}

}
