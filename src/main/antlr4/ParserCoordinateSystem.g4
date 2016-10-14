parser grammar ParserCoordinateSystem;

options { tokenVocab=LexerCoordinateSystem; } // use tokens from LexerCoordinateSystem.g4

import ParserUtils;


coordinateSystem    : COORDINATESYSTEM LBRACE extent COMMA preserveAspectRatio COMMA initialScale COMMA grid RBRACE;

preserveAspectRatio : PRESERVEASPECTRATIO EQUALS val=bool;

initialScale        : INITIALSCALE EQUALS val=NUMBER;

grid                : GRID EQUALS val=point;