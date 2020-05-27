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
        // Store original letter
        Character encodedLetter = letter;

        encodedLetter = rotor1.getCypherLetter(encodedLetter);
        encodedLetter = rotor2.getCypherLetter(encodedLetter);
        encodedLetter = rotor3.getCypherLetter(encodedLetter);

        return encodedLetter;
    }
}
