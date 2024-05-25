
package tube;

/**
 *
 * @author lenovo
 */
public class Tube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Linkedlist a=new Linkedlist();
a.insert("joo", "123");   
    a.insert("mee", "246");
    a.print();
    a.delete("joo");
    }
}
