lexer grammar LexerUtils;

EXTENT  : 'extent';

//COLOR
BLACK   : 'Black';

TRUE    : 'true';
FALSE   : 'false';

EQUALS : '=';

LCBRACE : '{';
RCBRACE : '}';
LBRACE : '(';
RBRACE : ')';

NUMBER  : '-'?[0-9]+
        | '-'?[0-9]+'.'[0-9]+
        | '-'?[0-9]+'.'[0-9]+'e''-'?[0-9]+;

STRING : '"' S_CHAR* '"';

LIT_DOT : '.';

COMMA   : ',';

WHITESPACE  : [ \r\n\t] + -> channel (HIDDEN);

fragment S_CHAR : ~["\\]
                | ESCAPESEQUENCE
                ;

fragment ESCAPESEQUENCE :   '\\' [btnfr"'\\]
                        |   OCTALESCAPE
                        |   UNICODEESCAPE
                        ;

fragment OCTALESCAPE    :   '\\' OCTALDIGIT
                        |   '\\' OCTALDIGIT OCTALDIGIT
                        |   '\\' ZEROTOTHREE OCTALDIGIT OCTALDIGIT
                        ;

fragment UNICODEESCAPE  :   '\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT;
fragment ZEROTOTHREE    : [0-3];
fragment OCTALDIGIT     : [0-7];
fragment HEXDIGIT       : [0-9a-fA-F];