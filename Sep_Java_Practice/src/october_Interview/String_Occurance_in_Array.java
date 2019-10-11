package october_Interview;

import java.util.HashSet;
import java.util.Set;

public class String_Occurance_in_Array {

	public static void main(String[] args) {
		String s[] ={"manoj","ma","abc","bca","ma","manoj"};
         
		Set remove=new HashSet<>();
		StringBuffer sb=new StringBuffer();
        for (String str :s) {
        	if(!remove.contains(str)){
        		remove.add(str);
        		sb.append(str+", ");
        	}
		}
        System.out.println(sb.toString());
	}
}


/*int count=0;
for(int i=0;i<s.length;i++){
	 count=0;
	for(int j=0;j<s.length;j++){
		if(j<i && s[i]==s[j]){
			break;
		}if(s[i]==s[j]){
			count++;
		}if(j==s.length-1){
			System.out.println("Number of String in Arrays -- > " + s[i] +" -- "+ count);
		}
	}
}*/


/*char c[]=s.toCharArray();
int count=0;
for(int i=0;i<c.length;i++){
	count=0;
	for(int j=0;j<c.length;j++){
		if(j<i && c[i]==c[j]){
			break;
		}if(c[i]==c[j]){
			count++;
		}if(j==s.length()-1){
			System.out.println(c[i]+"  "+ count);
		}
	}
}*/
