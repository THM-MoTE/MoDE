grammar CoordinateSystem;

import Utils;


coordinateSystem    : 'coordinateSystem' LBRACE (data+=coordinateSystem_data (COMMA data+=coordinateSystem_data)*)? RBRACE;

coordinateSystem_data   : extent
                        | preserveAspectRatio
                        | initialScale
                        | grid
                        ;

preserveAspectRatio : 'preserveAspectRatio' EQUALS val=bool;

initialScale        : 'initialScale' EQUALS val=NUMBER;

grid                : 'grid' EQUALS val=point;