import java.util.ArrayList;

class Heap {
    ArrayList<Integer> data = new ArrayList<>();
    void add(int item) {
        data.add(item);
        upHeapify(data.size() - 1);
    }

    void upHeapify(int childIndex) {
        // compute the parent index
        int parentIndex = (childIndex - 1) / 2;
        // compare if parent index element is greater than swap
        if(data.get(childIndex) < data.get(parentIndex)) {
            swap(parentIndex, childIndex);
            // call upheapify recursively 
            upHeapify(parentIndex);
        }
    }

    void swap(int parentIndex, int childIndex) {
        int parentValue = data.get(parentIndex);
        int childValue = data.get(childIndex);
        data.set(childIndex, parentValue);
        data.set(parentIndex, childValue);
    }

    int delete() {
        // swap the 0th and last element
        swap(0, data.size() - 1);
        int lastElement = data.remove(data.size() - 1);
        downHeapify(0);
        return lastElement;
    }

    void downHeapify(int parentIndex) {
        // get the left and right child index
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        int minIndex = parentIndex;
        // left child index is less than parent node value then store left child index in minIndex
        if(leftChildIndex < data.size() - 1 && data.get(leftChildIndex) < data.get(parentIndex)) {
            minIndex = leftChildIndex;
        }
        if(rightChildIndex < data.size() - 1 && data.get(rightChildIndex) < data.get(parentIndex)) {
            minIndex = rightChildIndex;
        }
        if(minIndex != parentIndex) {
            swap(parentIndex, minIndex);
            downHeapify(minIndex);
        }
    }

    void print() {
        for(Integer i : data) {
            System.out.print(i + ", ");
        }
    }
}

public class HeapOperations {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(5);
        heap.add(15);
        heap.add(1);
        heap.print();
    }
}
