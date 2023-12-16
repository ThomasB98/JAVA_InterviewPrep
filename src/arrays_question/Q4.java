package arrays_question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q4 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
        //=========================================
        Set<Integer> NoDuplicates=new HashSet<>();
        for(int data:arr){
            NoDuplicates.add(data);
        }
        System.out.println(NoDuplicates);
        //======upto here code rest useless=====
        // Useing set
        int index=0;
        Iterator<Integer> itr= NoDuplicates.iterator();
        int j=0;
        while(itr.hasNext()){
            arr[j]=itr.next();
            j++;
        }
        for(int i=0;i<NoDuplicates.size();i++){
            System.out.println(arr[i]);
        }
        //=========================================
    }
}
