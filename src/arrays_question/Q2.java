package arrays_question;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={5,5,3,2,1};
        //arr={1,2,3,4,5}
        Arrays.sort(arr);
        int secondLargest=arr[0];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<arr[arr.length-1]){
                secondLargest=arr[i];
                break;
            }
        }
        System.out.println(secondLargest);

        int large=arr[0];
        int secLarge=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                secLarge=large;
                large=arr[i];
            }
        }
        System.out.println(secLarge);
    }
}
