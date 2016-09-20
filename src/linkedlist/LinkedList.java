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
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList_ lili= new LinkedList_();
        
        double total=0;
        if(lili.isEmpty())
        {
            lili.append(1000);
            lili.append(1001);
            lili.append(1002);
            lili.append(1003);
        }   
         else
        {
            System.out.println("List is not empty");
        }
        
        for(int i=0; i<10; i++)
        {
            lili.addToFront(5000+i);
        }
        lili.removeFromFront();
        lili.removeFromFront();
        
        lili.traverse();
    }
    
}
