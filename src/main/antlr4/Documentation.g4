grammar Documentation;

import Utils;

documentation: 'Documentation' LBRACE (documentationContent (COMMA documentationContent)*)? RBRACE;

documentationContent : info
                     | revisions
                     ;

info        : 'info' EQUALS val=string;
revisions   : 'revisions' EQUALS val=STRING;