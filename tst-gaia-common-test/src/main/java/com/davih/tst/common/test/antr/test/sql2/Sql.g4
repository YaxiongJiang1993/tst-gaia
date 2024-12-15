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
    : '*'  // 允许 * 选择所有列
    | column (',' column)*  // 允许多个列
    ;

column
    : (ID '.')? ID (AS ID)?  // 列名或列别名
    | functionCall  // 支持函数调用
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
    | ID 'OVER' '(' partitionBy? orderBy? ')'
    ;

partitionBy
    : 'PARTITION BY' column (',' column)*
    ;

orderBy
    : 'ORDER BY' column (',' column)*
    ;

SELECT : 'SELECT';
FROM   : 'FROM';
WHERE  : 'WHERE';
LIMIT  : 'LIMIT';
AS     : 'AS';
AND    : 'AND';
UNION  : 'UNION';
OVER   : 'OVER';
PARTITION : 'PARTITION';
BY     : 'BY';
ORDER  : 'ORDER';

ID     : [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '\'' ( ~('\''|'\n') )* '\'';  // 处理带单引号的字符串
INT    : [0-9]+;

WS     : [ \t\r\n]+ -> skip;
