
//find minimum number in the multid dimensional array.int [][] array = {{2,4,6},{3,4,7},{2,2,9},{1,3,4}}; output:1

import java.util.Arrays;

public class ArrayInterviewQuestions {

    public static void main(String[] args) {

        int [][] array = {{2,4,6},{3,4,7},{2,2,9},{1,3,4}};
       // int[] a = {1,2,3,40};
       // System.out.println(Arrays.toString(a));          //single array print system
      //  System.out.println(Arrays.deepToString(array));  //multi array print system
        System.out.println(array[0][0]);
        int min =array[0][0];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println();

                if(array[i][j]<min){

                    /*
                    akta multi array neya hoice.array theke sobtheke soto number k pritn korte hobe.
                    akta variable neya hoice name min.min er modde Colum first  index, and Row first index bole deya hoce.
                    for i loop koto gula array ase tar upor and for j loop array gular value upor loop kore.
                    array[i][j] k min Er sate compera kora hocce jodi min er theke soto hoy tahole min er modde add kora hobe
                     */

                    min=array[i][j];
                }

            }


        }
        System.out.println(min);
    }
}
