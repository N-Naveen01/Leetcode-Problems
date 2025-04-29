class Solution {
    public int splitNum(int num) {
        char[] arr = String.valueOf(num).toCharArray();

        Arrays.sort(arr);

        int num1=0 , num2=0;

        for(int i=0, j=1; i< arr.length ; i+=2 , j+=2 ){
            num1=num1*10 + (arr[i] -'0');

            if(j<arr.length){
                num2 = num2*10 +(arr[j]-'0');
            }
        }

        return num1+num2;
    }
}