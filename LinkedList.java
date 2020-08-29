package Sorting_searching;
import java.util.*;
public class LinkedList {                                                                                                                                                                                                                                                                                                                                                                      
    Node first;

    public void add(char c, int index) {
        if(index==0) {
            if(first==null) first = new Node();
            else add(first, first.datum, 1);
            first.datum = c;
        }
        else add(first, c, index);
    }

    public void add(Node n, char c, int index) {
        if(index==1) {
            Node newnode = new Node();
            newnode.datum = c;
            newnode.link = n.link;
            n.link = newnode;
        }
        else add(n.link, c, index-1);
    }

    public void swap(int i1, int i2) {
        char temp = get(i1).datum;
        get(i1).datum = get(i2).datum;
        get(i2).datum = temp;
    }

    public void print() {
        System.out.println(first);
    }

    public Node get(int index) {
        return get(index, first);
    }

    public Node get(int index, Node n) {
        if(index==0) return n;
        return get(index-1, n.link);
    }


    public void set(int index, char c) {
        get(index).datum = c;
    }

    public int length()
    {   
        int counter = 0;
        Node temp = first;
        while(temp!=null) {
            temp = temp.link;
            counter++;
        }
        return counter;
    }

    public void bubbleSort()
    {   
        for (int i = 0; i < length(); i++)
        {   
            for (int j = i; j < length(); j++)
            {   
                if (get(j).compareTo(get(j+1)) > 0)
                {   
                    swap(j, j + 1);
                }
            }
        }
    }

    public static void syso(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add('c', 0);
        ll.add('m', 1);
        ll.add('a', 2);
        ll.add('x', 3);
        ll.add('d', 2);
        ll.print();

        Node n1 = ll.get(1);
        Node n2 = ll.get(2);
        if(n1.compareTo(n2)>0) syso("bigger");
        else if(n1.compareTo(n2)==0) syso("equal");
        else syso("smaller");


        ll.bubbleSort();
        ll.print();
    }

} //end class LinkedList

class Node {
    char datum; 
    Node link = null;

    public String toString() {
        return datum + ":" + link;
    }

    int compareTo(Node n) {
        return datum - n.datum;
    }
}
