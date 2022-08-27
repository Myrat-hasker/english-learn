public class Helper {
    private int[] arr = new int[30];
    private int count = 0;
    public int random(int min, int max){
        int range = max - min;
        int n = (int)(Math.random() * range) + min;
        if (arr[0] == 0) {
            arr[count++] = n;
        } else{
        for (int i = 0; i < count; i++) {
            if (n == arr[i]) {
                n = (int) (Math.random() * range) + min;
                i = 0;
            }
        }
        arr[count++] = n;
        }
        return n;
    }
}
