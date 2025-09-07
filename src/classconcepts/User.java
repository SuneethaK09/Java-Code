package classconcepts;

public class User {

	int i = 10;
	
	String name;
	int age;
	char gender;

	public static void main(String[] args) {

		User p1 = new User();
		p1.name = "Asha";
		p1.age = 28;
		p1.gender = 'F';

		User p2 = new User();
		p2.name = "Rita";
		p2.age = 30;
		p2.gender = 'F';

		User p3 = new User();
		p3.name = "John";
		p3.age = 31;
		p3.gender = 'M';

		User p4 = new User();
		p4.name = "Tony";
		p4.age = 25;
		p4.gender = 'M';

		p1 = p2;
		System.out.println("-------p1=p2-------");
		System.out.println(p1.name + " " + p1.age + " " + p1.gender); // Rita 30 F
		System.out.println(p2.name + " " + p2.age + " " + p2.gender); // Rita 30 F
		System.out.println(p3.name + " " + p3.age + " " + p3.gender); // John 31 M
		System.out.println(p4.name + " " + p4.age + " " + p4.gender); // Tony 25 M

		p2 = p3;
		System.out.println("-------p2=p3-------");
		System.out.println(p1.name + " " + p1.age + " " + p1.gender); // Rita 30 F
		System.out.println(p2.name + " " + p2.age + " " + p2.gender); // John 31 M
		System.out.println(p3.name + " " + p3.age + " " + p3.gender); // John 31 M
		System.out.println(p4.name + " " + p4.age + " " + p4.gender); // Tony 25 M

		p3 = p4;
		System.out.println("-------p3=p4-------");
		System.out.println(p1.name + " " + p1.age + " " + p1.gender); // Rita 30 F
		System.out.println(p2.name + " " + p2.age + " " + p2.gender); // John 31 M
		System.out.println(p3.name + " " + p3.age + " " + p3.gender); // Tony 25 M
		System.out.println(p4.name + " " + p4.age + " " + p4.gender); // Tony 25 M

		p4 = p1;
		System.out.println("-------p4=p1-------");
		System.out.println(p1.name + " " + p1.age + " " + p1.gender); // Rita 30 F
		System.out.println(p2.name + " " + p2.age + " " + p2.gender); // John 31 M
		System.out.println(p3.name + " " + p3.age + " " + p3.gender); // Tony 25 M
		System.out.println(p4.name + " " + p4.age + " " + p4.gender); // Rita 30 F

	}

}
