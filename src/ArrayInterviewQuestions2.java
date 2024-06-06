public class ArrayInterviewQuestions2 {

    public static void main(String[] args) {

        int [][] array = {{2,4,5},{3,9,10},{1,2,0}};

        int min =array[0][0];
        int miniColum =0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if(array[i][j]<min){

                    min=array[i][j];

                    //step 1: find the minimum number

                    miniColum=j;

                    //step 2: identify the colum of minimum number
                }

            }


        }

        //step 3: find the maximum number in identifyed colum

        int max=array[0][miniColum];
        int k =0;
        while (k<3){
           if(array[k][miniColum]>max){

               max=array[k][miniColum];

           }
        k++;
        }


        System.out.println(max);
    }
}

/*
step 1: find the minimum number
step 2: identify the colum of minimum number
step 3: find the maximum number in identifyed colum

print max number from the above matrix

 */