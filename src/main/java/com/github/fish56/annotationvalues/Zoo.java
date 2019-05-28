package com.github.fish56.annotationvalues;

public class Zoo {
    public String name;

    @Animal(animals = {"fish", "rabbit"})
    public String animals;
}
