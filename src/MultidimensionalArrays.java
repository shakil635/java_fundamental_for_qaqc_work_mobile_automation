import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        int  [][] array = new int [2][3];
        /*
        multidimension array [2] ai ta colum bole deya hoice ai colum er [3] ta row ase
          1 2 3
          4 5 6
          Colum [2] duita first e bole dete hobe,tarpor oi colum er row [3]  3 ta bole deci
          0 index e first array.
          1 index e second array

         */
        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=3;
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;

        int [][] array1= {{1,2,3},{4,5,6}};
        /*
        multidymontion array Ai vabe o likha jay 1,2,3 first array 4,5,6 second array.

         */

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(array1[i][j]);

                /*
                multidymontion array te multi loop babohar korte hoy.
                first for loop i ta array1 er modde koy ta array ase tar upo loop kore duita array ase tai i<2 mane 0 nd 1index loop kore.
                second j loop ta array1 Ar value upor loop kore, 0 and 1 index duita array te 3 ta kore value ase tai j<3 mane 0,1,2 te loop kore.
                [i][j] print korle all array value print kore.
                 */

            }

        }

       // System.out.println(array1[1][1]); //array1

       // System.out.println(array[0][2]); //array

    }
}
