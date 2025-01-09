// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Second_Largest {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,1,2};
        
        // System.out.println(secondSmall+"...."+min);
        System.out.println("Second Min "+secondMin(arr));
        // System.out.println("Second Max "+secondMax(arr));
    }
    public static int secondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } 
        }
        return secondMax;
    }
    
    public static int secondMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                secondSmall = min;
                min = arr[i];
            } else if(arr[i] < secondSmall /*&& secondSmall != min*/){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
}