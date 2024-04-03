package sample05;

public class Employee2 {
	public String employeeName;
	public String divisionName;
	public int vitality;

	//「this()」は各コンストラクタの先頭行に記述する。
	//「this()」を先頭行以外に記述した場合、コンパイルエラーとなる。
	public Employee2() {
		this("未設定です");
		System.out.println("引数なしコンストラクタを終了しました");
	}

	public Employee2(String employeeName) {
		this(employeeName, "営業部");
		System.out.println("String型引数1つがあるコンストラクタを終了しました");
	}

	public Employee2(String employeeName, String divisionName) {
		this(employeeName, divisionName, 150);
		System.out.println("String型引数2つがあるコンストラクタを終了しました");
	}

	public Employee2(String employeeName, String divisionName, int vitality) {
		System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}

}
