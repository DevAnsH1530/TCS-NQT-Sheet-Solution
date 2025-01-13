// This is the optimal approach which takes O(n) time with O(1) space complexity


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,3,4,4,4};
        System.out.printf("Before removing duplicates\n");
        printArr(arr);

        System.out.printf("After removing duplicates\n");
        removeDuplicates(arr);
        printArr(arr);
    }
    public static int[] removeDuplicates(int[] sortedArr){
        int j = 0;
        for(int i = 1; i<sortedArr.length; i++){
            if(sortedArr[i]!=sortedArr[j]){
                sortedArr[j+1]= sortedArr[i];
                ++j;
            }
            else{
                sortedArr[i] = 'a';
            }
        }
        return sortedArr;
    }
    public static void printArr(int[] arr){
        for(int i: arr){
            System.out.println(i);
        }
    }
}