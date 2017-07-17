/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDLL1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author almog
 */
public class PersonDLL {
    
  private PersonNode head;
  private int counter;
    
  public PersonDLL(PersonNode head) {
  
      this.head=head;
      this.counter=1;
      
  } 

    public PersonNode getHead() {
        return head;
    }

    public void setHead(PersonNode head) {
        this.head = head;
    }
  
  public void add(PersonNode target){
      
      PersonNode temp1 = head;
           
      for (int i=0;i<counter;i++){

          if (temp1.getPerson().compareTo(target.getPerson())>0){
              System.out.println("first else if " + i);
              System.out.println(temp1);
              temp1=temp1.getNext();
              System.out.println(temp1);
          }
          else{
              System.out.println(" else  " + i);
              target.setNext(temp1);
              target.setPrev(temp1.getPrev());
              if (target.getPrev()!=null)
                    target.getPrev().setNext(target);
              temp1.setPrev(target);
              
              if(i==0)
                  this.setHead(target);
              System.out.println(this);
              break;
              
          }
          
      }
      counter++;
  }
  
  public void remove(){
      
      
      head.getNext().setPrev(null);
      this.setHead(head.getNext());
             
  }

    @Override
    public String toString() {
        PersonNode temp=this.getHead();
        
        String s="DLL \n";

        while (temp.getNext()!=null){
            s=s.concat(temp.toString());
            temp=temp.getNext();
        }
        s=s.concat(temp.toString());
        
        return s;
    }
  
  
    
}
