grammar MySql;

root
    : sqlStatement EOF
    ;

sqlStatement
    : selectStatement SEMICOLON?
    ;

selectStatement
    : SELECT selectElements FROM tableName whereClause?
    ;

selectElements
    : STAR
    | columnName (COMMA columnName)*
    ;

columnName
    : ID
    ;

tableName
    : ID
    ;

whereClause
    : WHERE condition
    ;

condition
    : condition AND condition       # AndCondition
    | condition OR condition        # OrCondition
    | LPAREN condition RPAREN       # ParenthesizedCondition
    | columnName comparisonOperator value # SimpleCondition
    ;

comparisonOperator
    : EQ | NEQ | LT | GT | LEQ | GEQ
    ;

value
    : INT | STRING
    ;

// Keywords (case-insensitive)
SELECT : [sS][eE][lL][eE][cC][tT];
FROM   : [fF][rR][oO][mM];
WHERE  : [wW][hH][eE][rR][eE];
AND    : [aA][nN][dD];
OR     : [oO][rR];

// Symbols
STAR    : '*';
COMMA   : ',';
LPAREN  : '(';
RPAREN  : ')';
EQ      : '=';
NEQ     : '<>';
LT      : '<';
GT      : '>';
LEQ     : '<=';
GEQ     : '>=';

// Identifiers and literals
ID      : [a-zA-Z_][a-zA-Z_0-9]*;
STRING  : '\'' .*? '\'';
INT     : [0-9]+;

// Miscellaneous
SEMICOLON : ';';
WS        : [ \t\r\n]+ -> skip;
