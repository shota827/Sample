package sample05;

public class ObjectSample {

	public static void main(String[] args) {
		Employee emp01 = new Employee();
        emp01.introduce();
        emp01.showVitality();

        Employee emp02 = new Employee("原川", "営業部", 250);
        emp02.introduce();
        emp02.greeting();
    }

}
