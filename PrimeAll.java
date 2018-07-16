package janani;
import java.util.Scanner;
public class PrimeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j,n;
//for(i=10;i<=99;i++){
	int count=0;
	Scanner ja=new Scanner(System.in);
	n=ja.nextInt();
	for(j=1;j<=n;j++){
		if(n%j==0){
			count ++;
			}
	}
	if(count==2){
		System.out.print("prime");
	}
	else{
		System.out.println("not prime");
	}
}

	}

//}	
