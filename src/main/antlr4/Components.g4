grammar Components;

import Utils;

components  : LCBRACE (component (COMMA component)*)? RCBRACE;

component   : STARTCOMPONENT className COMMA name COMMA comment COMMA isProtected COMMA isFinal COMMA isFlow COMMA isStream COMMA isReplaceable COMMA variability COMMA innerOuter COMMA inputOutput COMMA dimensions ENDCOMPONENT;

className   : 'className' EQUALS val=S_STRING;
name        : 'name' EQUALS val=S_STRING;
comment     : 'comment' EQUALS val=S_STRING;
isProtected     : 'isProtected' EQUALS val=bool;
isFinal         : 'isFinal' EQUALS val=bool;
isFlow          : 'isFlow' EQUALS val=bool;
isStream        : 'isStream' EQUALS val=bool;
isReplaceable   : 'isReplaceable' EQUALS val=bool;
variability     : 'variability' EQUALS val=S_STRING;
innerOuter      : 'innerOuter'  EQUALS val=S_STRING;
inputOutput     : 'inputOutput' EQUALS val=S_STRING;
dimensions      : 'dimensions'  EQUALS val=list;

list    : LCBRACE (string (COMMA string)*)? RCBRACE;

string : S_STRING;

STARTCOMPONENT : 'record OpenModelica.Scripting.getComponentsTest.Component';

ENDCOMPONENT : 'end OpenModelica.Scripting.getComponentsTest.Component' SEMICOLON;