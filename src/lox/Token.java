package lox;

public class Token {
    final Token type;
    final String lexeme;
    final Object literal;
    final int line;

    public Token(Token type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    @Override
    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
