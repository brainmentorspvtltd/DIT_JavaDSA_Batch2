class NodeB {
    NodeB right;
    NodeB down;
    int data;
    public NodeB(int data) {
        this.data = data;
    }
}

public class MergeKSortedLinkedList {
    NodeB start, tail;

    void add(int data) {
        if(start == null) {
            NodeB node = new NodeB(data);
            tail = start = node;
        }
        else {
            NodeB node = new NodeB(data);
            tail.down = node;
            tail = node;
        }
    }

    NodeB merge(NodeB start_1, NodeB start_2) {
        NodeB third;
        if(start_1 == null) {
            // print(start_2);
            return start_2;
        }
        if(start_2 == null) {
            // print(start_1);
            return start_1;
        }

        if(start_1.data <= start_2.data) {
            third = start_1;
            start_1 = start_1.down;
        }
        else {
            third = start_2;
            start_2 = start_2.down;
        }

        while(start_1 != null && start_2 != null) {
            if(start_1.data <= start_2.data) {
                third.down = start_1;
                third = start_1;
                start_1 = start_1.down;
            }
            else {
                third.down = start_2;
                third = start_2;
                start_2 = start_2.down;
            }
        }
        if(start_1 == null) {
            third.down = start_2;
        }
        else {
            third.down = start_1;
        }
        return third;
    }

    void flatten() {
        if(start == null || start.right == null) {
            // print(start);
            return;
        }
        NodeB remaining = start.right;
        NodeB newHead = start;
        while(remaining != null) {
            NodeB l2 = remaining;
            remaining = remaining.right;
            newHead = merge(newHead, l2);
        }
        // print(newHead);
    }

    void topAdd(NodeB node) {
        if(start == null) {
            tail = start = node;
        }
        else {
            tail.right = node;
            tail = node;
        }
    }

    void print() {
        NodeB temp = start;
        while(temp != null) {
            if(temp.down != null){
                NodeB temp_2 = temp;
                while(temp_2 != null) {
                    System.out.print(temp_2.data + ",");
                    temp_2 = temp_2.down;
                }
                System.out.println();
            }
            temp = temp.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeKSortedLinkedList obj = new MergeKSortedLinkedList();
        obj.add(5);
        obj.add(7);
        obj.add(9);
        obj.add(15);

        MergeKSortedLinkedList obj_2 = new MergeKSortedLinkedList();
        obj_2.add(1);
        obj_2.add(2);
        obj_2.add(3);

        MergeKSortedLinkedList obj_3 = new MergeKSortedLinkedList();
        obj_3.add(18);
        obj_3.add(20);
        obj_3.add(23);

        MergeKSortedLinkedList obj_4 = new MergeKSortedLinkedList();
        obj_4.topAdd(obj.start);
        obj_4.topAdd(obj_2.start);
        obj_4.topAdd(obj_3.start);

        // obj.print();

        obj_4.flatten();

        obj.print();

    }
}
