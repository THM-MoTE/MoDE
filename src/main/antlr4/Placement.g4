grammar Placement;
import Utils;

placement   : 'Placement' LBRACE (placementContent (COMMA placementContent)*)? RBRACE;

placementContent    : visible
                    | diagramTransformation
                    | iconTransformation
                    ;

diagramTransformation   : 'transformation' val=transformation;
iconTransformation      : 'iconTransformation' val=transformation;

transformation          : LBRACE (transformationContent (COMMA transformationContent)*)? RBRACE;
transformationContent   : origin
                        | extent
                        | rotation
                        ;