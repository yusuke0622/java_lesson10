public class Main {
    
    public static void main(String[] args) {
       //オブジェクトを作成する必要がある
        Add add = new Add();
        add.method1();
        add.method3();
        Multiply mul = new Multiply();
        mul.method2("掛け算");
        mul.method3();
        Calc.method4();
    }
}