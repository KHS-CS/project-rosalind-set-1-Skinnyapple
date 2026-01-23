
/**
 * Count DNA Strings
 *
 * @Alex 
 * @1.0
 */
public class ProblemDNA
{
    public static void main(String[] args) {
        // replace this string with the one from Project Rosalind
        final String data = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        
        // count nucleotides
        int[] output = nucleotideCounts(data);
        
        // print counts in A C G T order
        System.out.println(formatData(output));
    }
    
    // Takes an array of counts and returns a space-delimited String
    // in the order A C G T
    private static String formatData(int[] counts) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            output.append(counts[i]);
            if (i < counts.length - 1) {
                output.append(" "); // add space between numbers but not at the end
            }
        }
        return output.toString();
    }
    
    // Takes a DNA string and counts how many times each nucleotide appears
    // Returns counts in A C G T order
    private static int[] nucleotideCounts(String dnaString) {
        int[] counts = new int[4]; // [A, C, G, T]
        
        for (char nucleotide : dnaString.toCharArray()) {
            switch (nucleotide) {
                case 'A':
                    counts[0]++;
                    break;
                case 'C':
                    counts[1]++;
                    break;
                case 'G':
                    counts[2]++;
                    break;
                case 'T':
                    counts[3]++;
                    break;
            }
        }
        
        return counts;
    }
}
