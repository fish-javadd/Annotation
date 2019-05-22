package com.github.fish56.controller;

import com.github.fish56.annotation.Valid;
import com.github.fish56.domain.Fish;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class FishControllerTest {

    @Test
    public void postFish() throws Exception{
        Method method = FishController.class.getMethod("postFish", Fish.class);

        // 获得一个数组，数组中的每一个元素都是当前参数的注解列表
        final Annotation[][] paramAnnotations = method.getParameterAnnotations();

        final Class[] paramTypes = method.getParameterTypes();
        for (int i = 0; i < paramAnnotations.length; i++) {
            for (Annotation a: paramAnnotations[i]) {
                if (a instanceof Valid) {
                    System.out.println(String.format(
                            "parameter %d with type %s is annotated with @Valid", i, paramTypes[i]));
                }
            }
        }
        // parameter 0 with type class com.github.fish56.domain.Fish is annotated with @Valid
    }
}