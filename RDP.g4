

grammar RDP;
rdp  : declare   method*   main ;         // match keyword hello followed by an identifier

declare : DECLARE (from| list|variable)* ENDDECLARE;
DECLARE : 'DECLARE';
ENDDECLARE : 'END DECLARE'; 

method : METHOD NAME LEFT from* list* RIGHT  declare  main ENDMETHOD;
METHOD : 'METHOD';
ENDMETHOD : 'END METHOD';
NAME : [a-z][a-z]+;
BIGNAME : [A-Z];
NUMBER : [1-9];
LEFT : '(';
RIGHT : ')';

main : MAIN (read|write|writeln|get|push|pop|callmethod |set|fore|ife|truetable| NAME)* (returne|) ENDMAIN;
MAIN : 'MAIN';
ENDMAIN : 'END MAIN';

callmethod : 'method' NAME LEFT NAME* RIGHT (('->' (VAR|NAME))|);


WS : [ \t\r\n' ' ]+ -> skip ; // skip spaces, tabs, newlines
LINEBREAK : [\n];
linebreak : LINEBREAK;
/*
 * Típusok
 */
 list : 'list' NAME | 'list' NAME '=' from* ;
 
 
from :'from' NAME '=' (bincon |uncon |var |) |'from' NAME ;
variable : 'VAR' var;
var : (VAR '=' ('true' | 'false')) | VAR |;  

bincon :(  '(' (var | uncon | bincon) BINCON   (var | uncon | bincon) 
 ')')|;

uncon : (UNCON 
							(var | uncon | bincon)
		) |   ;
logicalinput : bincon | uncon | var ;
VAR :  [a-z]   ;           // match lower-case identifiers

UNCON : '-' ;

LEFTBRAQUET : '[' ->skip;

RIGHTTBRAQUET : ']' ->skip;


BINCON : '<' | '>' | '&' |'|' ;




/***********************Function */
read : 'read' LEFT (NAME|VAR) RIGHT;
write: 'write' ((LEFT (NAME|VAR) RIGHT )| (LEFT '"' (STRING) '"'RIGHT));
writeln:'writeln' LEFT RIGHT;
get : 'get' LEFT (NAME|VAR) RIGHT (('->' VAR)|);
push : 'push' LEFT NAME ',' NAME RIGHT;
pop : 'pop' LEFT NAME RIGHT (('->' NAME)|);
set : 'set' LEFT logicalinput RIGHT (('->' NAME)|);
returne : 'return' ('list'|'VAR'|'from')  (NAME|VAR);
ife:'if' 'then' VAR ('else' main|) 'end';
fore:'for'LEFT NAME 'in' NAME  RIGHT main 'end' ;
truetable:'truthtable' LEFT NAME RIGHT;
STRING :(VAR|BIGNAME|NUMBER) (VAR|BIGNAME|NUMBER|'_'|'-')*;
