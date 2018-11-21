grammar schedulingRules;

// Class
createClass : 'CREATE CLASS {' (ENTER WHITESPACE class ENTER?)+ '}';
class : '('courseID','courseName','capacity','facilities','lecturerID')';
courseID : ALPHANUMERIC;
courseName : WORD;
lecturerID: NUMERIC;
lecturerName: WORD;

// Lecturer
createLecturer : 'CREATE LECTURER {' (ENTER WHITESPACE lecturer ENTER?)+ '}';
lecturer : '('lecturerID','lecturerName','availability','preference')';
availability : '[' (daytime)? ((',' daytime)*)?  ']';
preference : '[' (daytime)? ((',' daytime)*)?  ']';
daytime : day WHITESPACE times;
day : WORD;
times : '(' (time)? ((',' time)*)? ')';
time : from '-' to;
from : NUMERIC | DIGIT;
to : NUMERIC | DIGIT;

// Room
createRoom : 'CREATE ROOM {' (ENTER WHITESPACE room ENTER?)+ '}';
room : '('roomID','capacity','facilities')';
roomID : ALPHANUMERIC;
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