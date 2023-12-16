package arrays_question;

public class Q3 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                System.out.println("unsorted array");
                return;
            }

        }
        System.out.println("sorted array");
    }
}
