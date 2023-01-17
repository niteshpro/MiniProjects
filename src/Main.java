public class Main {
    public static void main(String[] args) {
        System.out.println("Adding the numbers from range");
        int result = sum(0, 10);
        System.out.println("Addition of the range is "+result);
    }

    private static int sum(int start, int end) {
        if(end>start){
            return end + sum(start, end-1);
        }
        else{
            return end;
        }
    }
}