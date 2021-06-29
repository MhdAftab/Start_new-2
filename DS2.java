import java.util.*;
class prime{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int flag = 0;
		for(int i=2; i*i<n; i++){
			if(n % i == 0){
				flag = 1;
			}
		}
		if(flag == 1){
			System.out.println("Not prime");
		}else {
			System.out.println("Prime");
		}
	}
}
