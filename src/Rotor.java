public class Rotor {

    // Current rotor position
    private int mPosition;
    // Preset rotor number
    private int mRotorNumber;
    // Rotor's cypher directly corresponding to 'alphabet'
    private String cypher;
    // String containing the characters which trigger the next rotor to advance
    private String turnover;
    // English alphabet
    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Public constructor
     * @param rotorPosition Initial rotor position
     * @param rotorNumber Which rotor to choose
     */
    public Rotor(int rotorPosition, int rotorNumber) {
        mPosition = rotorPosition;
        mRotorNumber = rotorNumber;

        // Pick the preset rotor and set the cypher and turnover strings
        switch (mRotorNumber) {
            case 1:
                cypher = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
                turnover = "Q";
                break;
            case 2:
                cypher = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
                turnover = "E";
                break;
            case 3:
                cypher = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
                turnover = "V";
                break;
            case 4:
                cypher = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
                turnover = "J";
                break;
            case 5:
                cypher = "VZBRGITYUPSDNHLXAWMJQOFECK";
                turnover = "Z";
                break;
            case 6:
                cypher = "JPGVOUMFYQBENHZRDKASXLICTW";
                turnover = "ZM";
                break;
            case 7:
                cypher = "NZJHGRCXMYSWBOUFAIVLPEKQDT";
                turnover = "ZM";
                break;
            case 8:
                cypher = "FKQHTLXOCBJSPDZRAMEWNIUYGV";
                turnover = "ZM";
                break;
        }
    }

    /**
     * Get rotor's cypher letter at some position
     * @param letterPosition Position of cypher letter to get
     * @return Cypher equivalent
     */
    public Character getCypherLetterAtPosition(int letterPosition) {
        return cypher.charAt(letterPosition);
    }

    /**
     * Get output position of an input position for the rotor
     * @param inputPosition Input signal position
     * @return Output signal position
     */
    public Integer encodePosition(int inputPosition) {
        int inputSignalPosition = inputPosition + mPosition;
        int outputLetter = cypher.charAt(inputSignalPosition);

        return alphabet.indexOf(outputLetter);
    }

    /**
     * Get output position of an input position for the rotor in reverse
     * @param inputPosition Input signal position
     * @return Output signal position
     */
    public Integer encodePositionReverse(int inputPosition) {
        int inputSignalPosition = inputPosition + mPosition;
        int outputLetter = alphabet.charAt(inputSignalPosition);

        return cypher.indexOf(outputLetter);
    }

    /**
     * Rotate the rotor (increase position by one)
     * Note: 26=0
     * @return If the next rotor will rotate
     */
    public boolean rotate() {
        // Check if current position is a turnover position
        boolean nextRotate = false;
        for (char turnoverChar : turnover.toCharArray()) {
            if (mPosition == alphabet.indexOf(turnoverChar)) {
                nextRotate = true;
            }
        }

        // Increase position
        mPosition++;
        if (mPosition == 26) {
            mPosition = 0;
        }

        cypher = cypher.substring(1) + cypher.charAt(0);

        // Return if next rotor is rotated
        return nextRotate;
    }

    /**
     * @return The rotor's turnover letter(s)
     */
    public String getTurnover() {
        return turnover;
    }

    /**
     * @return The rotor's current position
     */
    public int getPosition() {
        return mPosition;
    }

}
