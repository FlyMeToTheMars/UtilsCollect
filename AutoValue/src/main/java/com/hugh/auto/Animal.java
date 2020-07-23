package com.hugh.auto;

import com.google.auto.value.AutoValue;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/22 2:58 下午
 * @Version 1.0
 **/
@AutoValue
abstract class Animal {
    static Animal create(String name, int numberOfLegs) {
        return new AutoValue_Animal(name, numberOfLegs);
    }

    //get方法
    abstract String name();
    abstract int numberOfLegs();
}