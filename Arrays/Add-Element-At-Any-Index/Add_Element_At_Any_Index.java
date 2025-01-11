public class Add_Element_At_Any_Index {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,0,0};

        System.out.printf("\nArray before calling function");
        printArr(arr);

        int[] arr2 = addElementAt(arr, 123, 3);
        
        System.out.printf("\nArray after calling function");
        printArr(arr2);
    }
    public static int[] addElementAt(int[] arr, int value, int index){
        int n = arr.length -1;
        for(int i = n; i<=index; i++){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        return arr;
    }
    public static void printArr(int[] arr){
        for(int el = 0; el < arr.length; el++){
            System.out.println(el+"..."+arr[el]);
        }
    }
}