public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArr = evenNum(arr);
        for(int i : evenArr){
            System.out.print(i + " ");
        }
    }

    static int[] evenNum(int[] x) {
        int count = 0;
        for(int i=0;i<x.length;i++){
            if(x[i] % 2 == 0){
                count++;
            }
        }
        int[] even = new int[count];
        int index = 0;
        for(int i=0;i<x.length;i++){
            if(x[i] % 2 == 0){
                even[index] = x[i];
                index++;
            }
        }
        return even;
    }
}