package finalex;

public class Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        // cons.NUM = 200; // 위에서 상수로 선언해서 다른 값은 넣을 수 없음. 오류가 남

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
