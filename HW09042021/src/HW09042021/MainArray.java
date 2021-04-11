package HW09042021;

public class MainArray {

    public static void main(String[] args) {

        DifferentTypeArray<String> array = new DifferentTypeArray<>(new String[]{"al", "on", "test result"});
        DifferentTypeArray<Integer> array1 = new DifferentTypeArray<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        DifferentTypeArray<Double> array2 = new DifferentTypeArray<>(new Double[]{1.2, 1.5, 6.7});

        System.out.println(array.getArrayIndex(2));
        System.out.println(array1.getArrayIndex(1));
        System.out.println(array2.getArrayIndex(0));
    }

}

