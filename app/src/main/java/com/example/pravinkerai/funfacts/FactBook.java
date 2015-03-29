package com.example.pravinkerai.funfacts;

import java.util.Random;

/**
 * Created by pravinkerai on 04/10/14.
 */
public class FactBook {

    // Member variable (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Don’t try to guess a girl’s feelings. Ask her.",
            "Never tell a girl that she is useless in anyway.",
            "Women speak about 20,000 words a day. That's 13,000 more than the average man.",
            "All of the 20 richest women in the world --except for #17-- inherited their money from either their husband or their father.",
            "The average woman in the UK owns 19 pairs of shoes, but wears only 7.",
            "40% of births in the U.S. come from unmarried women.",
            "India has more mobile phones than toilets.",
            "According to Live Science, by the age of 19, a whopping 70 percent of American teenagers have already had sex.",
            "37% of the web is PORN",
            "Abraham Lincoln, Walt Disney, Bill Gates, Mark Zuckerberg, Henry Ford, Thomas Edison and Steve Jobs, all of them had no college degree.",
            "PI = 3.14159 26535 89793 23846 26433 83279 50288 41971...",
    };

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}