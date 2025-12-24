[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Xlk0xrMq)
# Lab: Holiday ASCII Art Generator

## Goal
Create a Java terminal application that prints festive holiday-themed ASCII art.

## Learning Objectives
- Practice Java fundamentals (`System.out.println()`, escape characters)
- Work with multi-line string output
- Use loops to generate patterns programmatically
- Practice string manipulation

## Pre-requisites
- Java 17+ installed
- Basic understanding of Java syntax

## Background
ASCII art has a long history in computing, dating back to when terminals could only display text characters. It's still used today in terminal applications, log files, and for fun!

## Tasks

### Task 1: Print a Static Christmas Tree
Create a class `HolidayArt.java` that prints a simple Christmas tree:

```
    *
   ***
  *****
 *******
*********
   |||
```

### Task 2: Make It Dynamic
Modify your program to accept a command-line argument for the tree height:
```bash
java HolidayArt 5
```

Should produce a tree with 5 levels of branches (plus the trunk).

### Task 3: Add Decorations (Bonus)
Enhance your tree with "ornaments" (use `o` or `O` characters randomly):
```
    *
   *o*
  **o**
 *o***o*
*********
   |||
```

### Task 4: Add a Message (Bonus)
Add a festive greeting below the tree:
```
    *
   ***
  *****
   |||

Happy Holidays!
```

## Hints

<details>
<summary>Hint 1: Building the Tree Pattern</summary>

Each row of the tree follows a pattern:
- Row 1: 0 spaces, 1 star
- Row 2: 1 less space, 2 more stars
- Row n: (height - n) spaces, (2n - 1) stars

</details>

<details>
<summary>Hint 2: Repeating Characters</summary>

You can use `String.repeat(n)` in Java 11+ to repeat a character:
```java
String stars = "*".repeat(5);  // "*****"
String spaces = " ".repeat(3); // "   "
```

Or use a loop:
```java
for (int i = 0; i < n; i++) {
    System.out.print("*");
}
```

</details>

<details>
<summary>Hint 3: Command-Line Arguments</summary>

```java
public static void main(String[] args) {
    int height = 5; // default
    if (args.length > 0) {
        height = Integer.parseInt(args[0]);
    }
}
```

</details>

## Expected Output

### Basic (Task 1-2)
```
$ java HolidayArt 6

      *
     ***
    *****
   *******
  *********
 ***********
     |||
```

### With Decorations (Task 3-4)
```
$ java HolidayArt 6

      ★
     *o*
    **O**
   *o***o*
  ***O*O***
 *o*******o*
     |||

✨ Happy Holidays! ✨
```

## Deliverables
1. `HolidayArt.java` - Your completed program
2. Screenshot or terminal output showing your ASCII art

## Starter Code
See `starter_code/HolidayArt.java`

## Stretch Goals
- Add color using ANSI escape codes
- Create multiple art options (tree, star, snowflake, present)
- Add animation (blinking star on top!)
