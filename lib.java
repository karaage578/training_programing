import java.util.*;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.*;

private Scanner(){
    Scanner sc = new Scanner(System.in); //標準入力から読み込むScannerを作成
    sc.next(); //改行・空白文字を区切りとして次の文字列を読み込む
    sc.nextLine(); //次の行を読み込む
    sc.nextInt(); //次のintを読み込む
    sc.nextLong(); //次のlongを読み込む
    sc.nextDouble(); //次のdoubleを読み込む
    sc.nextBigInteger(); //次のBigIntegerを読み込む
    sc.nextBigDecimal(); //次のBigDecimalを読み込む
    sc.close(); //スキャナをクローズする(行儀が良い)

    Scanner in = new Scanner(System.in);

    while(in.hasNext()){
        String s = in.next();
    }
}

private kata(){
    int a = 97;
    (char)a; //ASCII 文字コードが 97 である英小文字は a
}

private String (){
    String s = "3billiondevicesrunjava";
    String t = "lion";
    s.length(); //文字列の長さを返す

    s.equals(t); //一致するか調べる
    s.join(",", "apple", "orange", "melon") //apple,orange,melon
    s.substring(2,5); //部分文字列を返す index 2から、4まで抽出

    s.compareTo(t); //辞書順で比較する
    s.charAt(0); //指定したインデックスの値を返す

    s.toCharArray(); //文字列を表すchar[]を返す
    s.indexOf(t); //指定した文字列が最初に出現するインデックスを返す
    s.lastIndexOf(t); //指定した文字列が最後に出現するインデックスを返す
    s.startsWith(t); //文字列が指定された接頭詞で始まるか判定する
    s.endsWith(t); //文字列が指定された接尾詞で終わるか判定する
    s.contains(t); //指定した文字列を含むか調べる
    s.matches("\\w+"); //指定した正規表現と一致するか判定する
    s.toLowerCase(); //小文字に変換する
    s.toUpperCase(); //大文字に変換する
    s.replace('b','m'); //文字を置換する
    s.replace("b","tri"); //文字列を置換する
    s.replaceAll("[0-9]+","10"); //正規表現を用いて置換する
    s.split("n"); //文字列を正規表現によって分割する
    String.format("%04d", 123); //フォーマットした文字列を返す
    String.valueOf(5); //Integer.toString(5) と同じ
}

private static setArray(){
    int[] a = new int[N];
    Arrays.setAll(a, i -> sc.nextInt());
}

public static StringBuilder (String s,int n) {
    StringBuilder sb = new StringBuilder();
    sb.append("hoge"); //hogeを末尾に追加
    sb.append(3);      //3を末尾に追加
    sb.toString();     //-> hoge3
}


private Pattern(){
    //*	直前の1文字の0回以上の繰り返しと一致 hoge*	hogeもしくはhogee...と一致
    // .*   0文字以上の任意の文字列
    //.+    1文字以上の任意の文字列
    //^	行の先頭	^[0-9]	行頭が数字
    //$	行の末尾	^.{10}$	10文字の行
    //[ ]	カッコ内の任意の1文字と一致。「-」で範囲指定可。	[a-z]	小文字のアルファベット1文字と一致
    //[^ ]	カッコ内の任意の1文字と不一致。「-」で範囲指定可。	[^A-Z]	大文字のアルファベット以外
    //+	直前の文字の1個以上の繰り返しと一致	hoge+	hogee...と一致
    //?	直前の文字が0個または1個の場合に一致	hoge?	hogeもしくはhogと一致
    //{ }	カッコ内の数値の繰り返しと一致	{n}	直前の文字のn個の繰り返しと一致
    //{m,n}	直前の文字のm個以上、n個以下の繰り返しと一致
    //|	直前、直後どちらかのパターンに一致	hoge|piyo	hogeまたはpiyo

    String a = "A[A-Z]*Z"; //先頭がA、、末尾がZ
    String b = "^[0-9a-zA-Z]+$"; //英数字のチェック
    String c = "^[0-9]{4}/[0-9]{2}/[0-9]{2}$"; //日付
    String d = "^[0-9]{3}-[0-9]{4}-[0-9]{4}$"; //電話番号

    Pattern p = Pattern.compile("<([0-9]+),([0-9]+)>");
    Matcher m = p.matcher("<12,345>");
    if (m.matches()) {
        System.out.println(m.group(1) + " " + m.group(2));
    }else{
        System.out.println("fail");
    }

}

private cellection(){
    Collection<Integer> c = new ArrayList<>();
    c.size();   //要素数を返す
    c.isEmpty();//空かどうかを返す。 (c.size() == 0) と同じ
    for(int x:c) {
    //インデックスが不要な場合は、拡張for文を書ける。
    }
}

private ArrayList(){
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1); //要素の末尾への追加
    al.get(0); //ランダムアクセス
    al.remove(al.size() - 1); //末尾の要素の削除
    Arrays.toString(al); //[1,0]
}

private HashMap(){
    HashMap<Integer, Integer> hm = new HashMap<>();
    hm.put(1, 1);      //キーと値の組の追加
    hm.containsKey(1); //キーがマップに含まれているか判定
    hm.get(1);         //キーに対応する値を返す
    hm.keySet();       //キーの一覧のSetを返す
    hm.values();       //値の一覧のSetを返す
    hm.entrySet();     //エントリーの一覧のSetを返す
}
