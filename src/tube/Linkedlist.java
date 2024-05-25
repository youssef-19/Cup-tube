/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tube;

/**
 *
 * @author lenovo
 */
public class Linkedlist {
     VideoNode head, last;
    int size;
    

    Linkedlist() {
        head = last = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insert(String name, String link) {
        VideoNode newNode = new VideoNode(name, link);
        if (isEmpty()) {
            head = last = newNode;
            newNode.next = null;
           
        } else {
            last.next = newNode;
            newNode.next = null;
            last = newNode;
        }
        size++;
    }

    public void next() {
        head = head.next;
    }

    void delete(String name) {
        if (head.name.equals(name)) {
            head = head.next;
            size--;
            if (size == 0) 
                last = null;
        } else {
            VideoNode current = head.next;
            VideoNode Previous = head;
            while (current != null) {
                if (current.name.equals(name)) 
                    break;
                Previous = current;
                current = current.next;
            }
            if (current == null) 
                return;
           else {
                Previous.next = current.next;
                if (last == current)   last = Previous;
                  size--;
                return;
            }
        }
            return;
    }

    String search(String name) {
        VideoNode current = head;
        while (current != null) {
            if (current.name.equals(name)) 
                return current.link;
            current = current.next;
        }
        return null;
    }

    void print() {
        VideoNode current = head;
        System.out.println("Videos in porgram= " + size);
        while (current != null) {
            System.out.print(current.name+" -- ");
            System.out.println(current.link);
            current = current.next;
        }
        System.out.println("===============================");
        System.out.println("");
    }
    void update(String name ,String link){
        VideoNode current=head;
        while(current !=null){
            if(current.link.equals(link))
                current.name=name;
            current=current.next;
        }
        return;
    }
}
    
