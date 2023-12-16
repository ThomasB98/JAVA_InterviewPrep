package arrays_question;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            if(i== arr.length-1){
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
