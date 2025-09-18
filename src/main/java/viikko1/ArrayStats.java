package viikko1; // uusinta commit

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length == 0){
            return 0.0;
        }
        long sum = 0;
        for (int x : arr){
            sum += x;
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int largest = arr[0];
        for (int x : arr){
            if (x > largest){
                largest = x;
            }
        }
        return largest;
    }
}
