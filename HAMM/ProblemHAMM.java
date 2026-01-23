
/**
 * @Alex
 * @1.0
 */
public class ProblemHAMM {
    public static void main(String[] args) {
        // replace this string with the one from Project Rosalind
        final String inputDNA1 = "GAGCCTACTAACGGGAT";
        final String inputDNA2 = "CATCGTAATGACGGCCT";
        final int output = hammingDistance(inputDNA1, inputDNA2);
        
        // print the result so you can copy it to Rosalind
        System.out.println(output);
    }
        
    // Takes two DNA strings of equal length and returns
    // the number of positions where they differ
    private static int hammingDistance(String a, String b) {
        if (a.length() != b.length()) {
            throw new IllegalArgumentException("Strings must be of equal length");
        }

        int distance = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }    
}
