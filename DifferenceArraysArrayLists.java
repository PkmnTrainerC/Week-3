import java.util.ArrayList;

class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // ----------- ARRAY EXAMPLE -----------
        // Arrays have a fixed size
        String[] fruitsArray = new String[3];
        fruitsArray[0] = "Apple";
        fruitsArray[1] = "Banana";
        fruitsArray[2] = "Cherry";

        System.out.println("Array contents:");
        for (int i = 0; i < fruitsArray.length; i++) {
            System.out.println(fruitsArray[i]);
        }

        // Uncommenting the line below would cause an ArrayIndexOutOfBoundsException
        // fruitsArray[3] = "Durian"; // Array size is fixed

        // ----------- ARRAYLIST EXAMPLE -----------
        // ArrayLists are dynamic and can grow/shrink
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");
        fruitsList.add("Durian"); // Can add more items freely

        System.out.println("\nArrayList contents:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Remove an element
        fruitsList.remove("Banana");

        System.out.println("\nArrayList after removing Banana:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
