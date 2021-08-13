public class Practice1 {
    public static void main(String[] args) {
        int count=0;
        int num = 2;
        while (count < 50) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime==true){
                count++;
                if(count%10==0){
                    System.out.println(num);
                }
                else{
                    System.out.print(num+" ");
                }
            }
            num++;
        }
    }
}
