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
		
		member[0] = new Member(1,"aaa","임영웅","010-1111-1111","서울");
		member[1] = new Member(2,"bbb","영탁","010-2222-3333","부산");
		member[2] = new Member(3,"ccc","손흥민","010-555-6666","전주");
		member[3] = new Member(4,"ddd","박지성","010-7777-8888","대구");
		member[4] = new Member(5,"eee","차두리","010-8888-9999","경기도");

				
	
		for(int i= 0; i< members.length; i++) {
			System.out.printf("%d번회원의 아이디는 %s이고,이름은 %s,전화번호%s,주소%s"\n",
				members[i]=memberNo, members[i]=memberId, members[i]=memberName members[i]=memberPhone, members[i]=memberAddress);
		}
	}
}

