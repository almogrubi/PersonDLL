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
public class PersonNode {
    
    private Person person;
    private PersonNode next;
    private PersonNode prev;
    
    PersonNode(Person person){
        this.person=person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode next) {
        this.next = next;
    }

    public PersonNode getPrev() {
        return prev;
    }

    public void setPrev(PersonNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "PersonNode{" + this.getPerson().toString() + '}';
    }
    
    
    
}
