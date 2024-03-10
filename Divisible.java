public class Divisible {
    public static void main(String[] args) {
    int sayi1 = 9;
    int sayi2 = 4;

    if (divisible(sayi1, sayi2)){
        System.out.println("Bölünebilir sayıdır.");
    }else{
        System.out.println("Bölünemez sayıdır.");
    }
    }
    public static Boolean divisible (int sayi1, int sayi2){
        return sayi1 % sayi2 ==0;
    }
}