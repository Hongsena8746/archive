package excer01;

public class Member {

		int memberNo;
		String memberId;
		String memberName;
		String memberPhone;
		String memberAddress;

		public Member(int memberNo, String memberId, String memberName, String memberPhone, String memberAddress){
			this.memberNo = memberNo;
			this.memberId = memberId;
			this.memberName = memberName;
			this.memberPhone = memberPhone;
			this.memberAddress = memberAddress;
			
		}

public class ArrayTest{
	
}
	public static void main(String[] args) {
		Member[]members = new Member[5];
		
		member[0] = new Member(1,"aaa","�ӿ���","010-1111-1111","����");
		member[1] = new Member(2,"bbb","��Ź","010-2222-3333","�λ�");
		member[2] = new Member(3,"ccc","�����","010-555-6666","����");
		member[3] = new Member(4,"ddd","������","010-7777-8888","�뱸");
		member[4] = new Member(5,"eee","���θ�","010-8888-9999","��⵵");

				
	
		for(int i= 0; i< members.length; i++) {
			System.out.printf("%d��ȸ���� ���̵�� %s�̰�,�̸��� %s,��ȭ��ȣ%s,�ּ�%s"\n",
				members[i]=memberNo, members[i]=memberId, members[i]=memberName members[i]=memberPhone, members[i]=memberAddress);
		}
	}
}

