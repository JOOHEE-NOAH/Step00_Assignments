package step00_과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제15] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
난수발생) 
          1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
          2. ① import java.util.Random;
             ② Random 변수1 = new Random();
             ③ int 변수2 = 변수1.nextInt(최대값); 
                      ==>  0 ~ (최대값 - 1)사이의 임의의 수

[실행결과]

*** 난수가 발생하였습니다.맞추어 보세요.*** 
숫자 입력 : 50
컴퓨터의 숫자가 더 큽니다.

숫자 입력 : 90
컴퓨터의 숫자가 더 작습니다.
 :
 :

숫자 입력 : 83
추카추카...xx번만에 맞추셨습니다. 
다시 할까요(Y/y): n

**수고 하셨습니다 **
*/
public class Test15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		char ck;
		int count=0;
		
	
	do {System.out.println("*** 난수가 발생하였습니다.맞추어 보세요.***");
	 	int a=(int)(Math.random()*100);// 0 - 99 사이의 난수

	 	
		do {
			System.out.print("숫자 입력 : ");
		num=Integer.parseInt(br.readLine());
		if (num>a) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
		}else if(num<a) {
				System.out.println("컴퓨터의 숫자가 더 큽니다."); 	
		}
		count++;
		} while(num!=a); {
					
		}System.out.println("추카추카..."+count+"번만에 맞추셨습니다.");
		
	
				System.out.print("다시 할까요?(y/Y) ");
				ck=br.readLine().charAt(0);				
		}while(ck=='y' || ck=='Y');
			System.out.println("***** 수고하셨습니다 *****");
			System.exit(0);
}
}
