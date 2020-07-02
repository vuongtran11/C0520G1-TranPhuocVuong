package array_and_method.bai_tap;

public class GiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The min element in the array is: " + arr[index]);
    }
    public static int minValue(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=i;
            }
        }
        return min;
    }
}
