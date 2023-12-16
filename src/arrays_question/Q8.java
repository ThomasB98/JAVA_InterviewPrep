package arrays_question;

public class Q8 {
    public static void main(String[] args) {
        int[] arr={6,7,8,4,1};
        int key=4;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                System.out.println("element found"+" at position "+ i++);
                return;
            }
        }
        System.out.println("element not found");
    }
}
