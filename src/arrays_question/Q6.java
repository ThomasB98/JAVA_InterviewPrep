package arrays_question;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("input number of times to rotate");
        int Krotation=sc.nextInt();

        if(Krotation> arr.length){
            Krotation=Krotation% arr.length;
        }

        for(int j=0;j<Krotation;j++){
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
                if(i== arr.length-1){
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
