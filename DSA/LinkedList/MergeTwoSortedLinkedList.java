class GenericNode<T> {
    T data;
    GenericNode<T> next;
    public GenericNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedLinkedList {
    void merge(GenericNode<Integer> start_1, GenericNode<Integer> start_2) {
        GenericNode<Integer> third;
        if(start_1 == null) {
            print(start_2);
            return;
        }
        if(start_2 == null) {
            print(start_1);
            return;
        }

        if(start_1.data <= start_2.data) {
            third = start_1;
            start_1 = start_1.next;
        }
        else {
            third = start_2;
            start_2 = start_2.next;
        }

        while(start_1 != null && start_2 != null) {
            if(start_1.data <= start_2.data) {
                third.next = start_1;
                third = start_1;
                start_1 = start_1.next;
            }
            else {
                third.next = start_2;
                third = start_2;
                start_2 = start_2.next;
            }
        }
        if(start_1 == null) {
            third.next = start_2;
        }
        else {
            third.next = start_1;
        }
 
    }

    void print(GenericNode<Integer> node) {

    }
}