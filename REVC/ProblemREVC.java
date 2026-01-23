
/**
 * Reversing the DNA string in reserve
 *
 * @Alex 
 * @1.0
 */
public class ProblemREVC {
    public static void main(String[] args) {
        // replace this string with the one from Project Rosalind
        final String inputDNA = "AAAACCCGGT";
        
        // compute the reverse complement
        final String output = reverseComplement(inputDNA);
        
        // print the result for Rosalind
        System.out.println(output);
    }
        
    // Returns the reverse complement of a DNA string
    private static String reverseComplement(String dnaString) {
        StringBuilder complement = new StringBuilder();
        
        // first, compute the complement
        for (int i = 0; i < dnaString.length(); i++) {
            char nucleotide = dnaString.charAt(i);
            switch (nucleotide) {
                case 'A':
                    complement.append('T');
                    break;
                case 'T':
                    complement.append('A');
                    break;
                case 'C':
                    complement.append('G');
                    break;
                case 'G':
                    complement.append('C');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }
        // reverse the complement to get the reverse complement
        return complement.reverse().toString();
    }    
}
