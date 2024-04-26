package arrays;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(5);

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        System.out.println(array.size());
        System.out.println(array.getCapacity());
        array.add(7);
        array.remove();
        array.add(8);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}
