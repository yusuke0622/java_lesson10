public interface Calc {
    //メンバ変数定義
    public String str = "足し算";
    public int a = 3;
    public int b = 6;
    // メソッドのみ宣言
    void method1();
    void method2(String str);
    void method3();
    
    //static インスタンス生成なしで呼び出せる
    public static void method4() {
        System.out.println("計算結果:" + (b / a));
    }
}