package apack;
public class A{
    int v=3;
    public int publicv=90;
    private int privatev=80;
    protected int protectedv=70;
}

package bpack;
import apack.A;
public class B extends A{
    public void display(){
        System.out.println("Protected:"+protectedv);
        System.out.println("public:"+publicv);
    }
}
    

package cpack;
import apack.A;
public class C{
    public void display(){
        System.out.println("public:"+publicv);
    }
}

package dpack;
import cpack.C, bpack.B;
public class Demo{
    public static void main(String[] args){
        B obj1=new B();   
        C obj2=new C();
        System.out.println("For package B:");
        obj1.display();
        System.out.println("For package B:" );
        obj1.display();
    }
}
