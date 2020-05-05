package codewar;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] array = dna.toCharArray();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 'T':
                    array[i] = 'A';
                    break;
                case 'A':
                    array[i] = 'T';
                    break;
                case 'G':
                    array[i] = 'C';
                    break;
                case 'C':
                    array[i] = 'G';
                    break;
                default:
                    break;
            }
        }
        return new String(array);
    }
}
