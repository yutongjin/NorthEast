parser grammar NorthEastParser;

options {   tokenVocab = NorthEastLexer; }

spec : statements EOF
;
statements
: (statement)+
;

statement : printstatement;

printstatement: PRINT STRING;
vartype  : INT | FLOAT
        ;
