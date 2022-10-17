public class BinOps {
    public String sum(String a, String b) {
    /*Перевод чисел из двоичной записи в строках в int, их сумма
      и переведение обратно в двоичную запись*/
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int sum = a1 + b1;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
        return result;
    }

    public String mult(String a, String b) {
     /*Перевод чисел из двоичной записи в строках в int, их перемножение
      и переведение обратно в двоичную запись*/

        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int sum = a1 * b1;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
        return result;
    }
}
