grammar schedulingRules;

// Lexer Rules
LOWERCASE : [a-z];
UPPERCASE : [A-Z];
DIGIT : [0-9];
NUMERIC : [0-9]+;
WORD : (LOWERCASE | UPPERCASE | '_')+;
ALPHANUMERIC    : (LOWERCASE | UPPERCASE | DIGIT | '_')+;
WHITESPACE      : (' ' | '\t')+;
ENTER           : ('\r'? '\n' | '\r')+;