public class Enigma {
    private Rotor rotor1;
    private Rotor rotor2;
    private Rotor rotor3;
    //private Reflector reflector;
    //private Plugboard plugboard;

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public Enigma(Rotor r1, Rotor r2, Rotor r3) {
        rotor1 = r1;
        rotor2 = r2;
        rotor3 = r3;
    }

    public Character encodeLetter(Character letter) {
        Character encodedLetter = letter;

        encodedLetter = rotor1.getCypherLetter(encodedLetter);
        encodedLetter = rotor2.getCypherLetter(encodedLetter);
        encodedLetter = rotor3.getCypherLetter(encodedLetter);



        return encodedLetter;
    }
}
