package CodeFights;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(2223));
		
		
	}
	public static int solution(int x){
		
		String num = String.valueOf(x);
		int avg=0;
		int result = 0;
		/*for(int i=0 ; i< num.length(); i++){
			avg=(int) Math.ceil( num.charAt(i) + num.charAt(i+1) )/2;
			
			
		}*/
		return num.charAt(0)-48 ;
	}

}
