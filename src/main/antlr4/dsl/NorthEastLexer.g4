lexer grammar NorthEastLexer;

INT         :   'int'   ;   //1
FLOAT       :   'float' ;   //2
BEGIN       :   'begin' ;   //3
END         :   'end'   ;   //4
To          :   'to'    ;   //5
NEXT        :   'next'  ;   //6
REAL        :   'real'  ;   //7
BOOLEAN     :   'bool'  ;   //8

NOTEQUAL    :   '!='    ;   //46
AND         :   '&&'    ;   //47
OR          :   '||'    ;   //48
POW         :   '^'     ;   //49
ID          : [a-zA-Z]+ ;   //50
STRING
 : '{{'.+?'}}'
 ;
NUM         :   ([0-9]+)?;
PRINT       : '整两句';

WS
:   ' ' -> channel(HIDDEN)  //50
;