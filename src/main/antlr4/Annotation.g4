grammar Annotation;

import  Icon, Documentation, Placement, Utils, ConnectAnnotation, IgnoreEntry;

annotation  : 'annotation' LBRACE (annotationElement (COMMA annotationElement)*)? RBRACE SEMICOLON;

annotationElement   : documentation
                    | icon
                    | diagram
                    | placement
                    | ignore
                    ;