package all_Java_Practice;

import java.util.Arrays;

public class Delete_Interview_Pro {

	public static void main(String[] args) {
        int n[]={22,-4353,324,26,5,65,4,34,3242,44,324};
        System.out.println(Arrays.toString(n));
        int temp;
        for(int i=0;i<n.length;i++){
        	for(int j=i+1;j<n.length;j++){
        		if(n[i]>n[j]){
        			temp=n[i];
        			n[i]=n[j];
        		     n[j]=temp;
        		}
        	}
            System.out.print(n[i]+","); 
        }
  	}
}
