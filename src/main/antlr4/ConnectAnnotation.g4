grammar ConnectAnnotation;

import IconElements, Utils;

connectAnnotation  : 'annotation' LBRACE (connectAnnotationElement (COMMA connectAnnotationElement)*)? RBRACE SEMICOLON;

connectAnnotationElement    : line
                            | text
                            ;