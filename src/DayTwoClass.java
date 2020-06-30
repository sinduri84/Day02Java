import java.util.Scanner;

public class DayTwoClass {

    static void fToC(int fahrenheit) {
        int celsius = (int) Math.round((fahrenheit - 32) * 0.5556);
        System.out.println(fahrenheit + "\u00B0F is " + celsius + "\u00B0C");
    }

    static void cToF(int celsius) {
        int fahrenheit = (int) Math.round(celsius * 1.8 + 32);
        System.out.println(celsius + "\u00B0C is " + fahrenheit + "\u00B0F");
    }

    static void areaCircle(int radius) {
        double areaOfCircle = 3.14159 * Math.pow(radius, 2);
        System.out.println("Area of a circle with " + radius + " units radius is " + areaOfCircle + " units.");
    }

    static void averageOfNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The average value is " + sum/3 + ".");

    }

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did";
        System.out.println(hannah);

        //A1.1
        System.out.println("");
        System.out.println("A1.1");

        System.out.println("The length of the string hannah is " + hannah.length() + ".");

        //A1.2
        System.out.println("");
        System.out.println("A1.2");

        System.out.println("The value returned by the method hannah.charAt(12) is " + hannah.charAt(12) + ".");

        //A1.3
        System.out.println("");
        System.out.println("A1.3");

        System.out.println("The index of 'b' in hannah is " + hannah.indexOf('b') + ".");

        //A1.4
        System.out.println("");
        System.out.println("A1.4");

        String aSentence = "Java is great!";

        Scanner inputIndex = new Scanner(System.in);

//        System.out.print("Input index: ");
//        int n = inputIndex.nextInt();
//
//        System.out.println("The character at position " + n + " is " + aSentence.charAt(n) + ".");

        //A2
        System.out.println("");
        System.out.println("A2");

        String a2Sentence = "Was it a car or a cat I saw?";

        String a2SubString = a2Sentence.substring(9, 12);

        System.out.println("The length of the string is " + a2SubString.length() + " and it was a \"" + a2SubString + "\".");

        //A3.1
        System.out.println("");
        System.out.println("A3.1");

        String a3Sentence = "We have a Hulk. Hulk Smash!";
        String a3Sentence2 = "   Hulk    Smash   ";
        String a3Sentence3 = "I don’t want to kill anyone. I don’t like bullies. I don’t care where they’re from.";
        //charAt
        System.out.println("The first letter of the sentence is " + a3Sentence.charAt(0) + ".");
        //indexOf
        System.out.println("The index of \"Hulk\" is " + a3Sentence.indexOf("Hulk") + "");
        //contains
        System.out.println("Does the sentence contain the word \"Hulk\"? " + a3Sentence.contains("Hulk"));
        System.out.println("Does the sentence contain the word \"Dr. Banner\"? " + a3Sentence.contains("Dr. Banner"));
        //startsWith
        System.out.println("Does the sentence start with I? " + a3Sentence.startsWith("W"));
        System.out.println("Does the sentence start with H? " + a3Sentence.startsWith("H"));
        //compareTo
        System.out.println("Sentence 1 compared to Sentence 2 is " + a3Sentence.compareTo(a3Sentence2) + ".");
        System.out.println("Sentence 2 compared to Sentence 1 is " + a3Sentence2.compareTo(a3Sentence) + ".");
        //trim - returns the omitted string with no leading and trailing spaces.
        System.out.println("The original sentence is \"" + a3Sentence2 + "\".");
        System.out.println("The trimmed sentence is \"" + a3Sentence2.trim() + "\".");
        //strip - Similar to trim, strip() method uses Character.isWhitespace() method to check if the character is a whitespace;
        System.out.println("The stripped sentence is \"" + a3Sentence2.strip() + "\".");
        System.out.println("The sentence only after stripping leading space is \"" + a3Sentence2.stripLeading() + "\".");
        System.out.println("The sentence only after stripping trailing space is \"" + a3Sentence2.stripTrailing() + "\".");
        //replace
        System.out.println("The original third sentence is \"" + a3Sentence3 + "\".");
        System.out.println("The sentence after replacing \"I don't\" with \"Captain America doesn't\" is \"" + a3Sentence3.replace("I don’t", "Captain America doesn\'t") + "\".");
        //replaceAll - Replaces each substring of this string that matches the given regular expression with the given replacement.
        System.out.println("Replacing all words before, after and including Hulk: " + a3Sentence.replaceAll("(.*)Hulk(.*)", "Dr. Banner Smash."));

        //A3.2
        System.out.println("");
        System.out.println("A3.2");

        String javaJuicy = "Java is Juicy";
        System.out.println("Does the sentence contain the word \"is\"? " + javaJuicy.contains("is"));

        //A3.3
        System.out.println("");
        System.out.println("A3.3");

        String stringSentence = "The Avengers Broke up";
        String stringSentence2 = "Broke up? Like a band? Like the Beatles?";

        if (stringSentence.endsWith("Broke up") == true && stringSentence2.startsWith("Broke up") == true) {
            System.out.println("\"" + stringSentence + "\" ends with \"" + stringSentence2 + "\"? true");
        } else {
            System.out.println("\"" + stringSentence + "\" ends with \"" + stringSentence2 + "\"? false");
        }

        //A4
        System.out.println("");
        System.out.println("A4");

        String myName = "Sinduri Guntupalli";
        String[] arrayName = myName.split(" ");
        for (int i=0; i<arrayName.length; i++) {
            System.out.print(arrayName[i].charAt(0));
        }

        //A5
        System.out.println("");
        System.out.println("A5");

        fToC(50);
        fToC(20);
        fToC(100);
        System.out.println("");

        Scanner inputCelsius = new Scanner(System.in);
        System.out.print("Input Temperature in Celsius: ");
        int celsiusTemp = inputCelsius.nextInt();
        cToF(celsiusTemp);

        //A6
        System.out.println("");
        System.out.println("A6");

        areaCircle(5);

        //A7
        System.out.println("");
        System.out.println("A7");

        averageOfNumbers();


    }
}
