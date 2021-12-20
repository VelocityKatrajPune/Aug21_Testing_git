package test;

public class Interview1 {

	public static void main(String[] args) {
		String s="anu123rty23yh";

		String num="";
		String ch="";

		for(int i=0;i<=s.length()-1;i++){
		char c= s.charAt(i);
		if(Character.isDigit(c)){

		num=num+s.charAt(i);
		}

		else{

		ch=ch+s.charAt(i);
		}

		}

		System.out.println("All digit in given string =" +num);
		System.out.println("All chara in given string =" +ch); 

	
	}

}
