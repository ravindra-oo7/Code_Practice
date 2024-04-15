import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// A class representing a Fruit
class Fruit implements Comparable<Fruit> {
    private String name;
    private int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Implementing Comparable interface
    @Override
    public int compareTo(Fruit otherFruit) {
        // Compare fruits based on their quantity
        return Integer.compare(this.quantity, otherFruit.quantity);
    }

    @Override
    public String toString() {
        return name + " - " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 10));
        fruits.add(new Fruit("Orange", 5));
        fruits.add(new Fruit("Banana", 15));

        // Sorting using Comparable (natural ordering based on quantity)
        Collections.sort(fruits);
        System.out.println("Sorted by quantity (Comparable):");
        System.out.println(fruits);

        // Sorting using Comparator (sorting by name)
        Comparator<Fruit> nameComparator = Comparator.comparing(Fruit::getName);
        fruits.sort(nameComparator);
        System.out.println("\nSorted by name (Comparator):");
        System.out.println(fruits);
    }
}


