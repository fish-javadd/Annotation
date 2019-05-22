package com.github.fish56.domain;

import com.github.fish56.annotation.Entity;
import com.github.fish56.annotation.Id;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class SheepTest {
    /**
     * 判断类是否被某个注解标注了
     */
    @Test
    public void isPresent(){
        Class sheepClass = Sheep.class;
        boolean isPresent = sheepClass.isAnnotationPresent(Entity.class);
        System.out.println(isPresent);
        // true
    }

    /**
     * 判断字段是否被某个注解标注了
     */
    @Test
    public void isIdPresent() throws Exception{
        Class sheepClass = Sheep.class;
        Field idField = sheepClass.getDeclaredField("id");

        boolean isPresent = idField.isAnnotationPresent(Id.class);
        System.out.println(isPresent);
        // true
    }
}