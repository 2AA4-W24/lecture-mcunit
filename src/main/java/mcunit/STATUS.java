package mcunit;

public enum STATUS {
    PASSED('X'), FAILED(' '), ERRORED('!');

    private final char symbol;

    private STATUS(char s) { this.symbol = s; }

    @Override
    public String toString() { return "[" + symbol + ']';}
}
