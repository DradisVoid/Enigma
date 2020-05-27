public class Rotor {

    // Current rotor position
    private int mPosition = 0;
    // Preset rotor number
    private int mRotorNumber;
    // Initial rotor position
    private int mRotorPosition;
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
        mRotorPosition = rotorPosition;
        mRotorNumber = rotorNumber;

        // Pick the preset rotor and set the cypher and turnover strings
        switch (rotorNumber) {
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
     * Get corresponding cypher letter
     * @param letter Original letter
     * @return Cypher equivalent
     */
    public Character getCypherLetter(Character letter) {
        int iPosition = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            if (alphabet.charAt(i) == letter) {
                iPosition = i;
                break;
            }
        }
        return cypher.charAt(iPosition);
    }

    /**
     * Rotate the rotor (increase position by one)
     * Note: 26=0
     */
    public void rotate() {
        mPosition++;
        if (mPosition == 26) {
            mPosition = 0;
        }
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
