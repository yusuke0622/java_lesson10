# インターフェース　　　
約束、メソッドの実装強制  
インターフェースによるメソッドの実装強制という約束をすることで、「今現在、存在するプログラム」が「今はまだ存在しない未来に作られるプログラム」を利用する事が出来る。　　

## 例　　
動画再生ソフト  　　
1.動画ファイルにはいろいろな形式がある  　
2.動画再生ソフトの求められる機能は再生、停止、一時停止、早送り、戻しなどある程度約束されている  
つまりは、1.動画データを読み取るプログラム　　　2.読み取った動画データを操作するプログラムがある  　　
将来的に新しい動画再生ソフトが開発されても、２の操作部分の変更はほぼ変わらないため、その度に全体的に大きなプログラムの変更は必要ない。  
インターフェースによってメソッドの実装が約束されていれば、既存のプログラムの変更を加えることなく機能を利用できる。  
新しく開発された「XXXXX形式用動画データ読み込みプログラム」にインターフェースを実装する(ひもづけする)事でこのプログラムは「メソッドの実装を約束する」事になる。  


## 多重継承　　
多重継承とは1つのクラスが複数の親クラスを持つことを言います。多重継承をすることにより、1つのクラスは2つのクラスの性質を同時に受け継ぐ事になります。
```
//インターフェースの宣言
interface Add{
    //メンバ変数(定数)
    public int A = 3;
    public int B = 6;
    
    //メソッド(型のみ宣言)
    void method(String str);
    void add();
}

//インターフェースの宣言
interface Multiply{
    //メンバ変数(定数)
    public int A = 4;
    public int B = 8;
    
    //メソッド(型のみ宣言)
    void method(String str);
    void mul();
}

//インターフェースの実装
class Calc implements Add, Multiply{
    public void method(String str) {
        // 文字列の表示
        System.out.println(str + "をします");
    }
    public void add() {
        // Addインターフェース内の足し算
        System.out.println("計算結果: " + (Add.A + Add.B));
    }
    public void mul() {
        // Multiplyインターフェース内の掛け算
        System.out.println("計算結果: " + (Add.A * Add.B));
    }
}

//実行Mainクラス
public class Main {
 
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.method("足し算");
        calc.add();
        calc.method("掛け算");
        calc.mul();
    }
 
}
```





