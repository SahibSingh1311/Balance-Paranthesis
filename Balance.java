//Check for balanced parenthesis, If the given string is not balanced then balance it and
return. string only contain "{" and "}"
import java.util.*;

public class Balance{
public static void main(String[] args){
	String s1 = "{{{{";
	System.out.println(balancePara(s1));
}
static String balancePara(String inp){
	HashMap<Character,Integer> map = new HashMap<>();
	int left = 0, right=0;
	for(int i=0;i<inp.length();i++){
		if(map.containsKey(inp.charAt(i))){
			map.put(inp.charAt(i),map.get(inp.charAt(i))+1);
		}else{
			map.put(inp.charAt(i),1);		
		}
	}
	left = map.get('{')==null?0:map.get('{');
	right= map.get('}')==null?0:map.get('}');
	while(left!=right){
	if(left<right){
		inp = "{"+inp;
		left++; 
		}
	if(right<left){
		inp +="}";
		right++;
		}	
	}
	return inp;
}
}
