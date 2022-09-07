import java.util.*;

public class BalanceUpdated{
public static void main(String[] args){
	String s1 = "{{{{";
	System.out.println(balanceBraces(s1));
}
static String balanceBraces(String inp){
	int open=0, close=0;
	for(int i=0;i<inp.length();i++){
		if(inp.charAt(i)=='{'){
			open++;
		}else{
			close++;		
		}
	}
	int dif= open>close?open-close:close-open;
	if(open<close){
		inp ="{".repeat(dif)+inp;
	}else{
		inp += "}".repeat(dif);
	}
	return inp;
}
}