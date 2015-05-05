package code;

public class solution {

	public int count_e(String s) {
		int count = 0;
		for (char c: s.toCharArray()){
			if (c == 'e') {
				count = count + 1;
			}	
		}
		return count;
	}
	
	public int count_one_char(String s, char c){
		int count = 0;
		for (char x: s.toCharArray()){
			if (x == c){
				++count;
			}
		}
		return count;
	}
	
	public String encode(String s){
		String a = "";
		char[] plainAlpha = {'A','a','B','b','C','c','D','d','E','e',
		                     'F','f','G','g','H','h','I','i','J','j',
		                     'K','k','L','l','M','m','N','n','O','o',
		                     'P','p','Q','q','R','r','S','s','T','t',
		                     'U','u','V','v','W','w','X','x','Y','y',
		                     'Z','z'};
		char[] cipherAlpha = {'N','n','O','o','P','p','Q','q','R','r',
                			  'S','s','T','t','U','u','V','v','W','w',
                			  'X','x','Y','y','Z','z','A','a','B','b',
                			  'C','c','D','d','E','e','F','f','G','g',
                			  'H','h','I','i','J','j','K','k','L','l',
                			  'M','m'};
		for (char c: s.toCharArray()){
			int index = -1;
			for (int i = 0; (i < plainAlpha.length) && (index == -1); i++){
				if (plainAlpha[i] == c){
					index = i;
				}
			}
			if (index == -1){
				a += c;
			}
			else {
				a += cipherAlpha[index];
			}
		}
		return a;
	}
	
	public String encode2(String s, String k){
		String a = "";
		char[] plainAlpha = {'A','B','C','D','E','F','G','H','I','J',
                			 'K','L','M','N','O','P','Q','R','S','T',
                			 'U','V','W','X','Y','Z'};
		char[] cipherAlpha = {};
		for (int i = 0; i < plainAlpha.length; i++){
			int index = 0;
			for (char c: k.toCharArray()){
				if (c == plainAlpha[i]){
					cipherAlpha[index] = c;
					
				}
			}
		}
		for (char c: s.toCharArray()){
			int index = -1;
			for (int i = 0; (i < plainAlpha.length) && (index == -1); i++){
				if (plainAlpha[i] == c){
					index = i;
				}
			}
			if (index == -1){
				a += c;
			}
			else {
				a += cipherAlpha[index];
			}
		}
		return a;
	}

}
