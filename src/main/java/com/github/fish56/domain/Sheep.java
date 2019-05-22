package com.github.fish56.domain;

import com.github.fish56.annotation.EntityRuntime;
import com.github.fish56.annotation.Id;

@EntityRuntime
public class Sheep {
    @Id
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
