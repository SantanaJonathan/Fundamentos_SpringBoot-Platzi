package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOwnDependencyImplement implements MyOwnDependency {
    @Override
    public void miDependencia() {
        System.out.println("Implementnado mi propia dependencia");
    }
}
