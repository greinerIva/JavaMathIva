public class Code {
    public static double agv(int[] arr){
        double num = 0;
        if (arr != null && arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                num += arr[i];
            }
            num = num / arr.length;
        }
        return num;
    }
}
