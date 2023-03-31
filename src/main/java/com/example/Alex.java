package com.example;

import java.util.List;

public class Alex extends Lion {

    public Alex(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    public List<String> getFriends() {
        return List.of("Marty", "Gloria", "Melmen");
    }

    public String getPlaceOfLiving() {
        return "New York's zoo";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
