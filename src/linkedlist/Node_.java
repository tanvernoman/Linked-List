/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author afnan
 */
public class Node_ {
     public Integer value; //can be any type
    public Node_ next;   //reference for next node 
    
    public Node_(Integer v){
        this.value=v;
        this.next=null;
    }
    //overlodad constructor
    public Node_ (Integer v,Node_ n){
        this.value=v;
        this.next=n;
    }
    //accessor and mutators
    public Integer setValue(Integer v){
        this.value=v;
        return this.value;
    }
    public Integer getValue(){
        return this.value;
    }
    public Node_ getNext(){
        return next;
    }
    public Node_ setNext(Node_ next){
        this.next=next;
        return this.next;
    }
    
}
