import java.util.*;

public class strings {
    public static void main(String[] args) {
        // String str = "abc";
        // String str1 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next(); -> takes only single word
        // name = sc.nextLine(); -> takes whole line 
        // System.out.println(name);

        //length of string
        /*String name = "Samruddhi Nadgouda";
        System.out.println(name.length());

        //concentation of two strings
        String s1 = "Nikhil";
        String s2 = "Pawar";
        String s = s1 + " " + s2;
        System.out.println(s);

        //CharAt function
        System.out.println(name.charAt(3));*/

        //check if a string is palindrome
        // String str = "racecar";
        // System.out.println(isPalindrome(str));
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // //Compare two strings
        // String s1 = "Shrini";
        // String s2 = "Shrini";
        // String s3 = new String("Shrini");

        // if(s1 == s2){
        //     System.out.println("Strings are equal..");
        // }else{
        //     System.out.println("Strings are not equal..");
        // }
        // // if(s1 == s3){
        // //     System.out.println("Strings are equal..");
        // // }else{
        // //     System.out.println("Strings are not equal..");
        // // }
        // if(s1.equals(s3)){
        //     System.out.println("Strings are equal..");
        // }else{
        //     System.out.println("Strings are not equal..");
        // }

        //Substring
        //String str = "HelloWorld";
        //System.out.println(substring(str, 0, 5)); //Hello
        //In-Bulid function: substring()
        //System.out.println(str.substring(0, 5));

        // String fruits[] = {"apple", "mango", "banana"};

        // String largest = fruits[0];
        // for(int i=0; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // //StingBuilder
        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch <= 'z'; ch++){
        //     sb.append(ch);
        // } //abcde....
        // System.out.println(sb);
        // System.out.println(sb.length());

        //String Compression
        // String str = "aaabbcccdd";
        // System.out.println(compress(str));

        // //String to uppercase
        // String str = "hi, i am samruddhi";
        // System.out.println(toUpperCase(str));

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("count of vowels: "+count);

    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        //0th index become uppercase letter
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
        //if empty space finds then copy it as it is
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static float getShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static boolean isPalindrome(String str){
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
