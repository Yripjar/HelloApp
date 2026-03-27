# UC1: Display Hello World

## Description

This use case prints a basic greeting message "Hello World" to the console.

## Preconditions

* Java installed
* Project setup complete

## Main Flow

1. Program starts
2. main() method executes
3. Output is printed

## Post Conditions

* "Hello World" appears in console

## Disadvantages of Previous Use Case

* None

## Hints

* Use System.out.println()

## Code Snippet

```java
System.out.println("Hello World");
```

## Concepts Learned

* Java program structure
* main method
* Console output

# UC2: Display Hello with Command-Line Argument

## Description

The app accepts a user's name as a command-line argument and displays a personalized greeting.

## Preconditions

* Program is run with command-line argument

## Main Flow

1. User runs program with name
2. Program reads args[0]
3. Displays greeting

## Post Conditions

* Personalized greeting shown

## Disadvantages of Previous Use Case

* UC1 only prints static message

## Hints

* Use args[0]

## Code Snippet

```java
String name = args[0];
System.out.println("Hello, " + name + "!");
```

## Concepts Learned

* Command-line arguments
* Array indexing
* String concatenation

# UC3: Display Hello with Command-Line Argument or Default

## Description

The app displays a greeting using a provided name or defaults to "World" if no input is given.

## Preconditions

* Program runs with or without argument

## Main Flow

1. Check if args.length > 0
2. If yes → use args[0]
3. Else → use "World"
4. Print greeting

## Post Conditions

* Greeting always displayed

## Disadvantages of Previous Use Case

* UC2 crashes without input

## Hints

* Use args.length
* Use ternary operator

## Code Snippet

```java
String name = (args.length > 0) ? args[0] : "World";
```

## Concepts Learned

* Conditional logic
* Default values
* Ternary operator

# UC4: Display Hello with Multiple Command-Line Arguments

## Description

The app accepts multiple names and displays a greeting for all of them. If no names are provided, it defaults to "World".

## Preconditions

* Program runs with zero or more arguments

## Main Flow

1. Check if args.length > 0
2. If yes → join all names
3. Else → use "World"
4. Print greeting

## Post Conditions

* Greeting displayed with all names

## Disadvantages of Previous Use Case

* UC3 supports only one name

## Hints

* Use String.join()
* Use args array

## Code Snippet

```java
String names = String.join(", ", args);
```

## Concepts Learned

* Arrays
* Loop abstraction (String.join)
* Multiple inputs handling

# UC5: Display Hello using Enhanced For Loop

## Description

The app uses an enhanced for loop to process multiple names. Defaults to "World" if no input is given.

## Preconditions

* Program runs with zero or more arguments

## Main Flow

1. Check if args.length == 0
2. If yes → print "World"
3. Else → iterate using for-each loop
4. Build comma-separated names
5. Print greeting

## Post Conditions

* Greeting displayed correctly

## Disadvantages of Previous Use Case

* UC4 used simpler join, less control

## Hints

* Use for (String name : args)
* Use StringBuilder

## Code Snippet

```java
for (String name : args) {
    // process name
}
```

## Concepts Learned

* Enhanced for loop
* StringBuilder
* Array iteration

# UC7: Display Hello using String.join()

## Description

The app uses String.join() to concatenate multiple names efficiently.

## Preconditions

* Program runs with zero or more arguments

## Main Flow

1. Check if args.length == 0
2. If yes → print "World"
3. Else → use String.join()
4. Print greeting

## Post Conditions

* Clean formatted greeting

## Disadvantages of Previous Use Case

* UC6 required manual substring cleanup

## Hints

* Use String.join(", ", args)

## Code Snippet

```java
String names = String.join(", ", args);
```

## Concepts Learned

* String.join()
* Built-in methods
* Cleaner code
