package step00_과제;

/*[문제 42] 다음 프로그램을 완성하시오  ==> 도전과제
(1)클래스명 : Health
      +gender:char        (성별)
      +tall:double          (신장)
      +weight:double     (체중)
      +Health()
      +input():void          - 성별, 신장, 체중을 입력받는다
      +output():String     - 성별, 신장, 체중을 문자열로 만들어 리턴한다

(2)클래스(Test42) 에서 Health를 상속받음
        -fat:double            (비만도)
        -result:String         (결과값)
        +Test42()
        +calculate():void      - 비만도를 계산하여 결과(저체중,경도비만....)를 구한다
        +output():String      - 결과를 문자열로 만들어 리턴한다

(3) 표준체중계산법
    남성 : 표준체중 = (신장-100)*0.9
    여성 : 표준체중 = (신장-100)*0.85

    비만도 = 현재체중(Kg)/표준체중(Kg)*100
    ---------------------------------------------------------
    90%이하  : 저체중               121-130% : 경도비만
    91 -110% : 정상(표준체중)   131-150% : 중도비만
    111-120% : 과체중              150%     : 고도비만
(4) Test42클래스 main()에서 아래코드를 작성한다(더 이상 코드는 추가하지 않는다)
     Test42 ob=new Test42();
     System.out.println(ob.output());

[결과화면]
   성별(M/F)을 입력하시오: M               <---남(M) / 여(F)
   신장(Cm)을 입력하시오: 175.3
   체중(Kg)을 입력하시오: 95.45

   **비만도 측정 결과**
   성별: M 
   신장: 175.3Cm
   체중: 95.45Kg
   결과: 당신은 비만도 140.84이고  중도비만 입니다.*/
class Health{
	public char gender;
	public double tall,weight;
	
	public Health() {
	}
	public void input() {}
	public String output() {
		return "";
	}
}

public class Test42 extends Health {
	private double fat;
	private String result;
	
	public Test42() {}
	public void calculate() {}
	public String output() {
		return "";
	}

	public static void main(String[] args) {
		Test42 ob=new Test42();
	    System.out.println(ob.output());
	}

}
