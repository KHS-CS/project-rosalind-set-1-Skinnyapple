
/**
 * @Alex
 * @1.0
 */
public class ProblemRNA
{
    public static void main(String[] args) {
        // replace this string with the one from Project Rosalind
        final String inputDNA = "GATGGAACTTGACTACGTAAATT";
        
        // transcribe DNA to RNA
        final String output = transcribeDNAtoRNA(inputDNA);
        
        // print the result for Rosalind
        System.out.println(output);
    }
        
    // Takes a DNA string and replaces all 'T' with 'U' to produce RNA
    private static String transcribeDNAtoRNA(String dnaString) {
        return dnaString.replace('T', 'U');
    }    
}
