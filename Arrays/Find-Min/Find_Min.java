public class Find_Min {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,2,3,2341,-2,-2,0};
        int min = findMin(arr);
        System.out.println("Min element for the input array is "+ min);
    }
    
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}