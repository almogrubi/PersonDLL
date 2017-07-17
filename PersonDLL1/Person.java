/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDLL1;

/**
 *
 * @author almog
 */
public class Person implements Comparable<Person>{
    
    private int age;
    private String name;
    private String last;
    private int ID;
    private static int counter = 0;
    
    public Person (int age,String name, String last){
        
        this.age=age;
        this.name=name;
        this.last=last;
        this.ID=counter+1;
        counter++;
        
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + ", last=" + last + ", ID=" + ID + '}';
    }
    
    
    
    public int compareTo(Person other){
        return Integer.compare(this.age, other.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }
    
    
    
}
