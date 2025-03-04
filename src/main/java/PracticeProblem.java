public class PracticeProblem {
	public static void main(String args[]) {
	
	System.out.println(totalWordsChecker("Hello_a b c d e f g h i j"));
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
public static boolean totalWordsChecker(String words){
	words=words.trim();
	if(words.isEmpty()){
		return true;
	}
	String wordsL = words.toLowerCase();
	String wordsU = words.toUpperCase();
	int counter = 0;
	words.replaceAll(",", " ");
	int i = 0;
	while(i<words.length()){
		if(i>=words.length()){
			break;		
			}
		while (wordsL.charAt(i) != wordsU.charAt(i) && i < words.length()){
			i++;
			if(i>=words.length()){
			break;
			}
	}
		counter++;
		if(i>=words.length()){
			break;		
			}
		while ((wordsL).charAt(i) == wordsU.charAt(i) && i < words.length()){
			i++;
			if(i>=words.length()){
			break;		
			} 
				}
			}
			System.out.println(counter);
	if (counter > MAXIMUM){
return false;
	}
	else{
		return true;
	}
}
	
public static String minString(String word, String word2, String word3){
	word = word.toLowerCase();
	word2 = word2.toLowerCase();
	word3 = word3.toLowerCase();
	if (word.compareTo(word2) < 0){ //word comes first
		if (word.compareTo(word3) < 0){ //word comes first again
return word;
		}
		else{
		 return word3;
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


