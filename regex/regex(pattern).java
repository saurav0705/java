import java.util.*;
import java.util.regex.*;
import java.io.*;

class regexpattern {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println(Pattern.matches("geeksforge[a-z]ks", "geeksforgebks"));
        Pattern pr = Pattern.compile("[A-Z]");
        String match = "This is New WorldAjbndjenjnbeBkdnkwndkMndkwn";
        Matcher m1 = pr.matcher(match);
        int count = 0;
        while (m1.find()) {
            // System.out.println(m1.start() + " " + m1.end());
            count++;
        }
        // match = match.replaceAll(" ", "");
        System.out.println(count);
        /*
         * System.out.println(match); count = 0; String x = "geeks for geeks"; String
         * x1[] = x.split(""); for (String s : x1) { System.out.println(s); }
         */
    }
}
