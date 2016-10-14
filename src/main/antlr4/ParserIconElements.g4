parser grammar ParserIconElements;

import ParserUtils;

options { tokenVocab=LexerIconElements; } // use tokens from LexerIconElements.g4

rectangle   : RECTANGLE LBRACE filledShape COMMA bp=borderPattern COMMA e=extent COMMA r=NUMBER RBRACE;

text        : TEXT LBRACE filledShape COMMA extent COMMA t=STRING COMMA fs=NUMBER COMMA (f=STRING COMMA)? (LCBRACE (ts+=textStyle) (COMMA ts+=textStyle)* RCBRACE COMMA)? ta=textAlignment RBRACE;

ellipse     : ELLIPSE LBRACE filledShape COMMA extent COMMA sa=NUMBER COMMA ea=NUMBER RBRACE;

line        : LINE LBRACE graphicItem COMMA points COMMA lineColor=color COMMA linePattern COMMA lineThickness=NUMBER COMMA arrows? COMMA as=NUMBER COMMA smooth RBRACE;

polygon     : POLYGON LBRACE filledShape COMMA points COMMA smooth RBRACE;

bitmap      : BITMAP LBRACE graphicItem COMMA extent (COMMA path=STRING)? (COMMA source=STRING)? RBRACE;

graphicItem: visible=bool COMMA LCBRACE origin=point RCBRACE COMMA rotation=NUMBER ;

filledShape: gi=graphicItem COMMA lineColor=color COMMA fillColor=color COMMA linePattern COMMA fillPattern COMMA lineThickness=NUMBER;

arrows  : LCBRACE a1=arrow COMMA a2=arrow RCBRACE ;

arrow   : ARROW LIT_DOT type=arrow_type ;

arrow_type  : NONE
            | OPEN
            | FILLED
            | HALF
            ;

smooth  : SMOOTH LIT_DOT type=smooth_type ;

smooth_type : NONE
            | BEZIER
            ;

textStyle   : TEXTSTYLE LIT_DOT type=textstyle_type ;

textAlignment   : TEXTALIGNMENT LIT_DOT type=textalignment_type ;

linePattern     : LINEPATTERN LIT_DOT type=linepattern_type ;
borderPattern   : BORDERPATTERN LIT_DOT type=borderpattern_type ;
fillPattern     : FILLPATTERN LIT_DOT type=fillpattern_type ;

textstyle_type  : BOLD
                | ITALIC
                | UNTERLINE ;

textalignment_type  : LEFT
                    | CENTER
                    | RIGHT ;

fillpattern_type    : NONE
                    | SOLID
                    | HORIZONTAL
                    | VERTICAL
                    | CROSS
                    | FORWARD
                    | BACKWARD
                    | CROSSDIAG
                    | HORIZONTALCYLINDER
                    | VERTICALCYLINDER
                    | SPHERE ;

borderpattern_type  : NONE
                    | RAISED
                    | SUNKEN
                    | ENGRAVED ;

linepattern_type    : NONE
                    | SOLID
                    | DASH
                    | DOT
                    | DASHDOT
                    | DASHDOTDOT ;