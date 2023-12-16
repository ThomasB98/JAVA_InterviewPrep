package arrays_question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        int largest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);



    }
}
