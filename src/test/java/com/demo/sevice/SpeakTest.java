package com.demo.sevice;

import com.demo.service.Speak;

import java.util.ServiceLoader;

public class SpeakTest {
    public static void main(String [] args) {
        ServiceLoader<Speak> loaders = ServiceLoader.load(Speak.class);
        for (Speak d : loaders) {
            d.speak();
        }
    }
}
