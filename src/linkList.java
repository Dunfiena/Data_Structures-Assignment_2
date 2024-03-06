import static java.lang.Math.round;

public class linkList<T> {

    Node head = null;
    Node tail = null;

    public int size(){
        Node node = head;
        int size = 1;
        while (node.next !=null) {
            node = node.next;
            size++;
        }

        return size;
    }

    public int get(int index){
        Node node = head;
        for (int i = 0; i <index; i++){
            node = node.next;
        }
        return node.data;
    }

    public void set(int index, int data){
        Node node = head;
        for (int i = 0; i <index; i++){
            node = node.next;
        }
        node.data = data;
    }
    public void insert_last(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node node1 = head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;
            tail = node;
        }
    }

    public void insert_first(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insert_index(int index, int data) {
        if (index == 0) {
            insert_first(data);
        } else if (index > this.size()) {
            System.out.println("    WARNING: Index " + index +" out of bounds in list size " + this.size());
        } else if (index == this.size()) {
            insert_last(data);
        } else {
            Node node=new Node();
            node.data=data;
            Node n=head;
            for(int i=0;i<index-1;i++) {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }

    public void delete_last() {
        Node node1 = head;
        while (node1.next.next != null){
            node1 = node1.next;
        }
        node1.next = null;
    }

    public void delete_first() {
        head = head.next;
    }

    public void delete_index(int index) {
        if (index == 0) {
            delete_first();
        }else if (index > this.size()) {
            System.out.println("    WARNING: Index " + index +" out of bounds in list size " + this.size());
        } else if (index == this.size()) {
            delete_last();
        } else {
            Node node1 = head;
            Node node2;
            for(int i=0;i<index-1;i++)
            {
                node1 = node1.next;
            }
            node2 = node1.next;
            node1.next=node2.next;
        }
    }

    public linkList[] split_list(){
        linkList<Object> list1 = new linkList<Object>();
        linkList<Object> list2 = new linkList<Object>();
        Node node = head;
        for (int i=0; i<this.size(); i++) {
            if (this.size()%2 == 1) {
                if (i <= this.size() / 2) {
                    list1.insert_last(node.data);
                    node = node.next;
                } else {
                    list2.insert_last(node.data);
                    node = node.next;
                }
            }
            //Even
            else {
                if (i < this.size() / 2) {
                    list1.insert_last(node.data);
                    node = node.next;
                } else {
                    list2.insert_last(node.data);
                    node = node.next;
                }
            }
        }
        return new linkList[] {list1, list2};
    }


    public linkList<Object> merge_sort(linkList<Object> a, linkList<Object> b){
        sort(a);
        sort(b);
        for (int i = 0; i < b.size(); i++) {
            a.insert_last(b.get(i));
        }
        sort(a);
        return a;
    }

    private void sort(linkList<Object> b) {
        for (int i = 0; i < b.size(); i++){
            boolean swapped = false;
            for(int j = 0; j < b.size(); j++){
                if (b.get(i) < b.get(j)) {
                    swapped = true;
                    int tm = b.get(i);
                    b.set(i, b.get(j));
                    b.set(j, tm);
                }
            }
        }
    }

    public void show() {
        Node n=head;
        while(n.next!=null)
        {
            System.out.print(n.data + ",  ");
            n=n.next;
        }
        System.out.println(n.data);
    }
}
