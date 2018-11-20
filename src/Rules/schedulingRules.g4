grammar schedulingRules;

// Class
createClass : 'CREATE CLASS {' (ENTER WHITESPACE class ENTER?)+ '}';
class : '('courseID','courseName','capacity','facilities','lecturerID')';
courseID : ALPHANUMERIC;
courseName : WORD;
lecturerID: NUMERIC;
lecturerName: WORD;

facilities : '['(facility)? ((',' facility)*)?']';
facility: WORD (WHITESPACE WORD)*;
capacity : NUMERIC;

// Lexer Rules
LOWERCASE : [a-z];
UPPERCASE : [A-Z];
DIGIT : [0-9];
NUMERIC : [0-9]+;
WORD : (LOWERCASE | UPPERCASE | '_')+;
ALPHANUMERIC    : (LOWERCASE | UPPERCASE | DIGIT | '_')+;
WHITESPACE      : (' ' | '\t')+;
ENTER           : ('\r'? '\n' | '\r')+;