package StringsAndArrays;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] res = removeDuplicates("asdasasdfeeeghji".toCharArray());
		System.out.println(String.valueOf(res));
	}
	
	public static char[] removeDuplicates(char[] str){
		boolean[] hit = new boolean[256];
		int index = 0;
		for(int i = 0; i < str.length; i++){
			if(!hit[str[i]]){
				hit[str[i]] = true;
				str[index] = str[i];
				index++;
			}
		}
		for(int j = index; j < str.length; j++){
			str[j] = '\0';
		}
		return str;
	}

}
