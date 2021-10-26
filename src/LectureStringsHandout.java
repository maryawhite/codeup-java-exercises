import java.util.Locale;
import java.util.Scanner;

public class LectureStringsHandout {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // ' ~ " * "strings" * " ~ '
        //Strings can be given a more formal definition - some letters, numbers, and special characters combined (STRUNG together) in some fashion
        //In Java . . they are not primitives! They are objects - your variables are a reference type instead. That means == asks if both sides have the same reference vs value
        //This leads us to use object comparison methods (.equals and family) to reliably check the VALUES of the objects vs. the REFERENCES of the objects

        //Don't do this! ! ! This is behavior from a woods-y topic related to how the Java Virtual Machine works
//        if("This is a string" == "This is a string"){
//            System.out.println("Performing some kind of super important operation with the above!! (Skynet launched!)");
//        }

        //Utilize the methods introduced here instead for consistency and reliability:
//        if("This is a string".equals("This is a string")){
//            System.out.println("Everything is a-okay over here! We used .equals, so we're feeling confident in what's going on with our code.");
//        }

        // ' ~ " * "string comparison methods" * " ~ '

        //Expanding on the thought above: we have a range of string comparison methods! These include a couple we've seen (.equals and its sibling .equalsIgnoreCase), but there are also a couple prefix/suffix focused methods (.starsWith  vs .endsWith)

        //.equals + .equalsIgnoreCase (casematch the total string or ignore the casing of the total string?)
//        String txCapitalCity = "Austin";
//        String lowercaseTxCapitalCity = "austin";
//        System.out.println("txCapitalCity = " + txCapitalCity);
//        System.out.println("lowercaseTxCapitalCity = " + lowercaseTxCapitalCity);
//        System.out.println("lowercaseTxCapitalCity.equals(lowercaseTxCapitalCity) = " + lowercaseTxCapitalCity.equals(lowercaseTxCapitalCity));
//        System.out.println("txCapitalCity.equals(txCapitalCity) = " + txCapitalCity.equals(txCapitalCity));
//        System.out.println("txCapitalCity.equals(lowercaseTxCapitalCity) = " + txCapitalCity.equals(lowercaseTxCapitalCity));
//        System.out.println("txCapitalCity.equalsIgnoreCase(lowercaseTxCapitalCity) = " + txCapitalCity.equalsIgnoreCase(lowercaseTxCapitalCity));
//        System.out.println("txCapitalCity contains 'tin' = " + txCapitalCity.contains("tin"));

//        //.startsWith + .endsWith
//        String austinSentence = "The capital city of Texas is " + txCapitalCity + ", and it is growing quickly.";
//        System.out.println(austinSentence);
//        System.out.println("austinSentence.startsWith(\"The capital city\") = " + austinSentence.startsWith("The capital city"));
//        System.out.println("austinSentence.startsWith(\"the capital city\") = " + austinSentence.startsWith("the capital city"));
//        System.out.println("austinSentence.startsWith(\"The capitol city\") = " + austinSentence.startsWith("The capitol city"));
//
//
//        System.out.println("austinSentence.endsWith(\".\") = " + austinSentence.endsWith("."));
//        System.out.println("austinSentence.endsWith(\"it is growing quickly.\") = " + austinSentence.endsWith("it is growing quickly."));
//        System.out.println("austinSentence.endsWith(\"it is growing QUICKLY.\") = " + austinSentence.endsWith("it is growing QUICKLY."));
//        System.out.println("austinSentence.endsWith(\"it is growing quick.\") = " + austinSentence.endsWith("it is growing quick."));
//
//        //' ~ " * "string manipulation methods" * " ~ '
//
//        // .indexOf [search start to finish], .lastIndexOf [start end to finish], .charAt(int index)
//        System.out.println();
//        System.out.println("austinSentence = " + austinSentence);
//        System.out.println("austinSentence.indexOf('x') = " + austinSentence.indexOf('x'));
//        System.out.println("austinSentence.charAt(20) = " + austinSentence.charAt(20));
//        System.out.println("austinSentence.charAt(21) = " + austinSentence.charAt(21));
//        System.out.println("austinSentence.charAt(22) = " + austinSentence.charAt(22));
//        System.out.println("austinSentence.charAt(23) = " + austinSentence.charAt(23));
//        System.out.println("austinSentence.charAt(24) = " + austinSentence.charAt(24));
//        System.out.println();
//        System.out.println("austinSentence.indexOf(\"capital city\") = " + austinSentence.indexOf("capital city"));
//        System.out.println("austinSentence.indexOf(\"capitol city\") = " + austinSentence.indexOf("capitol city"));
//        System.out.println();
//        System.out.println("***************************************************************");
//        System.out.println("** indexOf goes start to end, lastIndexOf goes end to start: **");
//        System.out.println("***************************************************************");
//        System.out.println(austinSentence);
//        System.out.println("austinSentence.indexOf(\"is\") = " + austinSentence.indexOf("is"));
//        System.out.println("austinSentence.lastIndexOf(\"is\") = " + austinSentence.lastIndexOf("is"));
//        System.out.println("austinSentence.indexOf(\"i\") = " + austinSentence.indexOf("i"));
//        System.out.println("austinSentence.lastIndexOf(\"i\") = " + austinSentence.lastIndexOf("i"));
//        System.out.println();
//
//        //int length() - returns length of string
//        System.out.println("austinSentence = " + austinSentence);
//        System.out.println("austinSentence.length() = " + austinSentence.length());
//        System.out.println("txCapitalCity = " + txCapitalCity);
//        System.out.println("txCapitalCity.length() = " + txCapitalCity.length());
//        System.out.println();
//
//        //String .replace(searchPattern, replacementString) - Returns a copy of the string with the matching pattern replaced by the second argument
//        String newcapitalSentence = austinSentence.replace("is Austin, and it is", "was five other cities before Austin, and the state is");
//        System.out.println("newcapitalSentence = " + newcapitalSentence);

        //.toLowerCase() & toUpperCase()
//        System.out.println("txCapitalCity = " + txCapitalCity);
//        System.out.println("txCapitalCity.toLowerCase() = " + txCapitalCity.toLowerCase());
//        System.out.println("txCapitalCity.toUpperCase() = " + txCapitalCity.toUpperCase());
//        String austinUppercase = txCapitalCity.toUpperCase();
//        System.out.println("uppercase = " + austinUppercase);

//
        //,trim() - trim off whitespace on either end of your string
        String paddingAustin = "    austin    ";
        System.out.println("paddingAustin = " + paddingAustin + ".");
        System.out.println("paddingAustin.trim() = " + paddingAustin.trim() + ".");

        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("hannah.length() = " + hannah.length());
        System.out.println("hannah.charAt(12) = " + hannah.charAt(12));
        System.out.println("hannah.indexOf(\"b\") = " + hannah.indexOf("b"));

        String catOrCar = "Was it a car or a cat I saw?";
        System.out.println("catOrCar.substring(9, 12) = " + catOrCar.substring(9, 12));

        String myName = "Mary White";
        System.out.println("myName.charAt(0) = " + myName.charAt(0));
        System.out.println("myName.indexOf(\" \") = " + myName.indexOf(" "));
        System.out.println(myName.charAt(0) + "." + myName.charAt((myName.indexOf(" ") + 1)) + ".");
        System.out.println(myName.charAt(0) + "." + myName.charAt(5) + ".");

        System.out.println("Enter your first and last name: ");
        String yourName = scanner.nextLine();
        System.out.println(yourName.charAt(0) + "." + yourName.charAt((yourName.indexOf(" ") + 1)) + ".");




    }
}
