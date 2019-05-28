package com.github.fish56.annotationvalues;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class ZooTest {
    /**
     * 获得注解中的值
     * @throws Exception
     */
    @Test
    public void t() throws Exception{
        Field animalsField = Zoo.class.getField("animals");

        Animal animalAnnotation = animalsField.getAnnotation(Animal.class);

        System.out.println(JSONObject.toJSONString(animalAnnotation.animals()));
        // ["fish","rabbit"]
    }
}