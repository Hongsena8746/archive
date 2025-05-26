package exam01;

public class excer05 {

	public static void main(String[] args) {
		//main()메소드 매개변수
		if(args.length !=2) {  // 입력된개수가 2개가 아닐경우
			System.out.println("값의 수가 부족하다");
			System.exit(0);  //프로그램 강제종료
		}
		String strNum1 = args[0];  //첫번째데이터얻기
		String strNum2 = args[1];  //두번째데이터얻기
		
		 int num1 = Integer.parseInt(strNum1);  //문자열을 정수로 변환
		 int num2 = Integer.parseInt(strNum2);  //문자열을 정수로 변환
		 
		 
		 
		 //run -> run configurations -> main -> project와 main class확인후
		 //aguments탭 실행후 program aguments 에  2개 숫자 띄어서 입력후 apply-> run누르면
		 //실행창에 입력한 수가 보여진다.
		 int result = num1+num2;
		 System.out.println(num1+ " + " + num2 + "=" +result);
		      // 현재 33 55 입력함
	}

}
