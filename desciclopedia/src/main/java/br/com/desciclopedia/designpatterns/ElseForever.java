package br.com.desciclopedia.designpatterns;

public class ElseForever {
    private final String name;
    private final int value;

    public static final ElseForever ACE_AS_ONE = new ElseForever("A", 1);
    public static final ElseForever TWO = new ElseForever("2", 2);
    public static final ElseForever THREE = new ElseForever("3", 3);
    public static final ElseForever FOUR = new ElseForever("4", 4);
    public static final ElseForever FIVE = new ElseForever("5", 5);
    public static final ElseForever SIX = new ElseForever("6", 6);
    public static final ElseForever SEVEN = new ElseForever("7", 7);
    public static final ElseForever EIGHT = new ElseForever("8", 8);
    public static final ElseForever NINE = new ElseForever("9", 9);
    public static final ElseForever TEN = new ElseForever("10", 10);
    public static final ElseForever JACK = new ElseForever("J", 11);
    public static final ElseForever QUEEN = new ElseForever("Q", 12);
    public static final ElseForever KING = new ElseForever("K", 13);
    public static final ElseForever ACE = new ElseForever("A", 14);

    private ElseForever(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }

    public static ElseForever decode(String s) {
        if(s == null) {
            return null;
        } else if(s.equalsIgnoreCase(ACE.toString())) {
            return ACE;
        } else if(s.equalsIgnoreCase(TWO.toString())) {
            return TWO;
        } else if(s.equalsIgnoreCase(THREE.toString())) {
            return THREE;
        } else if(s.equalsIgnoreCase(FOUR.toString())) {
            return FOUR;
        } else if(s.equalsIgnoreCase(FIVE.toString())) {
            return FIVE;
        } else if(s.equalsIgnoreCase(SIX.toString())) {
            return SIX;
        } else if(s.equalsIgnoreCase(SEVEN.toString())) {
            return SEVEN;
        } else if(s.equalsIgnoreCase(EIGHT.toString())) {
            return EIGHT;
        } else if(s.equalsIgnoreCase(NINE.toString())) {
            return NINE;
        } else if(s.equalsIgnoreCase(TEN.toString())) {
            return TEN;
        } else if(s.equalsIgnoreCase(JACK.toString())) {
            return JACK;
        } else if(s.equalsIgnoreCase(QUEEN.toString())) {
            return QUEEN;
        } else if(s.equalsIgnoreCase(KING.toString())) {
            return KING;
        } else {
            return null;
        }
    }

    public int getValue() {
        return value;
    }
}