package arrays;

public class Arrays{


    /*
        One cannot compute the sum of elements of an array without visiting them if array elements are 
        not known in before hand.

        If the array elements are known in before hand, we can compute in O(1) time and O(1) space complexity
    */


    //O(n) solution
protected long sumOfElements(int[] arr){
        int sum=0;
        for(int i:arr){

            sum=sum+i;

        }

        return (long)sum;

}



protected long sumOfnNaturalNumbers(int[] arr){
    int sum=0;

    int n=arr.length;

    sum=(n*(n-1)/2);

    return (long)sum;
}










}