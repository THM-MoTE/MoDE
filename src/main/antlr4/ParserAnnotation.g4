parser grammar ParserAnnotation;

import ParserIcon;

options { tokenVocab=LexerAnnotation; } // use tokens from LexerAnnotation.g4

annotation  : iconAnnotation;