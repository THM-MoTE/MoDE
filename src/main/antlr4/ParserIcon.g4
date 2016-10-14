parser grammar ParserIcon;

import ParserUtils, ParserCoordinateSystem, ParserIconElements;

options { tokenVocab=LexerIcon; } // use tokens from LexerIcon.g4

iconAnnotation    : ICON LBRACE coordinateSystem RBRACE;


list    :  items+=listItem (COMMA items+=listItem)* ;

listItem    : rectangle
            | text
            | ellipse
            | line
            | polygon
            | bitmap
            ;