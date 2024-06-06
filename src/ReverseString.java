public class ReverseString {

    public static void main(String[] args) {


        String name= "Hello";
        String p = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            p = p + name.charAt(i);

        }
        System.out.println(p);
    }
}
//plandrim check kora hocce loop er madhome. strin k akline e dekhanor jonno p kadd kora hocce