public class MakingDecisions {

    public static void main(String[] args) {
        // Test method 'evenOdd'.
        // Call the method with an even number.
        evenOdd(4); // Expected result: "EVEN"

        // Call the method with an odd number.
        evenOdd(9); // Expected result: "ODD"
    
        // Call the method with negative numbers.
        evenOdd(-8); // Expected result: "EVEN"
        evenOdd(-1); // Expected result: "ODD"

        // Call the method with zero.
        evenOdd(0); // Expected result: "EVEN"

    }


    /**
     * This method prints EVEN if num is even, otherwise ODD
     * @param num - whole number
     */
    public static void evenOdd(int num) {
        // If int 'num' is even...
        if (num % 2 == 0) {
            // Print "EVEN".
            System.out.println("EVEN");
        } else { // Otherwise...
            // Print "ODD".
            System.out.println("ODD");
        }

    } // End of method 'evenOdd'.


}