class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Try programiz.pro");
        int[] resArr = reverseArr(arr);
        printArr(resArr);
    }
    public static int[] reverseArr(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i= 0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}