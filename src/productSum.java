/**
 * Created on 06/Jan/2021 to Product-Sum
 */
public class productSum {


    public static int findProduct(int[] arrayForPairs){
        int product = 0;

        int lengthOfArray = arrayForPairs.length;

        for(int i = 0; i<lengthOfArray; i++){
            for(int j = i + 1; j<lengthOfArray; j++) {
                product = product + arrayForPairs[i] * arrayForPairs[j];
            }
        }
        return product;
    }

    public static void main(String args[]){
        int[] arrayForPairs = {1,2,3};
        //Expecting pairs: (1,2), (1,3), (2,3) and output: 1*2 + 1*3 + 2*3 = 11
        System.out.println(findProduct(arrayForPairs));
    }

}
