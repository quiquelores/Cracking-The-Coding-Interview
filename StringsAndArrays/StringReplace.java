package StringsAndArrays;

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = {'a', ' ', 'i', 's', ' ', ' ', 'm', 'y', 'f', 'r', 'i', 'e', 'n', 'd', ' ', 0,0,0,0,0,0,0,0};
		int length = array.length - 8;
		System.out.println(String.valueOf(replaceSpaces(array, length)));
	}
	
	public static char[] replaceSpaces(char[] string, int length){
		int spaceCount = 0;
		for(int i = 0; i < string.length; i++){
			if(string[i] == ' ')
				spaceCount++;
		}
		int index = length + spaceCount*2 -1;
		
		for(int a = length-1; a >= 0; a--){
			if(string[a] != ' ')
				string[index--] = string[a];
			else{
				string[index--] = '0';
				string[index--] = '2';
				string[index--] = '%';
			}
		}
		return string;
	}

}
