package regexvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

    public static void main(String[] args) {
        // we try a regex to extract a particular item from the string/integer/object
//        String texttovalidate = "Yahoo is a mailbox under yahoo";
        String texttovalidate = " is the OTP 153467";
        String regextocheck = "([0-9]+)";// match the whole word Yahoo if its available in the String
//        String regextocheck = "\\bYahoo\\b";// match the whole word Yahoo if its available in the String

        Pattern pattern = Pattern.compile(regextocheck);
//        Pattern pattern = Pattern.compile(regextocheck, Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("\\bYahoo\\b");
        Matcher matcher = pattern.matcher(texttovalidate);

        while (matcher.find()) {
            System.out.println("i have found the text : " + matcher.group());
        }


    }
}
