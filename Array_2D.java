/* Given a 6*6 2D array, arr, an hourglass is a subset of values with indices falling in the following pattern: There are 16 hourglasses in a 6*6 array. The hourglasssum is the sum of the values in an hourglass. Calculate the hourglass sum for every hourglass in , arr then print the maximum  hourglass sum.*/

import java.util.Scanner;

class HourglassSum {
    public int Hourglass() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        int value = sc.nextInt();

        // inserting an element into an 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        // printing an 2D array
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        // hourglassSum calculation
        int maxSum = Integer.MIN_VALUE;
        int hourGlassSum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                hourGlassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
               System.out.println(hourGlassSum);
            }
        }
        maxSum = Math.max(maxSum, hourGlassSum);

        return hourGlassSum;
    }
}

public class Array_2D {
    public static void main(String[] args) {
        HourglassSum hs = new HourglassSum();
        hs.Hourglass();
    }
}

/* Very important comment about java math class 
    java.lang.Math

The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.

Unlike some of the numeric methods of class StrictMath, all implementations of the equivalent functions of class Math are not defined to return the bit-for-bit same results. This relaxation permits better-performing implementations where strict reproducibility is not required.

By default many of the Math methods simply call the equivalent method in StrictMath for their implementation. Code generators are encouraged to use platform-specific native libraries or microprocessor instructions, where available, to provide higher-performance implementations of Math methods. Such higher-performance implementations still must conform to the specification for Math.

The quality of implementation specifications concern two properties, accuracy of the returned result and monotonicity of the method. Accuracy of the floating-point Math methods is measured in terms of ulps, "units in. For a given floating-point format, an ulp of a specific real number value is the distance between the two floating-point values bracketing that numerical value. When discussing the accuracy of a method as a whole rather than at a specific argument, the number of ulps cited is for the worst-case error at any argument. If a method always has an error less than 0.5 ulps, the method always returns the floating-point number nearest the exact result; such a method is correctly rounded. A "correctly rounded" method is generally the best a floating-point approximation can be; however, it is impractical for many floating-point methods to be correctly rounded. Instead, for the Math class, a larger error bound of 1 or 2 ulps is allowed for certain methods. Informally, with a 1 ulp error bound, when the exact result is a representable number, the exact result should be returned as the computed result; otherwise, either of the two floating-point values which bracket the exact result may be returned. For exact results large in magnitude, one of the endpoints of the bracket may be infinite. Besides accuracy at individual arguments, maintaining proper relations between the method at different arguments is also important. Therefore, most methods with more than 0.5 ulp errors are required to be "semi-monotonic": whenever the mathematical function is non-decreasing, so is the floating-point approximation, likewise, whenever the mathematical function is non-increasing, so is the floating-point approximation. Not all approximations that have 1 ulp accuracy will automatically meet the monotonicity requirements.

The platform uses signed two's complement integer arithmetic with int and long primitive types. The developer should choose the primitive type to ensure that arithmetic operations consistently produce correct results, which in some cases means the operations will not overflow the range of values of the computation. The best practice is to choose the primitive type and algorithm to avoid overflow. In cases where the size is int or long and overflow errors need to be detected, the methods whose names end with Exact throw an ArithmeticException when the results overflow.

IEEE 754 Recommended Operations

The 2019 revision of the IEEE 754 floating-point standard includes a section of recommended operations and the semantics of those operations if they are included in a programming environment. The recommended operations present in this class include sin, cos, tan, asin, acos, atan, exp, expm1, log, log10, log1p, sinh, cosh, tanh, hypot, and pow. (The sqrt operation is a required part of IEEE 754 from a different section of the standard.) The special case behavior of the recommended operations generally follows the guidance of the IEEE 754 standard. However, the pow method defines different behavior for some arguments, as noted in its specification. The IEEE 754 standard defines its operations to be correctly rounded, which is a more stringent quality of implementation condition than required for most of the methods in question that are also included in this class.

Since:
1.0
@spec
https://standards.ieee.org/ieee/754/6210/ IEEE Standard for Floating-Point Arithmetic

Source: Java 24.0.2 (module: java.base)

*/

/*For beginner Java programs, it's good to understand when resources should be closed.
Important: When you use new Scanner(System.in), closing the scanner also closes System.in. This can prevent other parts of your program from reading keyboard input later.
For simple programs, you may see sc.close() at the end. If the program needs to continue accepting input elsewhere, be careful about closing a scanner connected to System.in.
In short: Scanner.close() stops further use of the scanner and releases the underlying resource when applicable. Closes this scanner: You cannot use that scanner for further input after closing it.

Underlying readable: If the scanner is connected to a resource that can be closed, such as a file or System.in, closing the scanner also closes that resource.

If already closed: Calling sc.close() again does nothing.

IllegalStateException: If you try to read input after closing the scanner, Java throws this exception.*/