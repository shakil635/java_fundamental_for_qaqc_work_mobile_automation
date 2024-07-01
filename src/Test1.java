
public class Test1{
    public static void main(String[] args) {
        int[][] array = {{2, 4, 6}, {3, 4, 7}, {2, 2, 9}, {1, 3, 4}};


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println("\n");
        }

    }



}









//public class Test1 {
//
//    public  boolean isPalindrom(String str){
//
//        String string = "";
//        for (int i = str.length()-1; i >=0 ; i--) {
//          string = string +  str.charAt(i);
//
//        }
//if(!str.equals(string)){
//    return  true;
//}else{
//    return  false;
//}
//       // return str.equals(string);
//
//    }
//}

/*

Logical AND (&&): Both conditions must be true.
Logical OR (||): At least one condition must be true.
Equals (equals method): Checks if two strings have the same content.
Not Equals (!equals method): Checks if two strings have different content.
 */