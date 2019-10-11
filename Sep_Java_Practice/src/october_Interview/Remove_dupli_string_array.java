package october_Interview;

import java.util.HashSet;
import java.util.Set;
import base_package.BaseClass_Methods;

public class Remove_dupli_string_array extends BaseClass_Methods{

	public static void main(String[] args) {
		String s[] = {"ma","ma","manoj","abc","abc"};
		StringBuffer sb=new StringBuffer();
		Set removeString = new HashSet();
		for (String str : s) {
			if(!removeString.contains(str)){
				removeString.add(str);
				sb.append(str+" ");
        	}
		}		
		System.out.println(sb.toString());

	}
}
