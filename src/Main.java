public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        division(array,5);
    }
    public static void division(int[] array,int arrayNumber) {
        try {
            int result = array[arrayNumber] / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}