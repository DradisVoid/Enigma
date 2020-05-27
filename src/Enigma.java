public class Enigma {

    // 3 rotors used in the Enigma Machine
    private Rotor rotor1;
    private Rotor rotor2;
    private Rotor rotor3;
    // Reflector that sends signal back through the rotors
    //private Reflector reflector;
    // Plugboard that reroutes some letters
    //private Plugboard plugboard;

    // String containing alphabet
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Public constructor
     * @param r1 Rotor 1
     * @param r2 Rotor 2
     * @param r3 Rotor 3
     */
    public Enigma(Rotor r1, Rotor r2, Rotor r3) {
        rotor1 = r1;
        rotor2 = r2;
        rotor3 = r3;
    }

    /**
     * Encode one letter through the current enigma machine
     * @param letter Letter to encode
     * @return The encoded letter
     */
    public Character encodeLetter(Character letter) {
        System.out.println(letter);
        int encodedLetterPosition = alphabet.indexOf(letter);

        // Rotate rotors before encoding
        if (rotor3.rotate()) {
            if (rotor2.rotate()) {
                rotor1.rotate();
            }
        }

        System.out.println(alphabet.charAt(rotor1.getPosition()) + " " +
                alphabet.charAt(rotor2.getPosition()) + " " + alphabet.charAt(rotor3.getPosition()));

        System.out.println(rotor3.getCypherLetterAtPosition(encodedLetterPosition));
        encodedLetterPosition = rotor3.encodePosition(encodedLetterPosition);

        System.out.println(rotor2.getCypherLetterAtPosition(encodedLetterPosition));
        encodedLetterPosition = rotor2.encodePosition(encodedLetterPosition);

        System.out.println(rotor1.getCypherLetterAtPosition(encodedLetterPosition));
        encodedLetterPosition = rotor1.encodePosition(encodedLetterPosition);

        //encodedLetterPosition = reflector.reflect(encodedLetterPosition);
/*
        System.out.println(rotor1.getCypherLetterAtPosition(encodedLetterPosition));
        encodedLetterPosition = rotor1.encodePositionReverse(encodedLetterPosition);

        System.out.println(rotor2.getCypherLetterAtPosition(encodedLetterPosition));
        encodedLetterPosition = rotor2.encodePositionReverse(encodedLetterPosition);

        System.out.println(rotor3.getCypherLetterAtPosition(encodedLetterPosition));
        encodedLetterPosition = rotor3.encodePositionReverse(encodedLetterPosition);
*/
        return alphabet.charAt(encodedLetterPosition);
    }
}
