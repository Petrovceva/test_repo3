public class task1 {
    static int calcSum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calcSum(5));    
    }
}
