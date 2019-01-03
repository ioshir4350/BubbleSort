package Sort;

public class BubbleSort {


    public static void swap(int[]testarr, int i, int j)
    {
        int x = testarr[i];
        testarr[i] = testarr[j];
        testarr[j] = x;
    }
    public static void bubbleSort(int[] testarr)
    {
        int c=1;
        while(c>0)
        {
            c=0;
            for(int b = 0; b<testarr.length-1; b++)
            {
                if (testarr[b] > testarr[b+1])
                {
                    swap(testarr, b, b+1);
                    c++;
                }
            }
        }
    }

}
