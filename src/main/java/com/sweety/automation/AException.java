package com.sweety.automation;

/**
 * Created by skumari on 2/8/2018.
 */
public class AException {
    public static void main(String args[]) {
        int data = 10;

        try {
            data = data / 0;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException occurred");
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        finally {
            System.out.println("finally block is always executed");
        }

    }
}
