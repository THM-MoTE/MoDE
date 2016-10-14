parser grammar ParserUtils;

options { tokenVocab=LexerUtils; } // use tokens from LexerIcon.g4


extent  : EXTENT EQUALS LCBRACE p1=point COMMA p2=point RCBRACE ;

points  : LCBRACE  point (COMMA point )+ RCBRACE;

bool    : TRUE|FALSE;

color   : LCBRACE r=NUMBER COMMA g=NUMBER COMMA b=NUMBER RCBRACE
        | n=BLACK;

point   : LCBRACE x=NUMBER COMMA y=NUMBER RCBRACE;

