package exeptions;

public class Main {
    public static void main(String[] args) {
        int arr[] = {23, 4, 6};
        try {
            System.out.println(arr[3]);
            int x = 100 / 0;
        }catch (ArithmeticException e){ // если вышла ошибка, ее можно отследить из ее названия в консоли
            System.out.println("error : " + e);
        }catch (Exception e){
            System.out.println("error : " + e);
        } finally {
            System.out.println("finally is working");
        }
    }
}
