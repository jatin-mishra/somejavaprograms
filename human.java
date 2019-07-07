// package name;

public class human{
    public static void main(String[] args){
        // String s1 = new String("String 1");
        // String s2 = "String 1";
        // if (s1 == s2) {
        //     System.out.println("Equal");
        // }
        // else {
        //     System.out.println("Not equal");
        // }
        String text = "%one%%two%%%three%%%%";
        
       String[] a = text.split("one|two|three");
        for(String b:a){
            System.out.println(b);

        }
    }
}