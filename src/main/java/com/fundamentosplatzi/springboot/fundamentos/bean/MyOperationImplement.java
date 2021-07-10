package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int sumar(int number) {
       return number+1;
    }
}
