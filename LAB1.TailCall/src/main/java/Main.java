public class Main {
    public static void main(String[] args) {
        //Task 1
        double[] doubleArray = {1.0,3.4,3.66,7.43,52.23,54.232};
        System.out.println(String.format("Average (tail call):\t%.3f", Average.getAverageTailCall(doubleArray)));
        System.out.println(String.format("Average (simple):\t\t%.3f", Average.getAverage(doubleArray)));
        System.out.println();

        //Task 2
        int[] intArray = {3,4,5,6,7,8,9,4,4,4,5,6,3,3,3,2,2,2,2,2,2,2,7,4,6,4,4,4,4,4,4,4,4};
        System.out.println(String.format("Sequence reiteration (tail call):\t\t\t%d",
                SequenceReiteration.getMaxTailCall(intArray)));
        System.out.println(String.format("Sequence reiteration (simple recursion):\t%d",
                SequenceReiteration.getMaxTailCall(intArray)));
    }
}
