import java.util.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    //下記条件で文字列出力
    // 「img」：image
    //「doc」：documantation
    //「img」「doc」：prezentaion

    String[] lines = {"img","doc","docimg"};
    for (int i = 0, l = lines.length; i < l; i++) {
      String target = lines[i];
      System.out.println(outputMessage.getOutputMessage(target));
    }
  }
}

//outputmMessage
private static enum outputMessage {
  //outputMessage
  other("other"),
  img("image"),
  doc("documentation"),
  presentation("presentation");

  // フィールドを定義
  private String name;

  // コンストラクタを定義
  private  outputMessage (String name) {
      this.name = name;
  }

  // メソッド
  private String getValue() {
      return this.name;
  }

  public static String getOutputMessage(String target){

    boolean containsImg =checkRegex(target, ".*img.*");
    boolean containsDoc =scheckRegex(target, ".*doc.*");

    if (containsImg && containsDoc) {
      return presentation.getValue();
    } else if (containsImg) {
      return img.getValue();
    } else if (containsDoc) {
      return doc.getValue();
    }

    return other.getValue();
  }
};

private static boolean checkRegex(String target, String pattern){
  Pattern p = Pattern.compile(pattern);
  Matcher m = p.matcher(target);
  if (m.matches()) {
      return true;
  }else{
    return false;
  }
}



public static String[] getStdin() {
  Scanner scanner = new Scanner(System.in);
  ArrayList<String> lines = new ArrayList<>();
  while (scanner.hasNext()) {
    lines.add(scanner.nextLine());
  }
  return lines.toArray(new String[lines.size()]);

}

public static boolean checkRegex(String target, String pattern){
  Pattern p = Pattern.compile(pattern);
  Matcher m = p.matcher(target);
  if (m.matches()) {
      return true;
  }else{
    return false;
  }
}
