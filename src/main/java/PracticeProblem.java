public class PracticeProblem {
	public static void main(String args[]) {

	}
public static int calculate(int num, int num2, char c){
	switch (c){
		case '+':
			return num+num2;
		case '-':
			return num-num2;
		case '*':
			return num*num2;
		case '/':
			return num/num2;
		case '%':
			return num%num2;
		default:
			return (int)Math.pow((double)num, (double)num2);
	}
}

final static int MAXIMUM = 10;
public static boolean totalWordsCheacker(String words){
	
	words=words.trim();
	String[] strArr = words.split(" ");
	if(strArr.length > MAXIMUM){
		return false;
	}
	return true;
}
	
public static String minString(String word, String word2, String word3){
	word = word.toLowerCase();
	word2 = word2.toLowerCase();
	word3 = word3.toLowerCase();
	if (word.compareTo(word2) < 0){
		if (word.compareTo(word3) < 0){
return word;
		}
		else{

		 return word2;
		}
	}
	else if (word2.compareTo(word3) < 0){
return word2;
		}
		else{

		 return word3;
		}

	}
}


