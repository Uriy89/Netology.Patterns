package homeworks.homework2_2;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int i = Integer.parseInt(a, 2);
        int j = Integer.parseInt(b, 2);
        int res = i +j;
        return Integer.toBinaryString(res);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int i = Integer.parseInt(a, 2);
        int j = Integer.parseInt(b, 2);
        int res = i * j;
        return Integer.toBinaryString(res);
    }
}
