# Recap Basics

1. Which data types do you know and how are they to be declared?

- There are the following data types: **int, double, boolean, String, float, char, long, byte, short**
- Declaration example:
  `int zahl = 25;`
  `String text = "Hier könnte Ihre Werbung stehen.";`

---

2. Declare and initialise a variable with a certain value (pay attention to the correct syntax). Overwrite the value with another value.
   `int x = 12;`
   `x = 32;`

---

3. Which operators do you know in detail (logical, relational, and mathematical)?

- Relational operators:
  `==` Compares two variables, returns TRUE if they have the same value (Strings not supported - Strings use the method `String.equals()` instead)
  `!=` Compares two variables, returns TRUE if the do not have the same value (Strings - see answer above)
  `>` Compares two variables/values, returns TRUE if the left one is bigger than the right one
  `<` Compares two variables/values, returns TRUE if the left one is smaller than the right one
  `>=` Compares two variables/values, returns TRUE if the left one is bigger than or equal to the right one
  `<=` Compares two variables/values, returns TRUE if the left one is smaller than or equal to the right one

- Logial operators:
  `&&` "Connects" two statements and returns TRUE only if both statements are TRUE as well
  `||` "Connects" two statements and returns TRUE if one of the two statements is TRUE as well
  `!` "NOT": returns TRUE if the following statement is not TRUE.

- Mathematical operators:
  `+` Addition: Adds one or more values to another
  `-` Subtraction: Subtrats one or more values from another
  `*` Multiply: Multiplys two or more values
  `/` Division: Divides two values
  `%` Modulo: Calculates the rest value of a division

---

4. What are the main differences between the if branch and the switch branch?

- The if-statement simply checks if one (or more) statements are true and if so, the code inside the if{} block will be executed. The switch does similar work, you can use an if/if else/else construction to do exactly the same as a switch does. But a switch is more readable and provides better overview. A switch is therefore "a good-looking if/if else/else construct". There are several cases (equals "if else" statements) and according to the given statement, the case that is TRUE will be executed. There is also a DEFAULT case, which is executed when none of the cases are true.

---

5. Which loops do you know? Brief description of the differences.
   `for()` FOR-loop: This loop is mainly used for operations that should be executed X times. It's also used for certain array operations (iteration, sorting, displaying content and more)
   `do {...} while()` DO-WHILE-loop: This is a while loop where the code within the DO block is executed at least once.
   `while()` WHILE-loop: This loop is a loop that runs as long as the condition within the brackets is TRUE. Can also be used like a FOR loop (but doesn't make a lot of sense...)

---

6. Describe the syntax in detail of the for loop and the while loop, what's the main difference? Are they equally powerful?
   `for(int i = 0; i < array.length; i++) { ... do something ... }`

   `while(running) { ... do something ...}`

- The main difference is that a for loop has three "blocks" - in the first one there is usually a definition of a counting variable, in the second one is the escape condition (if the condition is FALSE, the loop is terminated), and the third "block" is an operation (usually increment/decrement the counter variable).
  You can see directly how long the for loop is working because in the () brackets there are all loop conditions.

- The while loop just validates the given argument. This can be a boolean, or a counter that increments each "round".
  It is not always possible to see how long the while loop is going to work.

---

7. Print the numbers 1 to 10 with a specific loop that you can choose yourself.
   `for(int i = 0; i <= 10; i++) { System.out.println(i); }`

---

## Methods

1. Why should we use methods?

- Methods are used to structure and re-use code. One of the concepts of clean coding says "don't repeat yourself" (it is also more work to write the same code more than once). So methods can be described as parts of the code that are used more than one more time. This can be a simple addition or subtraction, or a sorting method for data, or a database operation and much many more.

---

2. Declare a simple method and describe the structure in detail. Which keywords are important?
   `public static double square(double value) { return value \* value; }`
   Keywords:
   `public` The accessibilty of a method. The possibilites are "private", "protected", "package-private" and "public". Public methods are intended to be "published" and an be accessed from anywhere.
   Private methos are intended to work only inside the class where they are defined.
   Package-private methods are like private methods but can be accessed from another class in the SAME package
   Protected methods can be accessed from methods within the same packages AND from child classes in OTHER packages as well.
   `static` If a method or variable is static, that means that is has no object context. So it can be accessed without an object instance
   `double` The return datatype. If the method returns anything, the according datatype must be declared here. If the method doesn't return anything, the datatype is "void"
   `square(double value)` The name of the function and within the brackets the parameters that are handled into the function to work with. In this example a double value is handled into the function to calculate with.

---

3. Which return types do you know?

- A method can return all kinds of datatypes and "void" which means that the function doesn't return anything (see answers above).

4. Declare a method with every return type you know.
   `public static void printInfo() { System.out.println("Info"); }`
   `public static int add(int a, int b) { return a + b; }`
   `public static double square(double value) { return value * value; }`
   `public static boolean isJavaCool() { return true; }`
   `public static String randomText() { return "Random-generated (:-) text ..."; }`
   `public static char giveMeAChar() { return 'C'; }`
   `public static float multiply(float numberOne, float numberTwo) { return numberOne * numberTwo; }`

---

## Arrays

1. What is an array?

---

2. Are arrays dynamic?

- Arrays are not dynamic because you have to define the size of the array when creating it.

---

3. Can arrays have more than one dimension?

- Yes, arrays can have multiple dimensions. Very common forms are two-dimensional arrays, three dimensions aren't used very often and more dimensions neither. But theoretically there can be x dimensions.

---

4. Do you need to know the size of arrays during compile time?

- Yes, the size of arrays must be known in advance. Arrays get a size when declaring them. The size can't be changed then.

---

5. Which types can arrays have?

- Arrays can contain each data type, like for example int/double/String. But the used type is always the same - mixing data types isn't possible.

---

6. Declare arrays in two different ways. At least one one-dimensional and one multidimensional array.

   - First way:
     `int numArray[] = {0, 2, 4, 6, 8};`
     `String spielfeld[][] = {{"O", "O", "O", "O", "O"}, {"O", "O", "O", "O", "O"} }`
   - Second way:
     `int numArray[] = new int[5];`
     `String spielfeld[][] = new spielfeld[5]][5];`

---

7. Sort an arbitrary integer array. Use any algorithm you like.

- Please see the InsertionSort.java file uploaded to the repository :-)

---

8. Print out a two-dimensional array.

- Please see the TwoDimArray.java file uploaded to the repository :-)

---

## Work done.
