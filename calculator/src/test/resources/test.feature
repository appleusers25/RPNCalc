Feature: binary operation
Scenario Outline: adding two values
Given a string of <expr>
Then result equal <result>

Examples:
|expr|result|
|"1,2,3,+,-"|"-4"|
|"6,2,*,3,/"|"4"|
|"2,3,^,4,5,+,+"|"17"|
|"50,%,2,*"|"1"|
|"3,!,4,5,*,+"|"26"|
|"12,3,/,!"|"24"|
|"5,1,2,+,4,*,+,3,-"|"14"|