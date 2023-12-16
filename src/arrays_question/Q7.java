package arrays_question;

import java.util.Arrays;


public class Q7 {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
//        int temp[]=new int[arr.length];
//        int j=0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]!=0){
//                temp[j]=arr[i];
//                j++;
//            }
//        }
//        for(int i=0;i<temp.length;i++){
//            arr[i]=temp[i];
//        }
//        System.out.println(Arrays.toString(arr));
        int j=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }

        }

        System.out.println(Arrays.toString(arr));

    }

}
