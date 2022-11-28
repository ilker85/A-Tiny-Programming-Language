package com.tinylanguage.ze;

public enum TokenType {
    //Single character tokens
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    //One or Two character tokens
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,
    
    //Literals
    IDENTIFIER, STRING, INTEGER,

    //Keyword
    AND, OR, CLASS, IF, ELSE, FALSE, TRUE, FUN, FOR, WHILE, NIL, PRINT, RETURN,
    SUPER, THIS, VAR, EOF 
}
