/*
这个grammar的名称为ArrayInt ，必须与文件名相同
*/
grammar ArrayInt;

/* 一条rule  符号（token）分组*/
init : '{' value (',' value)* '}' ;
/* 一条rule*/
value : init
         | INT
         ;
/* lexer 词法分析规则*/
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;