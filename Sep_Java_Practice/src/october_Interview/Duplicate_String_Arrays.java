package october_Interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_String_Arrays {

	public static void main(String[] args) {
		String s[] ={"manoj","ma","abc","bca","ma","manoj"};
		Set nonduplicate = new HashSet();
		Set duplicate = new HashSet();
        
		for (String str : s) {
			if(!nonduplicate.contains(str))
				nonduplicate.add(str);
			else
				duplicate.add(str);
		}
		System.out.println(duplicate);


	}

}
