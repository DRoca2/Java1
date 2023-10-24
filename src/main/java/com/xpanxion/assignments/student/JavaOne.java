package com.xpanxion.assignments.student;
import java.util.*;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name(Ex: John Doe): ");
        String name = console.next();
        name = name.toUpperCase();
        System.out.println("Your name in upper case is: " + name);
    }

    public void ex2() {
        int count=0;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = console.next();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = console.nextLine();

        StringTokenizer strTkn = new StringTokenizer(str);
        boolean cap = true;

        while (strTkn.hasMoreTokens()) {
            String word = strTkn.nextToken();
            if (cap) {
                System.out.println(word.toUpperCase());
            } else {
                System.out.println(word);
            }
            cap = !cap;
        }
    }

    public void ex4() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = console.next();

        int len = str.length();
        boolean palindrome = true;

        for(int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i - 1)){
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    public void ex5() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = console.next();
        str = str.toLowerCase();

        int count=0;
        int count2=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Number of Vowels: " + count);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'b' || str.charAt(i) == 'c' || str.charAt(i) == 'd' || str.charAt(i) == 'f' ||
                    str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'j' ||
                    str.charAt(i) == 'k' || str.charAt(i) == 'l' || str.charAt(i) == 'm' ||
                    str.charAt(i) == 'n' || str.charAt(i) == 'p' || str.charAt(i) == 'q' ||
                    str.charAt(i) == 'r' || str.charAt(i) == 's' || str.charAt(i) == 't' ||
                    str.charAt(i) == 'v' || str.charAt(i) == 'w' || str.charAt(i) == 'x' ||
                    str.charAt(i) == 'y' || str.charAt(i) == 'z'){
                count2++;
            }
        }
        System.out.println("Number of consonants: " + count2);
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = console.nextInt();

        System.out.println("Enter another integer: ");
        int num2 = console.nextInt();

        int sum = num1 + num2;

        System.out.println("Result: " + sum);
    }

    public void ex7() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = console.nextInt();

        System.out.println("Enter another integer: ");
        int num2 = console.nextInt();

        System.out.println("Enter operation(add, sub, mul, div): ");
        String operation = console.next();

        if(operation.equals("add")){
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } else if(operation.equals("sub")){
            int diff = num1 - num2;
            System.out.println("Difference: " + diff);
        } else if(operation.equals("mul")){
            int mult = num1 * num2;
            System.out.println("Multiplication: " + mult);
        } else if(operation.equals("div")){
            int div = num1 / num2;
            System.out.println("Division: " + div);
        }
    }

    public void ex8() {
        Scanner console = new Scanner(System.in);
        int width, length;
        double total=0.0;

        System.out.println("Enter price per square feet: ");
        double price = console.nextDouble();
        console.nextLine();

        while(true){
            System.out.println("Enter room dimensions(width x height), enter 'done' when finished: ");
            String rmDim = console.nextLine();

            if (rmDim.equalsIgnoreCase("done")) {
                break;
            }
            String[] splitDim = rmDim.split("x");
            width = Integer.parseInt(splitDim[0].trim());
            length = Integer.parseInt(splitDim[1].trim());

            total += price * width * length;
        }
        System.out.printf("Total cost: $%.2f\n", total);
    }

    public void ex9() {
        Scanner console = new Scanner(System.in);
        int randomNum = (int)(Math.random()*((5-0)+1));
        int num;

        System.out.println("Guess a number: ");
        num = console.nextInt();

        do{
            if(num>randomNum){
                System.out.println("Too high, try again.");
                num = console.nextInt();
            } else if(num<randomNum){
                System.out.println("Too low, try again.");
                num = console.nextInt();
            }
        } while(num != randomNum);
        System.out.println("That's correct!");
    }

    public void ex10() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = console.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int n = word.length();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.println(word.charAt(j));
            }
        }
        System.out.println();
    }

    //
    // Private helper methods
    //
}

