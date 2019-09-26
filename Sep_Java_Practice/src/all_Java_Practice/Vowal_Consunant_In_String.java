package all_Java_Practice;

public class Vowal_Consunant_In_String {

	public static void main(String[] args) {
		String s="kushwaha aeiou manoj";
		int Vcount=0,Ccount=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				Vcount++;
			}else if(c>='a'&& c<='z'){
				Ccount++;
			}
		}
		System.out.println("Number of Vowal ---> " + Vcount);
		System.out.println("Number of Consunant ---> " + Ccount);
	}

}
