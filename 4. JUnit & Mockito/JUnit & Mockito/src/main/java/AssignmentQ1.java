import java.util.Arrays;

class MinMaxFinder{

    public int[] findMinMax(int[] arr){
        int[] ans = new int[2];

        Arrays.sort(arr);

        ans[0] = arr[0];
        ans[1] = arr[arr.length-1];
        return ans;
    }
}
