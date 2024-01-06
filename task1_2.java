public class task1_2 {
    public static void main (String[] args) {
        boolean b = true;
        for (int j = 2; j <= 1000; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            } 
            if (b) System.out.println(j);
            else b = true;
        } 
    }
}
