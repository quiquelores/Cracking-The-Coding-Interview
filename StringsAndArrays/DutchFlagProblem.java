package StringsAndArrays;

public class DutchFlagProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 1, 5, 3, 6, 2};
		int[] sol = sort(arr);
		for(int i =0 ; i < arr.length; i ++) {
			System.out.println(sol[i]+ " " + arr[i]);
		}
	}
	public static boolean isLow(int i){
		return (i== 1 || i ==2);
	}
	public static boolean isMed(int i){
		return (i== 3|| i ==4);
	}
	public static boolean isHigh(int i){
		return (i== 5 || i ==6);
	}
	
	
	public static int[] sort(int[] array){

	    int numlows = 0;
	    int nummeds = 0;
	    int numhighs = 0;
	    for(int i = 0; i < array.length; i++){
	        if(isLow(array[i])) numlows++;
	        if(isMed(array[i])) nummeds++;
	        if(isHigh(array[i])) numhighs++;
	    }
	    int lowptr = 0;
	    int medptr = numlows;
	    int highptr = numlows+nummeds;

	    while(lowptr < numlows){
	        if(isLow(array[lowptr])) lowptr++;
	        else if(isMed(array[lowptr])){
	            int temp = array[lowptr];
	            array[lowptr] = array[medptr];
	            array[medptr++] = temp;
	        }
	        else if(isHigh(array[lowptr])){
	            int temp = array[lowptr];
	            array[lowptr] = array[highptr];
	            array[highptr++] = temp;
	        }
	    }
	    while(medptr < numlows+nummeds){
	        if(isMed(array[medptr])) medptr++;
	        else if(isHigh(array[medptr])){
	            int temp = array[medptr];
	            array[medptr] = array[highptr];
	            array[highptr++] = temp;
	        }
	    }
	    return array;
	}
}
