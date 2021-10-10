import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        
        // int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers, 4); // works only on sorted arrays
        // O(log(n))
        // System.out.println("The index of element 4 in the array is "+index);

        Integer[] numbers = {10,2,32,12,15,76,17,48,79,9};
        Arrays.sort(numbers);

        // 8192 :(faster with multiple processors) numbers are needed above this to run parallel sort
        // Arrays.fill(numbers, 12);

        for(int i : numbers) {
            System.out.println(i + " ");
        }
    }
}
