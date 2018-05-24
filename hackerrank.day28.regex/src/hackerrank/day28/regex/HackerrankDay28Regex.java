/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day28.regex;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author epish
 */
public class HackerrankDay28Regex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> gnames = new ArrayList<String>(); 
        String regex = "[a-z.]@gmail.com$";
        Pattern p = Pattern.compile(regex);
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                gnames.add(firstName);
            }
        }

        scanner.close();
        
        /*
        gnames.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        */
        
        gnames.sort(String::compareToIgnoreCase);
        
        for (String name: gnames) {
            System.out.println(name);
        }
    }
    
}
