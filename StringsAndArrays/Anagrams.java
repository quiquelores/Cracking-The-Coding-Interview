package StringsAndArrays;

public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areAnagrams("AAA", "ABA"));
		System.out.println(areAnagrams("AAA", "BBB"));
		System.out.println(areAnagrams("AAMAAMAMMAMAMA", "AAMAAMAMMAMAMA"));
	}
	
	public static boolean areAnagrams(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		int[] hitTable = new int[256];
		
		int distinctChar = 0;
		for(int i = 0; i < str1.length(); i++){
			hitTable[str1.charAt(i)]+=1;
			if(hitTable[str1.charAt(i)] == 1)
				distinctChar++;
		}
		int numCleared = 0;
		
		for(int j = 0; j < str2.length(); j++){
			if(hitTable[str2.charAt(j)] <= 0){
				return false;
			}
			hitTable[str2.charAt(j)] -= 1;
			if(hitTable[str2.charAt(j)] == 0){
				numCleared++;
				if(j == str2.length()-1 && numCleared == distinctChar){
					return true;
				}
			}
		}
		return false;
	}

}
