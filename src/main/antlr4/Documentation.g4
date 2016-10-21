grammar Documentation;

import Utils;

documentation: 'Documentation' LBRACE (documentationContent (COMMA documentationContent)*)? RBRACE;

documentationContent : info
                     | revisions
                     ;

info        : 'info' EQUALS val=STRING;
revisions   : 'revisions' EQUALS val=STRING;