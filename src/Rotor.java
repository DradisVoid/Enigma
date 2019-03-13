public class Rotor {
    int mPosition = 0;
    int mRotorNumber;
    int mRotorPosition;
    String cypher;
    String notch;
    String turnover;

    public Rotor(int rotorPosition, int rotorNumber) {
        mRotorPosition = rotorPosition;
        mRotorNumber = rotorNumber;

        switch (rotorNumber) {
            case 0:
                cypher = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
                notch = "Y";
                turnover = "Q";

            case 1:
                cypher = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
                notch = "M";
                turnover = "E";

            case 2:
                cypher = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
                notch = "D";
                turnover = "V";

            case 3:
                cypher = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
                notch = "R";
                turnover = "J";

            case 4:
                cypher = "VZBRGITYUPSDNHLXAWMJQOFECK";
                notch = "H";
                turnover = "Z";

        }
    }
}
