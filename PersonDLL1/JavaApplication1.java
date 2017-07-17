/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDLL1;
import java.util.Arrays;

/**
 *
 * @author almog
 */


public class JavaApplication1 {
    
    public static void main(String [] args)
    {

        Person almog = new Person(28,"almog","rubin");
        Person katya = new Person(23,"katya","rubin");
        Person dani = new Person(27,"dani","kogan");
        Person chen = new Person(24,"chen","barzili");
        
        PersonNode almogNode=new PersonNode(almog);
        PersonNode katyaNode=new PersonNode(katya);
        PersonNode daniNode=new PersonNode(dani);
        PersonNode chenNode=new PersonNode(chen);
        
        PersonDLL list = new PersonDLL(katyaNode);
        
        list.add(daniNode);
        list.add(chenNode);
        list.add(almogNode);
        list.remove();

        System.out.println(list);
        list.remove();
        System.out.println(list);
        
    }

}
