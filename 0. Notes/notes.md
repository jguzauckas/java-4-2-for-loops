# `for` Loops

In the last section we covered `while` loops, which function much like repeating `if` statements. In this section we will introduce the other primary kind of iteration: the `for` loop. The `for` loop is similar, as it uses a `boolean` condition, but it is set up and works slightly differently. Let's take a look at how they are set up.

---

## `for` Loops

The differences in a `for` loop show up almost entirely in its **header**, that is, the line where the `for` loop is defined. As a starting point, here are two loops: a `while` loop and a `for` loop that both print out the `String` `"Hello, World!"` 10 times from the `NotesFor1.java` file:

```java
int count = 0;
while (count < 10) {
    System.out.println("Hello, World!");
    count++;
}

for (int i = 0; i < 10; i++) {
    System.out.println("Hello, World!");
}
```

Both loops are setup with similar components to produce the same output: initializing a **loop control variable**, a `boolean` condition, a print statement, and incrementing the loop control variable. Obviously, they are both written differently with those similar pieces of information. A `for` loop packages most of the variable counting work into its header to make things simpler inside of the loop.

Here are the three primary components of the header of a `for` loop:

1. Variable initialization - Create an integer variable to be counting with, and assign it a starting value of your choice. Typical `for` loop control variable names are `i`, `j`, and `k`.
2. `boolean` condition - The `boolean` condition to be checked after each iteration of the loop, nearly always using the `for` loop control variable that was initialized just before.
3. Variable modification - Modify the value of your variable in some consistent way. This action is performed after each iteration of the loop, and before the `boolean` condition is checked. The most common ways to do this are incrementing (adding 1) and decrementing (subtracting 1), but any consistent modification can work depending on your needs!

The three components in the header of a `for` loop are critical, it will not work when missing any one of them. It is also critical that the three pieces are separated by semicolons, it would not work if written any other way!

Looking at our example above, let's analyze how the `for` loop is processed to understand the order everything is completed in:

1. Initialize the `integer` variable `i` with the value `0`.
2. Check the `boolean` condition, in this case that is `i < 10`, which is `0 < 10`, which is `true`, so the loop will continue.
3. Run the line(s) of code inside of the loop, in this case that is the print statement.
4. Run the increment statement, so `i++` changes `i` from `0` to `1`.

After step 4, we return to step 2 to check the `boolean` condition and start repeating. Just like `while` loop, once the `boolean` condition is failed and gives a value of `false`, we end the loop. In this example, we know that `i` will take the values of `0`, `1`, ..., `9`, and then once it is incremented to `10` it fails the `i < 10` check and the loop ends.

Just like in a `while` loop, we can utilize the variable we are using to do the counting if we want to. Here is an example of a `for` loop that prints out the numbers 1 to 10, inclusive, by using the loop control variable to print from the `NotesFor2.java` file:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

This is a little more compact than the way we did this with `while` loops, showing an important use case for `for` loops.

---

## `for` and `while` Loop Equivalence

While it may seem like there should be special cases where it wouldn't work, you can always use either a `for` or `while` loop to solve a problem, which means that any `for` loop can be equivalently written as a `while` loop, and any `while` loop can be written as an equivalent `for` loop.

Recalling our work on standard algorithms in Unit 4 Section 1, all of those problems were solved using `while` loops, but they can all be equivalent re-written as `for` loops, like this from the `NotesAlgorithms1.java` file:

```java
public static boolean divisibility(int number) {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return true;
        }
    }
    return false;
}

public static void places(int number) {
    for (number; number > 0; number /= 10) {
        System.out.println(number % 10);
    }
}

public static int countPrimes(int max) {
    int count = 0;
    for (int i = 2; i <= max; i++) {
        if (divisibility(i) == false) {
            count++;
        }
    }
    return count;
}
```

See if you can determine whether they should still work the same way or not! Some loops don't 

---

## Off-By-One Errors

Since `for` loops are based on counting, it can be easy to set them up just slightly wrong, and have them do one more or one fewer iteration than they should. We refer to these situations can an **off-by-one error**. Here are two examples of how our earlier example of printing `"Hello, World!"` 10 times could have been off by one in each direction from the `NotesOffByOne1.java` file:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println("Hello, World!");
}

for (int i = 1; i < 10; i++) {
    System.out.println("Hello, World!");
}
```

Can you figure out which one does it 11 times and which one does it 9 times?

The first `for` loop does one too many loop iterations. Note that the only change is that instead of `i < 10`, it's now `i <= 10`, which now includes the number 10, increasing the number of iterations to 11, instead of 10.

The second `for` loop does one too few loop iterations. Note that the only change is that instead of `int i = 0`, it's now `int i = 1`, which now starts higher, removing the extra print at the beginning, reducing the number of iterations to 9, instead of 10.

Off-by-one errors occur frequently even for people who are experienced in programming with loops. Always be on the lookout for this as a potential issue!

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
