package com.edmarkou.funfacts;

import java.util.Random;

public class FactBook {
    private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "The average millionaire goes bankrupt at least 3.5 times.",
            "49% of Americans start their day with cereal.",
            "A man’s cognitive function is impaired when interacting with women – " +
                    "Even the thought of interacting with females affects the male brain.",
            "Women end up digesting most of the lipstick they apply.",
            "Standing while doing work on the computer increases your productivity and will make you more focused.",
            "Drinking water after eating reduces the acid in your mouth by 60 percent.",
            "In Los Angeles, there are fewer people than there are cars.",
            "36 human hearts could fit inside a giraffe’s heart.",
            "The people with the highest IQ’s are the most likely to use drugs.",
            "A honey badger’s skin is so thick, they can withstand multiple machete strikes, arrows and spears.",
            "Disney World is actually larger than 17 other countries.",
            "America is losing half a million jobs to China every year."};

    public String getFact(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        String fact = facts[randomNumber];
        return fact;
    }
}
