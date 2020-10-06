grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      # SingleCommand
	| '{' cs+=command* '}'           # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	         # Assignment
	| 'output' e=expr ';'            # Output
    | 'while' '('c=condition')' p=program  # WhileLoop
	| 'for' '(' com=command c=condition ';' e=expr ')' p=program	#ForLoop
	| 'if' '('c=condition')' p=program  #IfStatement
	| x=ID '[' e1=expr ']' '=' e2=expr ';' # ListAssignment
	| e=expr ';'					# SingleExpression
	;	

expr	: e1=expr symb=ADDSUB e2=expr # AddSubtion
	| c=FLOAT     	      # Constant
	| x=ID		      # Variable
	| e1=expr symb=MULTIDIV e2=expr # MultiDivtion
	| x=ID '++'	      				# PlusPlus
	| x=ID '[' e=expr ']'  # ListVariable
	| '(' e=expr ')'      # Parenthesis
	;

condition : e1=expr '!=' e2=expr # Unequal
	  | e1=expr '==' e2=expr     # Equal
	  | e1=expr '<' e2=expr     # LessThan
	  | e1=expr '>' e2=expr     # GreaterThan
	  | e1=expr '<=' e2=expr     # LessThanOrEqual
	  | e1=expr '>=' e2=expr     # GreaterThanOrEqual
	  | c1=condition '||' c2=condition    # Or
	  | c1=condition '&&' c2=condition     # And
	  | '!' c=condition					# Not
	  ;  

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : '-'? NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
ADDSUB     : ('+' | '-');
MULTIDIV   : ('/' | '*');
