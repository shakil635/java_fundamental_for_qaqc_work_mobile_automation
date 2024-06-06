public class Main {
    /*
    Main ai class er nam ja uppercase deya suru hoy.
public mane all class theke ai mainta re call kora jabe koo restriction nai.
     */


    public static void main(String[] args) {
        //static deyar karon hocce ai class er kono instance na banaiya direct call kora jabe


        System.out.println("Hello World!");
        /*
        System hocce akta java package ja system system-related resources acces korte hlp kore.
out is an instance of PrintStream.
         */


        int a = 2;
        int b = 3;
        int c = a + b;
//dui ti number k add kora ba maines kora jay ai vabe

        System.out.println("sum of:" + c);
   /*
  "sum of:" + c output hobe sum of:5 jodi string er sate onno kono type print kora te chai.
 *"sum of:",+ c coma not allowed
    */


        Basic2 basic2 = new Basic2();

        /*
         onno class k main ba onno kono khan e call korte age akta tar instance toiri korte hobe.
         example: Basic2() onno class theke asce aitar akta instance banano hoice basic2
         */

        System.out.println(basic2.HeaderName());
       /*
       Basic2 hocce class name r Ai class Er instance basic2.basic2 dot deya oi class Er method HeaderName k call kora hoice ja akta int number return kore.

        */

    }


}



