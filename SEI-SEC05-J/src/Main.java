/*
This program uses java reflections to print out the name of a class, the fields of a class and the
public methods of a class from within the instance of the class.

Author Aaron Aryan
*/

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws Exception {
        FieldExample fe = new FieldExample();
        // creating class object from the object using getClass method
        Class myClass = fe.getClass();
        
        // invoking getName() method on the class object to retrieve it's name
        System.out.println("The name of class is " + myClass.getName());
        System.out.println();
        System.out.println("------------------------");
        
        System.out.println("The fields of class are: ");
        System.out.println();
        
        // create an array which consists of public fields of the class
        Field[] classFields = myClass.getClass().getDeclaredFields();
        
        // print the name of the fields to the console
        for (Field field:classFields)
            System.out.println(field.getName());  
        System.out.println();
        System.out.println("--------------------------------");  
        
        System.out.println("The public methods of class are: ");
        System.out.println();
        // create an array which consists of public methods of the class
        Method[] methods = myClass.getMethods();
        
        // print the name of the fields to the console
        for (Method method:methods)
            System.out.println(method.getName());
        
        System.out.println();
           
               
    }
}
