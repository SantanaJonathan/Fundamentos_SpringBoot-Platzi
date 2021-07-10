package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    //instancio una dependencia configurada en myconfigurationBean
    private MyOperation myOperation;
    private MyOwnDependency myOwnDependency;

    public MyBeanWithDependencyImplement(MyOperation myOperation, MyOwnDependency myOwnDependency) {
        this.myOperation = myOperation;
        this.myOwnDependency = myOwnDependency;
    }
    @Override
    public void printWithDependency() {
        int numero=1;
        System.out.println(myOperation.sumar(numero));
        System.out.println("Hola desde la implementacion de un Bean con dependencia");
        myOwnDependency.miDependencia();//Aqui solo se implementa un print
    }

}
