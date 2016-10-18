grammar IgnoreEntry;

import Utils;

ignore  : ignoreElement
        | keyValue
        ;

ignoreElement : key LBRACE (ignore (COMMA ignore)*)? RBRACE;

keyValue: key EQUALS value;

key     : WORD;

value   : path
        | bool
        | NUMBER
        | STRING
        | WORD
        ;



path    : list+=WORD (LIT_DOT list+=WORD)+;

WORD : [A-Za-z0-9]+;
