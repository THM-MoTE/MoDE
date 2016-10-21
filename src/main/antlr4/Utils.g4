grammar Utils;


visible     : 'visible'  EQUALS val=bool;
origin      : 'origin'   EQUALS val=point;
rotation    : 'rotation' EQUALS val=NUMBER;
extent      : 'extent' EQUALS LCBRACE p1=point COMMA p2=point RCBRACE ;

pointList  : LCBRACE  point (COMMA point)+ RCBRACE;

bool    : TRUE|FALSE;

colorType  : LCBRACE r=NUMBER COMMA g=NUMBER COMMA b=NUMBER RCBRACE
            | n=BLACK
            ;

point   : LCBRACE x=NUMBER COMMA y=NUMBER RCBRACE;


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

LIT_DOT : '.';

COMMA   : ',';

SEMICOLON : ';';

WHITESPACE  : [ \r\n\t] + -> channel (HIDDEN);

STRING          : '\\\"' S_CHAR* '\\\"';

fragment S_CHAR : ~["\\]
                | ESCAPESEQUENCE
                ;

fragment ESCAPESEQUENCE :   '\\\\\\' [btnfr"'\\]
                        |   OCTALESCAPE
                        |   UNICODEESCAPE
                        ;

fragment OCTALESCAPE    :   '\\\\\\' OCTALDIGIT
                        |   '\\\\\\' OCTALDIGIT OCTALDIGIT
                        |   '\\\\\\' ZEROTOTHREE OCTALDIGIT OCTALDIGIT
                        ;

fragment UNICODEESCAPE  :   '\\\\\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT;


S_STRING    : '"' S_CHAR* '"';

fragment S_S_CHAR : ~["\\]
                | ESCAPESEQUENCE
                ;

fragment S_ESCAPESEQUENCE :   '\\' [btnfr"'\\]
                        |   OCTALESCAPE
                        |   UNICODEESCAPE
                        ;

fragment S_OCTALESCAPE    :   '\\' OCTALDIGIT
                        |   '\\' OCTALDIGIT OCTALDIGIT
                        |   '\\' ZEROTOTHREE OCTALDIGIT OCTALDIGIT
                        ;

fragment S_UNICODEESCAPE  :   '\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT;


fragment ZEROTOTHREE    : [0-3];
fragment OCTALDIGIT     : [0-7];
fragment HEXDIGIT       : [0-9a-fA-F];