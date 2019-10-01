package october_Interview;

public class String_Occurance_in_Array {

	public static void main(String[] args) {
		String s[] ={"manoj","ma","abc","bca","ma","manoj"};
		int count=0;
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
		}

	}

}
