grammar Annotation;

import  Icon, Documentation, Utils, IgnoreEntry;

annotation  : 'annotation' LBRACE (annotationElement (COMMA annotationElement)*)? RBRACE SEMICOLON;

annotationElement   : documentation
                    | icon
                    | diagram
                    | ignore
                    ;