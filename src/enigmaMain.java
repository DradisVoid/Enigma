public class enigmaMain {
    public static void main(String[] args) {
        Rotor r1 = new Rotor(0, 0);
        Rotor r2 = new Rotor(0, 1);
        Rotor r3 = new Rotor(0, 2);

        Enigma enigmaMachine = new Enigma(r1, r2, r3);

        System.out.print(enigmaMachine.encodeLetter('A'));
    }
}
