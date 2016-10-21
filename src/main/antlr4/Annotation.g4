grammar Annotation;

import  Icon, Documentation, Placement, Utils, IgnoreEntry;

annotation  : 'annotation' LBRACE (annotationElement (COMMA annotationElement)*)? RBRACE SEMICOLON;

annotationElement   : documentation
                    | icon
                    | diagram
                    | placement
                    | ignore
                    ;