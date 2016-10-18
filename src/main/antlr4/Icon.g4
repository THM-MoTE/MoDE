grammar Icon;

import  CoordinateSystem, IconElements, Utils;

icon    : 'Icon' LBRACE (iconContent (COMMA iconContent)*)? RBRACE;
diagram : 'Diagram' LBRACE (iconContent (COMMA iconContent)*)? RBRACE;

iconContent : coordinateSystem
            | graphics
            ;

graphics    : 'graphics' EQUALS LCBRACE (element (COMMA element)*)? RCBRACE;

element     : rectangle
            | text
            | ellipse
            | line
            | polygon
            | bitmap
            ;