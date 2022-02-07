import java.util.Arrays;
class MinMaxFinder1{
   int max;
   int min;
    MinMaxFinder1(){}

    MinMaxFinder1(int min, int max){
        this.min = min;
        this.max = max;

    }
    public MinMaxFinder1 minMaxFinder1(int[] arr){
        int min;
        int max;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];

        return new MinMaxFinder1(min,max);
    }
}
