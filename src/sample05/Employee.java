package sample05;

public class Employee {

    public String employeeName;
    public String divisionName;
    public int vitality;

    //コンストラクタは戻り値を記述しない。
    //コンストラクタはvoidを記述しない。
    //voidを記述すると通常のメソッドとして認識される　→　コンパイルエラーも起きない
    public Employee() {
        System.out.println("インスタンス化時にコンストラクタが呼ばれました");
        employeeName = "未設定";
        divisionName = "営業部";
        vitality = 0;
    }

    public Employee(String employeeName, String divisionName, int vitality) {
        System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");

        //「this.」はこのクラス内のフィールドを指す。
        //「this.」を使用するときは、引数の名称と変数名を合わせた方がわかりやすい。
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public void introduce() {
        vitality = vitality - 10;
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }


    public void greeting() {
        vitality = vitality - 10;
        System.out.println("おはようございます");
    }


    public void report() {
        vitality = vitality - 10;
        System.out.println("今日は10件アポイント取りました");
    }


    public void showVitality() {
        vitality = vitality - 10;
        System.out.println("残り体力は" + vitality);
    }


    public void goToWork() {

    }


    public void leaveWork() {

    }
}

