package com.github.fish56.controller;

import com.github.fish56.annotation.Valid;
import com.github.fish56.domain.Fish;

public class FishController {
    public void postFish(@Valid Fish fish){
        System.out.println(fish.getClass().isAnnotationPresent(Valid.class));
    }
}
