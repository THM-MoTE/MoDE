lexer grammar ModelicaIconLexer;

@lexer::header {
  package de.thm.mni.mhpp11.parser;
}

RECTANGLE   : 'Rectangle';
TEXT        : 'Text';
ELLIPSE     : 'Ellipse';
LINE        : 'Line';
POLYGON     : 'Polygon';
BITMAP      : 'Bitmap';

TEXTSTYLE   : 'TextStyle';

TEXTALIGNMENT   : 'TextAlignment';

FILLPATTERN     : 'FillPattern';
LINEPATTERN     : 'LinePattern';
BORDERPATTERN   : 'BorderPattern';

ARROW   : 'Arrow';
SMOOTH  : 'Smooth';

//TEXTSTYLE
BOLD        : 'Bold';
ITALIC      : 'Italic';
UNTERLINE   : 'UnderLine';

//TEXTALIGNMENT
LEFT    : 'Left';
CENTER  : 'Center';
RIGHT   : 'Right';

//TODO: definition schreibweise nachschauen
//FILL
NONE                : 'None';       //LINE //BORDER //ARROW //SMOOTH
SOLID               : 'Solid';      //LINE
HORIZONTAL          : 'Horizontal';
VERTICAL            : 'Vertical';
CROSS               : 'Cross';
FORWARD             : 'Forward';
BACKWARD            : 'Backward';
CROSSDIAG           : 'CrossDiag';
HORIZONTALCYLINDER  : 'HorizontalCylinder';
VERTICALCYLINDER    : 'VerticalCylinder';
SPHERE              : 'Sphere';

//LINE
DASH        : 'Dash';
DOT         : 'Dot';
DASHDOT     : 'DashDot';
DASHDOTDOT  : 'DashDotDot';

//BORDER
RAISED  : 'Raised';
SUNKEN  : 'Sunken';
ENGRAVED: 'Engraved';

//ARROW
OPEN    : 'Open';
FILLED  : 'Filled';
HALF    : 'Half';

//SMOOTH
BEZIER  : 'Bezier';

//COLOR
BLACK   : 'Black';

TRUE    : 'true';
FALSE   : 'false';

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

fragment S_CHAR : ~ ["\\];