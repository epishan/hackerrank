//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){

        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // put phone record into phoneBook dictionary
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // looking up name in the dict
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s).toString());
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
