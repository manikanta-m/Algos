package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        ArrayUtils.printArray(ArrayUtils.UNSORTEDARRAY);
        ArrayUtils.printArray(BubbleSort.sort(ArrayUtils.UNSORTEDARRAY));
    }

    public static int[] sort(int[] arr) {
        int temp;boolean swaped=false;
        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaped = true;
                }
            }
            if (swaped==true){
                break;
            }
        }
        return arr;
    }
}
