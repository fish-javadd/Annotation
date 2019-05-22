package com.github.fish56.domain;

import com.github.fish56.annotation.Entity;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {
    /**
     * 判断类是否被某个注解标注了
     */
    @Test
    public void isPresent(){
        Class fishClass = Fish.class;
        boolean isPresent = fishClass.isAnnotationPresent(Entity.class);
        System.out.println(isPresent);
        // false, 因为这不是个Runtime注解
    }
}