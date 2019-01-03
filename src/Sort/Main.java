package Sort;

public class Main {

    public static void main(String[] args) {
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};

        System.out.println("Before: ");
        for (int num: testArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        BubbleSort.bubbleSort(testArr);

        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }


}

