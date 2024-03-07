grammar Hello;
expression: phrase+;
phrase: greetings | goodbye;
greetings : 'hello' ID+;
goodbye : 'bye' ID+;
ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;
