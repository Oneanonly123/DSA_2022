package CyclicSort;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 11 };
        System.out.println(missingPositive(arr));

    }

    static int missingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] != arr[correctIndex] && arr[i] <= arr.length) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
