grammar Simple;

parse: START POINTS
	program 
	END SEMICOLON EOF;

program: sentence*;

sentence: var_assign | ifelse | while_ | for_ |show;

var_assign: (INT | STRING | BOOLEAN)? ID ASSIGN? expressions? SEMICOLON;
	
ifelse: IF conditions (ELSE IF conditions)* (ELSE program)? ;

conditions: expressions POINTS
	program;


while_: WHILE expressions POINTS
	program;

for_: FOR expressions POINTS
	program; 	

show: SHOW PAR_OPEN expressions PAR_CLOSE SEMICOLON;	

expressions: expressions op = (PLUS | MINUS) expressions
	| expressions op = (MUL | DIV) expressions
	| expressions op = (GT | LT | GEQ | LEQ) expressions
	| expressions op = (EQ | NEQ | ASSIGN) expressions
	| (SIN | TAN | COS | SQRT) expressions
	| expressions (AND | OR | NOT) expressions
	| atom;
	
atom: PAR_OPEN expressions PAR_CLOSE
	| NUMBER
	| (TRUE | FALSE)
	| VAR
	| COMMA
	| ID;



START: 'start';
END: 'end';
SHOW: 'show';

// tipos de datos
STRING: 'str';
INT: 'int';
BOOLEAN: 'bool';

//condicional
IF: 'if';
ELSE: 'else';

//repetitivas
FOR: 'for';
WHILE: 'while';

//operadores basicos
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

//funciones
SIN: 'sin';
TAN: 'tan';
COS: 'cos';
SQRT: 'sqrt';

//operadores logicos
AND: 'and';
OR: 'or'; 
NOT: 'not';
TRUE: 'true';
FALSE: 'false';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

PAR_OPEN: '(';
PAR_CLOSE: ')';
SEMICOLON: ';';
POINTS: ':';
COMMA: ',';

ID: [a-zA-Z_] [a-zA-Z_0-9]* ;
NUMBER: [0-9]+;
VAR: '"' (~["\r\n] | '""')* '"';

WS
:
	[ \t\r\n]+ -> skip
;