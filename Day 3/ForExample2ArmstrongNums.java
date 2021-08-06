public class ForExample2ArmstrongNums {
    public static void  main(String[] args){
        int temp,units,tenth,hundreds,total;
        for(int i=100;i<=999;i++){
            temp = i;

            units=temp %10;
            temp/=10;

            tenth=temp%10;
            temp/=10;

            hundreds=temp%10;
            temp/=10;

            total=(units*units*units)+(hundreds*hundreds*hundreds)+(tenth*tenth*tenth);
            if(total==i){
                System.out.println(i+" is a armstron num");
            }
        }
    }
}
