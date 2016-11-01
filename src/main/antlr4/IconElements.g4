grammar IconElements;

import Utils;


graphicItem : visible
            | origin
            | rotation
            ;

filledShape : lineColor
            | fillColor
            | linePattern
            | fillPattern
            | lineThickness
            ;
fillPattern     : 'fillPattern' EQUALS 'FillPattern' LIT_DOT type=fillPatternType;
fillPatternType : NONE
                | SOLID
                | HORIZONTAL
                | VERTICAL
                | CROSS
                | FORWARD
                | BACKWARD
                | CROSSDIAG
                | HORIZONTALCYLINDER
                | VERTICALCYLINDER
                | SPHERE
                ;

lineColor       : 'lineColor' EQUALS val=colorType;
fillColor       : 'fillColor' EQUALS val=colorType;
lineThickness   : 'lineThickness' EQUALS val=NUMBER;
radius          : 'radius' EQUALS val=NUMBER;


line        : 'Line' LBRACE (data+=lineData (COMMA data +=lineData)*)? RBRACE ;
lineData    : graphicItem
            | points
            | color
            | linePattern
            | thickness
            | arrows
            | arrowSize
            | smooth
            ;
points  : 'points' EQUALS val=pointList;
color   : 'color' EQUALS val=colorType;
thickness: 'thickness' EQUALS val=NUMBER;

arrows      : 'arrow' EQUALS LCBRACE a1=arrow COMMA a2=arrow RCBRACE ;
arrow       : ARROW LIT_DOT type=arrowType ;
arrowType   : NONE
            | OPEN
            | FILLED
            | HALF
            ;
arrowSize: 'arrowSize' EQUALS val=NUMBER;


polygon     : 'Polygon' LBRACE (data+=polygonData (COMMA data +=polygonData)*)? RBRACE;
polygonData : graphicItem
            | filledShape
            | points
            | smooth
            ;


rectangle       : 'Rectangle' LBRACE (data+=rectangleData (COMMA data +=rectangleData)*)? RBRACE;
rectangleData   : graphicItem
                | filledShape
                | borderPattern
                | extent
                | radius
                ;
borderPattern       : 'borderPattern' EQUALS 'BorderPattern' LIT_DOT type=borderPatternType ;
borderPatternType   : NONE
                    | RAISED
                    | SUNKEN
                    | ENGRAVED ;


ellipse     : 'Ellipse' LBRACE (data+=ellipseData (COMMA data +=ellipseData)*)? RBRACE;
ellipseData : graphicItem
            | filledShape
            | extent
            | startAngle
            | endAngle
            ;
startAngle  : 'startAngle' EQUALS val=NUMBER;
endAngle    : 'endAngle' EQUALS val=NUMBER;


text        : 'Text' LBRACE (data+=textData (COMMA data +=textData)*)? RBRACE;
textData    : graphicItem
            | filledShape
            | extent
            | textString
            | fontSize
            | fontName
            | textStyle
            | horizontalAlignment
            | index
            ;
textString              : LIT_STRING EQUALS val=STRING;
fontSize            : 'fontSize' EQUALS val=NUMBER;
fontName            : 'fontName' EQUALS val=STRING;
textStyle           : 'textStyle' EQUALS 'TextStyle' LIT_DOT type=textStyleType;
textStyleType  : BOLD
                | ITALIC
                | UNTERLINE
                ;

horizontalAlignment : 'horizontalAlignment' EQUALS val=textAlignment;
textAlignment       : TEXTALIGNMENT LIT_DOT type=textAlignmentType;
textAlignmentType  : LEFT
                    | CENTER
                    | RIGHT
                    ;
index               : 'index' EQUALS val=NUMBER;


bitmap      : 'Bitmap' LBRACE (data+=bitmapData (COMMA data +=bitmapData)*)? RBRACE;
bitmapData  : graphicItem
            | extent
            | fileName
            | imageSource
            ;
fileName    : 'fileName' EQUALS val=STRING;
imageSource : 'imageSource' EQUALS val=STRING;


smooth  : 'smooth' EQUALS 'Smooth' LIT_DOT type=smoothType;
smoothType : NONE
           | BEZIER
           ;


linePattern     : 'pattern' EQUALS 'LinePattern' LIT_DOT type=linePatternType;
linePatternType    : NONE
                   | SOLID
                   | DASH
                   | DOT
                   | DASHDOT
                   | DASHDOTDOT ;


//LEXER

LIT_STRING : LIT_SSTRING | LIT_TEXTSTRING;
fragment LIT_SSTRING  : 'string';
fragment LIT_TEXTSTRING  : 'textString';

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