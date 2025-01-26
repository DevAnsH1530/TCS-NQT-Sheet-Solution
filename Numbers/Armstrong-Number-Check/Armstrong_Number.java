// An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits
 class Armstrong_Number {

  
    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
    }
    public static boolean isArmstrong(int num){
        int temp  = num;
        String expo = ""+num; //Convert the num into String
        int expo1 = expo.length(); // Calculate the length of the String
        int sum = 0;
        while(temp>0){
            int remainder = temp % 10;
            sum = sum +(int) Math.pow(remainder,expo1);
            // System.out.println(sum);
            temp /= 10;
        }
        return sum == num;
    }
}
