package ArraysProblems;

import java.util.Scanner;

class P1_ArrayCRUD {
    int currentSize;
    int arr[];
    P1_ArrayCRUD(int capacity) {
        this.arr = new int[capacity];
        currentSize = 0;
    }

    void insert(int index, int value) {
        if(index > currentSize) {
            throw new RuntimeException("Index cannot be greater than current size");
        }

        if(currentSize == arr.length) {
            System.out.println("Array is full, Can't add element...");
            return;
        }

        for(int i = currentSize - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        currentSize++;
        System.out.println("Element added...");
        print();

    }

    void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is Empty...");
            return;
        }

        for(int i = index; i < currentSize-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[currentSize-1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
        print();

    }

    // Linear Search
    int search(int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        System.out.println("Not Found...");
        return -1;
    }

    void update(int valueToSearch, int valueToUpdate) {
        int index = search(valueToSearch);
        if(index == -1) {
            return;
        }
        else {
            arr[index] = valueToUpdate;
            System.out.println("Value Updated...");
            print();
        }
    }

    void print() {
        for(int ele : arr) {
            System.out.print(ele + ",");
        }
    }

    public static void main(String[] args) {
        P1_ArrayCRUD obj = new P1_ArrayCRUD(5);
        // obj.insert(0, 10);
        // obj.insert(1, 20);
        // obj.insert(2, 30);
        // obj.insert(3, 40);
        // obj.insert(4, 50);

        // obj.delete(2);

        // obj.insert(1, 100);

        Scanner scanner = new Scanner(System.in);
        int choice;
        int index;
        int value;
        while(true) {
            System.out.println("Array CRUD Operations : ");
            System.out.println("1. Insert Operation");
            System.out.println("2. Remove Operation");
            System.out.println("3. Search Operation");
            System.out.println("4. Update Operation");
            System.out.println("5. Print Operation");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            ArrayOperations enumChoice = ArrayOperations.values()[choice - 1];
            switch (enumChoice) {
                case INSERT:
                    System.out.print("Enter the index : ");
                    index = scanner.nextInt();
                    System.out.print("Enter the value : ");
                    value = scanner.nextInt();
                    obj.insert(index, value);
                    break;
                
                case DELETE:
                    System.out.print("Enter the index : ");
                    index = scanner.nextInt();
                    obj.delete(index);
                    break;

                case SEARCH:
                    System.out.print("Enter the value to search : ");
                    value = scanner.nextInt();
                    obj.search(value);
                    break;

                case UPDATE:
                    System.out.print("Enter the value to update : ");
                    value = scanner.nextInt();
                    obj.search(value);
                    System.out.print("Enter the updated value : ");
                    int value_updated = scanner.nextInt();
                    obj.update(value, value_updated);
                    break;

                case PRINT:
                    obj.print();
                    break;
                
                case EXIT:
                    return;

                default:
                    System.out.println("Wrong Choice...");
            }
        }

    }
}

// enum - represents the group of constant
// enum was introduced in Java 1.5
enum ArrayOperations {
    INSERT, DELETE, SEARCH, PRINT, UPDATE, EXIT
}