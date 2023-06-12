# JUnitTests1

Here is the list of files in the Calculator Package -

Copy
1
2
3
4
5
6
7
.
├── src
│  ├── Calculator
│  │  └── Calculator.java
└── test
   └── Calculator
       └── CalculatorTest.java
Calculator.Calculator class is fully implemented and contains a list of methods for each basic arithmetic operation. The only method that is different from what you’d expect is divide(), which throws an exception if someone tries to divide by zero.

This is interesting because when you write tests you will have to make sure your test tests the fact that exceptions are being thrown when expected and not being thrown when not expected.

Calculator.CalculatorTest class inside test/Calculator/CalculatorTest.java is empty. Let’s talk about how to start writing this class.

In order to be able to write tests, you need to import a bunch of methods called assertions from a library called Junit. Here are some example assert methods -

assertEquals: takes two arguements, and checks if they are equal. If unequal, the test fails.

assertThrows: takes two arguements, the first being a class, and the second being a lambda expression.

You can get the class of an exception by using Exception.class, for example ArithmeticException.class or java.lang.ArithmeticException.class if you’ve not imported it.

The lambda expression should include the method call that should throw an exception. You can think of it as a small convinient try block, for example -

Copy
1
2
3
4
5
6
assertThrows(ArithmeticException.class, () -> c1.divide());
// or if you need multiple statements
assertThrows(ArithmeticException.class, () -> {
   Calculator c1 = new Calculator(1, 2);
   c1.divide();
});
Check this page for documentation on all assertions. You might be able to find something that reduces the amount of code you need to write!

We are using Junit 5, and the way you import these assertions for Junit 5 is -

Copy
1
import static org.junit.jupiter.api.Assertions.*;
Note: Make sure you’ve added package Calculator; to the top of the Calculator.CalculatorTest class file.

Every method that is meant to be a test needs to marked with a @Test decorator. This helps our tool find and identity which methods are intended to be tests. You can import this decorator by saying -

Copy
1
import org.junit.jupiter.api.Test;
Later, you can mark a method as a test by saying -

Copy
1
2
3
4
@Test
public void testAdd() {
    // body
}
You might also want to import java.lang.ArithmeticException, that is the exception thrown by the divide method.

Next, create a class as usual - public class CalculatorTest {}

Inside this class, define a bunch of calculator objects. Here is some, you might find useful -

Copy
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
public class CalculatorTest { 
    /*   
    * Here is where you want to define a bunch of calculator objects   
    * So that you can use them later in your tests.   
    *   
    * The instructions document contains a list of calculator objects   
    * that might be useful to test.   
    *   
    * You can also create your own calculator objects.   */
    
    Calculator c1 = new Calculator(2, 3);
    Calculator c2 = new Calculator(-2, 3);
    Calculator c3 = new Calculator(2, -3);
    Calculator c4 = new Calculator(-2, -3);
    Calculator c5 = new Calculator(0, 0);
    Calculator c6 = new Calculator(0, 3);
    Calculator c7 = new Calculator(2, 0);
    Calculator c8 = new Calculator(0, -3);
    Calculator c9 = new Calculator(-2, 0);
}
Next, use the @Test decorator just like how it was described about to create -

testAdd()

testSubstract()

testMultiply()

testDivide()

Implement all the above tests, and run them to make sure they’re all passing.

Once your tests are passing, use the above instructions to check your grade within the IDE.

Make sure you modify your tests or source code to get rid of all surviving mutations. Once you are done, hit submit.
