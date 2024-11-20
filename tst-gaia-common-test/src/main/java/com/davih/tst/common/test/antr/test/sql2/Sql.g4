grammar Sql;

root
    : query EOF
    ;

query
    : select (UNION select)*
    ;

select
    : SELECT selectElements FROM fromClause whereClause? limitClause?
    ;

selectElements
    : '*'
    | column (',' column)*
    ;

column
    : (ID '.')? ID (AS ID)?
    | functionCall
    ;

fromClause
    : table (',' table)* | '(' query ')'
    ;

table
    : (ID '.')? ID
    ;

whereClause
    : WHERE expression
    ;

expression
    : ID comparisonOperator value
    | expression AND expression
    ;

comparisonOperator
    : '=' | '<>' | '<' | '>' | '<=' | '>='
    ;

value
    : INT | STRING
    ;

limitClause
    : LIMIT INT
    ;

functionCall
    : ID '(' (column (',' column)*)? ')'
    | ID 'OVER' '(' (column (',' column)*)? ')'
    ;

SELECT : 'SELECT';
FROM   : 'FROM';
WHERE  : 'WHERE';
LIMIT  : 'LIMIT';
AS     : 'AS';
AND    : 'AND';
UNION  : 'UNION';

ID     : [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '\'' ( ~('\''|'\n') )* '\'' ;  // 处理带单引号的字符串
INT    : [0-9]+;

WS     : [ \t\r\n]+ -> skip;
