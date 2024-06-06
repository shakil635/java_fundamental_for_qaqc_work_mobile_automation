

public  class StringLearn {

    public static void main(String[] args) {


        //  payment $100 paid
        String str = "payment $100 paid";

        System.out.println(str.charAt(8));
        /*
         .charAt(int)    String er j kono index (renge er modde) bole dele oi index e j string character thake ta pao jay  charAt babohar kora hoy.Example 8 index e $ ase.
         */

        String str1 ="payments $100 paid";

        System.out.println(str1.indexOf("$"));
        /*
        .indexOf(String)  String er element koto index e ase ta janar jonno indexOf babohar kora hoy.
         */

        System.out.println(str1.substring(9));

        /*
        .substring(int)  deya index bole dele oi  index theke tar poroborti index er sob String pao jay.
        Example: $100 paid , $ er index 9 tar 9 theke ses porjonto print hoice.
         .substring(9,11) bole dele print hobe $1 11index includ hoy na.

         */


    }

}


// 136 number video 5 theke buji nai 7 mint porjonto
