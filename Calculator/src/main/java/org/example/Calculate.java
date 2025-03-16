package org.example;

// This class is responsible for performing calculations
public class Calculate {

    // This method adds two numbers
    public void add(float a, float b) {
        float resultant = a + b;
        System.out.printf("Resolution: %.2f\n", resultant);
    }

    // This method subtracts two numbers
    public void subtract(float a, float b) {
        float resultant = a - b;
        System.out.printf("Resolution: %.2f\n", resultant);
    }

    // This method multiplies two numbers
    public void multiply(float a, float b) {
        float resultant = a * b;
        System.out.printf("Resolution: %.2f\n", resultant);
    }

    // This method divides two numbers
    public void divide(float a, float b) {
        float resultant =  a / b;
        float module = a % b;
        System.out.printf("Resolution: %.2f\n", resultant);
        System.out.printf("Module: %.2f\n", module);
    }

    // This method calculates the power of a number
    public void power(int a, int b) {
        float resultant = (float) Math.pow(a, b);
        System.out.printf("Resolution: %.2f\n", resultant);
    }

    // This method calculates the square root of a number
    public void squareRoot(float a) {
        float resultant = (float) Math.sqrt(a);
        System.out.printf("Resolution: %.2f\n", resultant);
    }

    // This method calculates the cube root of a number
    public void cubeRoot(float a) {
        float resultant = (float) Math.cbrt(a);
        System.out.printf("Resolution: %.2f\n", resultant);
    }
}
