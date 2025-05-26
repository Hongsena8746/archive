
public class MiniProject01 {
	
	public static void classSort(int[] n) {   //정렬
		int num = n.length;   //배열의 n의 길이 구해서 변수 num에 저장해주기 배열길이 8개
		
					//i는 현재 정렬위치로
		for(int i=0; i<num -1; i++) {	//-1 ->num -1까지만들게 / 앞에서부너 하나씩 정렬해 나가기위해서
			int minIndex = i;	//minIdex =i 가장 최소값으로 가정해서  minIndex에 저장하기
			
			for(int j=i +1; j<num; j++) {	//i 다음위치부터 끝까지 순회하면서 더 작은값이 발견되면
				if(n[j]< n[minIndex]) {		//minIndex로 만들어줌
					minIndex = j;	//가장작은값을 찾기
				}	
			}
			
			 int temp = n[minIndex];	//위에서 가장 작은 값저장
	           n[minIndex] = n[i];		//n[minIndex]가 n[i] 값이 교환
	           n[i] = temp;		//i 위치에는 가장 작은 값이 오게 된다
	           
	           System.out.println("Sorted Data " + (i + 1) + "단계:"); //몇번째 정렬단계인지 출력해주기
	            printArray(n);		//현재배열상태를 출력해주기
		}
	}
	
	public static void printArray(int[]arr) {	//정수배열을 받아서 출력하기
		for(int num : arr)  {				//for문을 사용해서 배열의요소를 하나씩 꺼내서 출력하기
			System.out.print(num + " ");	//각숫자를 공백붙여서 한줄로 출력하기
		}
		System.out.println();	//줄바꿔주기
	}
			
		
		
	public static void main(String[] args) {     //실행MAIN
		int[]InputData = {69,10,30,2,16,8,31,22};  //정수형배열 선언 및 초기화하기 배열은 8개
		
		
		 System.out.println("Input Data"); 	//인풋데이터를 문장으로 출력 예시참고
		 printArray(InputData);			//print array()메서드를 호출해서 배열내용출력하기
		 System.out.println();			//빈줄 출력하기	
		 
		 classSort(InputData);			//class sort(inputData)를 호출해서 배열 오름차순으로 정렬하기
		 System.out.println();			//다시 빈줄 출력하기
	}

}
