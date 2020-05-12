package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class differentExceptions {

    public static void main(String[] args) throws IOException {
        handleNullPointerException();
        handleArithmeticException(12, 0);
        handleArrayOutOfBoundException(4);
        handleFileNotFoundException();
        handleIllegalStateException();
        handleUsupportedOperationException();
        handleMalformedUrlException();
        handleNumberFormatException();
        handleStringIndexOutOfBoundsException();
    }

    private static void handleStringIndexOutOfBoundsException() {
        String sentence = "This is a test";
        int index = 19;
        if (!sentence.isEmpty() && index <= sentence.length()) {
            char charIndex = sentence.charAt(index);
            System.out.println(charIndex);
        } else {
            System.out.println("The index is not valid " + index + " Length of the strig is "
                    + sentence.length());
        }
    }

    private static void handleNumberFormatException() {
        String test = "textForText";
        try {
            int convertToInt = Integer.parseInt(test);
            System.out.println(convertToInt);
        } catch (NumberFormatException e) {
            System.out.println("The string entered is invalid and cannot be converted to int" + e);
        }
    }

    private static void handleMalformedUrlException() throws IOException {
        try {
            URL url = new URL("https://www.google.com");
            // If wrong url is entered it will throw MalformedURLException
            // use try catch to handle this exception
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            StringBuilder builder = new StringBuilder();
            while ((line = br.readLine()) != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
            }
            System.out.println(builder);
        } catch (MalformedURLException e) {
            System.out.println("The URL entered is not correct, please ensure URL is correct " + e);
        }
    }

    private static void handleUsupportedOperationException() {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> numberIterator = numberList.iterator();
        while (numberIterator.hasNext()) {
            // numberList has fixed size array, or immutable
            // Members cannot be removed
            // Hence it throws unsupportedException
            numberIterator.next();
    //        numberIterator.remove();
        }
    }

    private static void handleIllegalStateException() {
        List<Integer> numberList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> numberIterator = numberList.iterator();
        while (numberIterator.hasNext()) {
            //Illegal state exception occurs when we remove item from the list first 
            //Element where the cursor is positioned is removed
            // Before we goto the next item in the list.
            // Idea is to move the cursor firt and the remove it
            numberIterator.next();
            numberIterator.remove();      
        }
    }

    private static void handleFileNotFoundException() throws IOException {
        String fileName = "C:\\Users\\zarrar\\git\\various_projects\\variousProjects\\src\\exceptions\\testFile";
        String message = "";
        String line = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {      
           System.out.println("File name entered was not found " );
        }  
        while((line=br.readLine())!=null)
        {
            message += line;
        }
        System.out.println(message);
        br.close();   
    }

    private static Integer handleArrayOutOfBoundException(int number) {
        int[] numbers = { 1, 2, 3, 4 };
        int length = numbers.length;
        if (numbers.length > number && number >= 0) {
            System.out.println(numbers[number]);
        } else {
            System.out.println("The entered number is invalid: " + number
                    + " please check the length of array : " + length);
        }
        return length;
    }

    private static int handleArithmeticException(int i, int j) {
        int division = 0;
        if (i > 0 && j > 0) {
            division = i / j;
            System.out.println(division);
        } else {
            System.out.println(
                    "Numbers entered are equal to zero, no division possible :" + division);
        }
        return division;
    }

    private static String handleNullPointerException() {
        String message = "Empty";
        if (message.length() >= 12) {
            message = "TestString";
            System.out.println("The character at length 10 is " + message.charAt(9));
        } else {
            message = null;
            System.out.println("Message is less than recommended size :" + message);
        }
        return message;
    }
}