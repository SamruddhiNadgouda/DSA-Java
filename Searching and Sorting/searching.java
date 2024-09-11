public class searching {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binearSearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) { // found
                return mid;
            } else if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 12, 16 };
        int key = 12;

        // int index = linearSearch(numbers, key);
        int index = binearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key is found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
