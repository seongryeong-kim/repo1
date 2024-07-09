package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.printName();
		System.out.println(c1.name);
		String str = c1.getName();
		System.out.println(str); //이건 parent의 name 나옴
		
		c1.setName("자식이 보낸 이름");
		System.out.println(c1.name);
		
		//둘 다 name이라는 게 있을 때 어떤게 출력될까 
		//-->Child의 name이 뜬다 
	}

}
