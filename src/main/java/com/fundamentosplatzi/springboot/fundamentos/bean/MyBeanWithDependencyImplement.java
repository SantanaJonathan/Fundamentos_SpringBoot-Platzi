package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
    //instancio una dependencia configurada en myconfigurationBean
    private MyOperation myOperation;
    private MyOwnDependency myOwnDependency;

    public MyBeanWithDependencyImplement(MyOperation myOperation, MyOwnDependency myOwnDependency) {
        this.myOperation = myOperation;
        this.myOwnDependency = myOwnDependency;
    }
    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodo printWithDependency");//para mostrar la info
        int numero=1;
        LOGGER.debug("El numero enviado como parametro a la dependencia operation es:"+numero);
        System.out.println(myOperation.sumar(numero));
        System.out.println("Hola desde la implementacion de un Bean con dependencia");
        myOwnDependency.miDependencia();//Aqui solo se implementa un print
    }

}
