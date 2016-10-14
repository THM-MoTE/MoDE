lexer grammar LexerIconElements;

import LexerUtils;

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