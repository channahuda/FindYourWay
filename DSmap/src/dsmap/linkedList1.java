package dsmap;

public class linkedList1 {

    node head;
    node tail;
    double distance = 0;
    int size = 0;

    //big o constant
    void addAsTail(int v) {
        node n = new node(v);
        if (head == null) {
            head = n;
        }
        if (tail == null) {
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

}

class node {

    int v; //index of the place
    node next;

    node(int v) {
        this.v = v;
    }
}
