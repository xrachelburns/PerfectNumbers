
# PerfectNumbers

PerfectNumbers is a Java console application I built to find perfect numbers using nested loops and divisor calculations. The program starts by searching numbers from 1 to 200, then allows users to enter their own upper limit to explore a larger range.

A perfect number is a number that equals the sum of its proper divisors (all positive divisors except the number itself). For example, 6 is a perfect number because 1 + 2 + 3 = 6.

## Features

- **Two-part search:** First finds perfect numbers between 1 and 200, then lets users choose their own search limit.
- **User input:** Uses Java's `Scanner` class to accept a positive whole-number limit.
- **Faster divisor calculations:** Checks divisor pairs up to the square root of each number instead of testing every possible divisor in the extended search.
- **Support for larger numbers:** Uses the `long` data type to accept values beyond the range of an `int`.
- **Input validation:** Handles invalid numeric input and warns users before starting a potentially lengthy search, with the option to cancel.

## Getting Started

You'll need a Java Development Kit (JDK) installed to compile and run the program. No additional libraries are required.

1. Download or clone this repository.
2. Open a terminal in the folder containing `Main.java`.
3. Compile the program:

   ```bash
   javac Main.java
   ```

4. Run the program:

   ```bash
   java Main
   ```

You can also run the program in a Java-compatible IDE, such as CodeSnack IDE.

## Example Output

Here's an example of what the program displays when the user enters `1000` as the upper limit:

```text
Part 1 - Perfect numbers from 1 to 200:
6
28

Enter a positive whole-number upper limit: 1000
Part 2 - Perfect numbers from 1 to 1000:
6
28
496
```

## Testing

I tested the program in CodeSnack IDE using different search limits to make sure the calculations and user input worked as expected.

| Test | Result |
|---|---|
| Initial search (1–200) | Found 6 and 28 |
| Upper limit of 123 | Found 6 and 28 |
| Upper limit of 1000 | Found 6, 28, and 496 |

The program also includes input validation for numbers outside the supported range and a warning before searches with an upper limit greater than 1,000,000.

## Java Concepts Used

This project gave me an opportunity to practice several Java fundamentals, including:

- Nested `for` loops and conditional statements
- Methods and reusable logic
- The remainder operator (`%`)
- User input with `Scanner`
- Working with `int` and `long`
- Improving efficiency through divisor-pair calculations

## Project Files

**Main.java** — Contains the Java source code for both searches, user input handling, and the method used to identify perfect numbers.

---

**Portfolio:** [xrachelburns.com](https://xrachelburns.com)
