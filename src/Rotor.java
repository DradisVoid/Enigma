public class Rotor {
    private int mPosition = 0;
    private int mRotorNumber;
    private int mRotorPosition;
    private String cypher;
    private String turnover;
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Rotor(int rotorPosition, int rotorNumber) {
        mRotorPosition = rotorPosition;
        mRotorNumber = rotorNumber;

        switch (rotorNumber) {
            case 0:
                cypher = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
                turnover = "Q";

            case 1:
                cypher = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
                turnover = "E";

            case 2:
                cypher = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
                turnover = "V";

            case 3:
                cypher = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
                turnover = "J";

            case 4:
                cypher = "VZBRGITYUPSDNHLXAWMJQOFECK";
                turnover = "Z";

        }
    }

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

    public void rotate() {
        String newCypher = cypher.charAt(cypher.length() - 1) + cypher.substring(0, cypher.length() - 2);
        cypher = newCypher;
    }

    public String getTurnover() {
        return turnover;
    }

    public int getPosition() {
        return mPosition;
    }

}
