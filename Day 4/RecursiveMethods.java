public class RecursiveMethods {
    static int add(int x) {
        int total = 0;
        for (int i = 1; i <= x; i++) {
            total += i;
        }
        return total;
    }

    static int r(int x) {
        if(x==1){
            return 1;
        }
        return x + r(x - 1);
    }

    public static void main(String[] args) {

    System.out.println(r(10));
    }
}
