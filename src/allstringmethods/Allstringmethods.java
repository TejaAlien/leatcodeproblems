package allstringmethods;

import java.util.Locale;

public class Allstringmethods {
    public static void main(String[] args) throws InterruptedException {
        Allstringmethods allstringmethods = new Allstringmethods();
        String str = "Ravi Teja Nanda Nanda" ;
       int length=  str.length();
       System.out.println("Returns the lenght of the string:"+ length);
       char ch = str.charAt(4);
       System.out.println("returns the character at that particular position:"+ch);//it returns nothing index at 4 is space
        int index = str.indexOf("Teja");
        System.out.println("Returns the starting index of the particular string you selected:"+index);
        String d = "ravi";
      byte[] bytes = d.getBytes();
      System.out.println("converts the string into array of Bytes:"+bytes);
      System.out.println(d.getBytes());
     String tolowerroot =  str.toLowerCase(Locale.ROOT);
     System.out.println(tolowerroot);
     String tolowerlocal =str.toLowerCase();
     System.out.println("String to lowerlocale:"+tolowerlocal);
     String touppercase = str.toUpperCase();
     System.out.println("to uppsercase:"+touppercase);
     //the index of method willl return the firstoccurence of the character or a string in the given string
        //there are like 4 methods :
        //int indexOf(int ch )method returns the character index position
        //Example:
        String  retruncharposition = "Sreedevi";
        System.out.println("returns the character index position"+retruncharposition.indexOf('d'));
        // int indexOf(int ch , int fromindex) method returns the character index position and checks after the fromtheindex
        //Example:
        String returnsthecharfromindex = "Sreedevi sree";
        System.out.println("After index 7 it finds the character and index: "+returnsthecharfromindex.indexOf('e',7));
        // int indexOf(String substring) returns the given substring starting index position
        //Example:
        String substringposition = "Ravi Teja Ravi Teja Ravi";
        System.out.println("finds the substring and gets the starting index position:"+substringposition.indexOf("Teja"));
        System.out.println("finds the substring and gets the starting index position:"+substringposition.indexOf("Ravi"));
        // int indexOf(String substring int fromtheindex) returns the starting index  position of the given substring and from the index
        String substringfromindex = "Ravi Teja Nanda";
        System.out.println("from index 5 it checks ravi and returns the statring index: "+substringfromindex.indexOf("Ravi",5));
 boolean istrue = str.equals("Ravi Teja Nanda");
 System.out.println("checks the two strings equal or not if equal ,it returns true: "+ istrue);
 //this chars() method is a intstream so we can use foreach to return the ascii value of the each character
        // Example : Ravi -> as 82 97 118 105 like that
str.chars().forEach(j->System.out.println(j));
//.tochararray converts the string to character array :
       char[] chc =  str.toCharArray();
       for(Character c:chc){
           System.out.println(c);
       }
       System.out.println("Gives the ascii value at index 4"+str.codePointAt(4));//ascii value for space is 432
       System.out.println( "Gives the ascii value of before 4 at index 3 ascii value: "+str.codePointBefore(4));
       // codepointcount from starting index to 6 means starting to 5 count the number of charcters (ascii values)from 0 to 5 and returns the count
      System.out.println(str.codePointCount(1,6));// from 1 to end-1 so returns 5
      //Ravi 0-R-82 1-a-97 2-v-118 3-i-105 4-space count from 0 to endindex-1
        String compare ="Ravi Teja Nanda";
int comparision = str.compareTo(compare);// Ravi Teja Nanda.comareto(Ravi Teja Nanda)
//here compareTo() method campares the two string
        //if two string s are equal it willl return 0
        //if string A is greater than string b it retuns 1
        //if string A(in the sense str) is less than string b it returns -1
System.out.println("character cases should match same to same "+comparision);
        String comparetoignore ="Ravi TEja Nanda";
int comparetoignorecase = str.compareToIgnoreCase(comparetoignore);
System.out.println("It does'nt care about characters cases(upper or lower) "+comparetoignorecase);
str.codePoints().forEach(System.out::println);// both codepoints and chars are the intstreams each character asii values
       String afterconcat= str.concat(" Ravi");// we added Ravi Teja Nanda+ space Ravi concatinated

        System.out.println(" Ravi added to the end of the present string: "+afterconcat);
        System.out.println(str);
       boolean ischaracterpesent =  str.contains("s");
       System.out.println(ischaracterpesent);
       str.contentEquals("R");
       String a1 = "Ravi Teja Nanda";
       String a2 ="Sreedevi";
       String a3 = "Siva ";
       String a4 = "suni ";
       StringBuffer sb1 = new StringBuffer("Ravi Teja Nanda");
       StringBuffer sb2 = new StringBuffer("Siva");
       StringBuffer sb3 = new StringBuffer("Sreedevi");
       StringBuffer sb4 = new StringBuffer("suni");
       //equals method checks whether two strings or equal or not// only strings it checks
        //content equals checks two strings equal or not and checks string with stringbuffer or steingbuilder
        //strings/stringbuilder/stringbuffer
      System.out.println("check the string content and stringbuffer content: "+ a1.contentEquals(sb1));
      System.out.println("Equals method : string to string only we can  use: "+ a1.equals(a2));
      System.out.println("content equals method: string to stringbufferorbuilder: "+ a4.contentEquals(sb3));
      //charactersequencecheck
        System.out.println(a4.contentEquals("s"));//beacuse suni.contentequals(s) not true if it is suni.contentsuni then true
        boolean endswiththatcharacter = str.endsWith("a");
        System.out.println(endswiththatcharacter);
        int givenstringhashcode=str.hashCode();
        System.out.println("hashcode of the given string: "+givenstringhashcode);
        str.indent(3);
        System.out.println("indent method adjusting the string from left to right: by spacing number "+str.indent(40));
      /*  It follows that for any two strings s and t, s.intern() == t.intern()
    is true if and only if s.equals(t) is true.*/
// instead of equals method we can use str.intern()== a1.intern()// we can use == with intern to check 2 strings equal or not
        System.out.println(str.intern()==a1.intern());
        System.out.println(a4.isBlank());//check the string is empty or not if empty returns true
       System.out.println("Last appearence of that character in the given string: "+str.lastIndexOf('a'));
       System.out.println(str.lastIndexOf('a',15));
       System.out.println("last index of the substring teja in the given string: "+str.lastIndexOf("Teja"));
       System.out.println(str.indexOf("Teja"));//indexOf string same as lastindexOf string
        System.out.println(str.lastIndexOf("nanda",8));//nanda not present this one present Nanda so -1 it returns
        System.out.println(str.lastIndexOf("Nanda",5));
        System.out.println(str.indexOf("Nanda",5));
        boolean stringisemptyornot = str.isEmpty();
        System.out.println(stringisemptyornot);
        System.out.println("It repeats the string to three times :"+str.repeat(3));
        str.repeat(4);
        System.out.println("replaces replaces all teh characters to the character" +
                "you mentioned: "+str.replace('a','@'));
        System.out.println(str.indexOf(a1));
      String[] split = str.split("T");
      for(String splitarray: split){
          System.out.println(splitarray);
      }
     String[] splitregex= str.split("a",7);//splitting at a with number of occurences 7
      for(String sp:splitregex){
          System.out.println(sp);
      }

boolean yesorno = str.startsWith("R");
      System.out.println(yesorno);
      System.out.println(str.startsWith("T",5));//atoffset 1 has a
        System.out.println(str.startsWith("N",10)); //at index 10 has N so true
        String str1 = "     Ravi Teja Nanda !           ";
        System.out.println(".strip method removes the leading and trailing whitespaces: "+str1.strip());
        System.out.println(str1.stripIndent());
        System.out.println("Removes the leading white spaces: "+str1.stripLeading());
        System.out.println("Removes the trailing white spaces :"+str1.stripTrailing());
        String substring = str.substring(3);
        System.out.println(substring);//make the substring at index 3
        System.out.println(str.substring(0,4));// dividing the string into the substring from index 0 to end-1
        int i =9;
        //tostring() method which converts all the fields data to a string

      //Ravi Teja Nanda Nanda
        // 0123
        System.out.println("trim method is used to remove the " +
                "leading and trailing whit spaces :"+str1.trim());
       System.out.println("Subsequence returns the character sequence " +
               "substring returns the string " +
               "both are same only charactersequene and string : "+ str.subSequence(0,4));
       System.out.println(".getclass method gives the class name: " +allstringmethods.getClass());
       System.out.println("Give the class name String of that obj str: "+str.getClass());
       str.wait(20);
    }

}
