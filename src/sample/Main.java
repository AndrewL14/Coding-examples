//this shows basic and moderate programming along with examples and explanations
//press the run button to display each example
//each example is labeled with a number
//(READ THIS ONE IT IS VERY IMPORTANT) also some examples require user inputs in console so to continue to view other examples please put something in console so the program can keep running the next examples
//when you see capitalized letters and places with no space in-between words that is how it's supposed be (remember that when creating your own code)
//in the examples you will see variables with numbers (x1,y1, and so forth) to indicate that that variable belongs with that example
//when creating code never forget to add your semi-colons at the end of every line or else your program wont recognize it as code
// if you wish to look at each example individually just copy and paste the whole example into a different tab and run that one

//used to manage each package
package sample;
//imports the JOptionPane tool to use in later examples
import javax.swing.JOptionPane;
//imports the scanner tool to use in later examples
import java.util.Scanner;
//imports the Random tool to use in later examples
import java.util.Random;




//where all you code goes make sure to name your class the same as you save file
public class Main {
    //where you put the code everyone will see
    public static void main(String[] args) {

        System.out.println("Example 1\n");

        System.out.println("\tI Love Pizza\n");
        System.out.println("Rape");
        //anything that has a \ is an escape code
        // \t is to tab a line while \n is another way to tell the program to press enter
        System.out.println(" \n");

        System.out.println("Example 2\n");
        //Primitive data types  stores data , can only hold 1 value, less memory, faster than reference data types
        // int can hold between -2 billion to 2 billion can also be written as int a;
        int a = 123;
        System.out.println("my number is:"+a);
        // boolean can only hold true/false values can also be written as boolean b;
        boolean b = true;
        System.out.println(b);
        // byte can hold between -128 to 127 can also be written as byte c;
        byte c = 127;
        System.out.println(c);
        // short can hold between -32,768 to 32,767 can also be written as short d;
        short d = 32767;
        System.out.println(d);
        // long can hold between -9 quintillion to 9 quintillion requires L at the end can also be written as long e;
        long e = 51231584645687576L;
        System.out.println(e);
        // double can hold fractional numbers such as 7.5468 (up to 15 digits) can also be written as double f;
        double f = 23.156235;
        System.out.println(f);
        //float can hold fractional numbers up to 6-7 digits requires an f at the end can also be written as float g;
        float g = 3.145f;
        System.out.println(g);
        //char can hold single characters/letter/ASCII value can also be written as char h;
        char h ='@';
        System.out.println(h);

        //Reference data types Unlimited (user defined), stores an address, could hold more than 1 value, more memory, slower than primitive data types
        //string can hold a sequence of characters reference data type can also be written as String i;
        String i ="Hello world";
        System.out.println(i);


        System.out.println(" \n");
        System.out.println("Example 3\n");



        //how to swap 2 variables
        //enabling ing variables
        String x1 ="water";
        String y1 ="kool-aid";
        //create new string to store x
        String temp;
        //setting temp's value to = x's value
        temp = x1;
        //setting x's value = to y's value
        x1=y1;
        //setting y's value = to temp's value
        y1=temp;
        //Displaying the values of both x and y
        System.out.println("x: "+x1);
        System.out.println("y: "+y1);


        System.out.println(" \n");



        System.out.println("Example 4\n");
        //in this example it will require you to open your console and input anything


        //how you can use a scanner to accept some user inputs
        //to use a scanner we first need to import java.util.Scanner;

        //the scanner will be looking for a string or a list of characters
        Scanner scanner = new Scanner(System.in);
        //first the program will ask what is your name
        System.out.println("What is your name?");
        //then the program waits for a response and that response will be = to name
        String name1 = scanner.nextLine();

        //asks how old you are
        System.out.println("How old are you?");
        //will look for a number input and set it = to age anything other than a number and the program will show errors
        int age1 = scanner.nextInt();

        //this will reset the scanner to allow for a new string input
        scanner.nextLine();
        //Asks what is your favorite food
        System.out.println("What is your favorite food?");
        //will scan for a new string input and set it to = food
        String food = scanner.nextLine();

        //then once the program records your input it will display your input along with a hello
        System.out.println("Hello "+name1);
        //the program displays your age with some text
        System.out.println("You are "+age1+" Years old");
        //displays your favorite food with some text
        System.out.println("You Like "+food);

        //scanner tools can be used for much more complicated things like reading the contents of a given file

        System.out.println(" \n");
        System.out.println("example 5\n");

        //this example will show you how to use expressions

        //expression = operands & operators
        //operands = values, variables, numbers, quantity
        //operators = (+ - * / %) Add, Subtract, multiply, divide, percentage

        //creates an int variable and sets it equal to 10
        int friends = 10;
        //subtracts 1 from integer friends
        friends--;
        //displays the integers value after subtracting
        System.out.println(friends);

        //creates an int variable and sets it equal to 10
        int men = 10;
        //adds 1 from integer men
        men++;
        //displays the integers value after adding
        System.out.println(men);

        //creates an int variable and sets it equal to 10
        int women = 10;
        //divide by 2 from integer women yet with integer division if the solution has fractional digits ex 2.355 the program will only display 2 because we cannot store it
        women = women / 2;
        //displays the integers value after dividing
        System.out.println(women);

        // to display the digits after the whole number instead of an int variable create a double variable
        //creates an double variable and sets it equal to 10
         double cats = 10;
        //divides 3 from double cats while also telling the program to take into account the digits after the whole number
        cats = (double) cats / 3;
        //displays the double value after dividing
        System.out.println(cats);

        //creates an int variable and sets it equal to 10
        int dogs = 10;
        //adds 15 to integer dogs
        dogs = dogs + 15;
        //displays the integers value after adding
        System.out.println(dogs);

        System.out.println(" \n");
        System.out.println("Example 6\n");
        System.out.println("in this example the results will show up in a message box");

        //in this example we will show you how to create a basic gui application

        //creates a message dialog box(parentComponent) and stores the characters under name2
        String name2 = JOptionPane.showInputDialog("Enter your name");
        //displays our name along with the previous dialog box
        JOptionPane.showMessageDialog(null, "hello "+name2);

        //Creates the same message box but for integers and stores it under age2 (Integer.parseInt allows the program to accept integers in the message box
        int age2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //displays your input along with text
        JOptionPane.showMessageDialog(null, "you are "+age2+" years old");

        //Creates the same message box but for integers with decimals and stores it under age2 (Double.parseDouble allows the program to accept integers with decimals in the message box
        double height1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(in cm)"));
        //displays your input along with text
        JOptionPane.showMessageDialog(null, "you are "+height1+" cm tall");

        System.out.println(" \n");
        System.out.println("Example 7");

        //In this example it well teach you  how to find the hypotenuse of a triangle

        // we are creating double variables so the program can use these to create math equations
        double x;
        double y;
        double z;

        // creating a Scanner method to look for new user inputs
        Scanner scanner1 = new Scanner(System.in);

        // displaying a sentence so the user knows to input the X side of the triangle
        System.out.println("Enter side x: ");
        //Scans the user inputs and sets the input to equal x
        x = scanner.nextDouble();
        //displaying a sentence so the user knows to input the y side of the triangle
        System.out.println("Enter side y: ");
        // Scans the user input and sets the input equal to y
        y = scanner.nextDouble();

        //tells the program solve for z using the given equation
        z = Math.sqrt((x*x)+(y*y));

        //displays the z variable
        System.out.println("The hypotenuse is: "+z);

        //turns of the scanner
        scanner.close();

        System.out.println(" \n");
        System.out.println("example 8");

        //in this example we will teach you how to generate random numbers(this is a great example for game designers)

        //generates random numbers(by default the number generation can be up to 2 billion to -2 billion)
        Random random = new Random();

        //creating a integer and storing the generated value while also limiting the scale or size of the random number that will generate
        //inside the parenthesis the 6 is the highest number that can be generated yet the program always starts counting from zero so it will be 0-5
        //to fix this we the add 1 to the random value to make the number generated 1-6
        int x2 = random.nextInt(6)+1;
        //this will display a decimal number between 0-1
        double y2 = random.nextDouble();
        //this will display either true or false
        boolean z2 = random.nextBoolean();

        //displaying variable x
        System.out.println(x);
        //displaying variable y
        System.out.println(y2);
        //displaying variable z
        System.out.println(z2);


        System.out.println(" \n");
        System.out.println("example 9");

        //in this example we will teach you all about if statements
        //if statement = performs a block of code if it's condition evaluates to be true


        int age = random.nextInt(75)+1;

        //if the variable age is equal to 75 then display You are old
        if(age==75){
            System.out.println("You are old");
        }
        //if it doesn't equal 75 yet it is greater than or equal to 18 than display You're an adult
        else if(age>= 18){
            System.out.println("You're an adult");
        }
        //if the variable does not equal 75 or greater than or equal to 18 than display
        else {
            System.out.println("you are not an adult");
        }

        System.out.println(" \n");
        System.out.println("example 10");


        //switch = statement that allows a variable to be tested for equality against a list of values
        //if your using many if statements than it would be more efficient to just use a switch statement in some cases
        String day = "Friday";



        switch (day){
            //compares the given input day to see which one is the same and displays the corresponding string in the console
            case "Sunday": System.out.println("It's Sunday!");
            //the break statement separates each case statement( if their were no break statements and age equalled sunday the program would display all line statements instead of just one)
            break;
            case "Monday": System.out.println("It's Monday!");
            break;
            case "Tuesday": System.out.println("It's Tuesday!");
            break;
            case "Wednesday": System.out.println("It's Wednesday!");
            break;
            case "Thursday": System.out.println("It's Thursday!");
            break;
            case "Friday": System.out.println("It's Friday!");
            break;
            case "Saturday": System.out.println("It's Saturday!");
            break;
            //sets the default value to this if all other's do not match the given input
            default: System.out.println("That's not a day!");
        }

        //well that's all the examples for part 1 out of 8







    }
}