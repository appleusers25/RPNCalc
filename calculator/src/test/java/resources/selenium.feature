Feature: Web calculate
Scenario Outline: calculate two values
Given a <input1>, <input2>
When click on <input-id>
Then output equal <result>

Examples:
|input1|input2|input-id|result|
|"5"|"1"|"gwt-uid-1"|"6"|
|"5"|"4"|"gwt-uid-2"|"20"|
|"5"|"2"|"gwt-uid-3"|"25"|
|"3"|"6"|"gwt-uid-4"|"6"|
|"7"|"5"|"gwt-uid-5"|"24"|
|"3"|"8"|"gwt-uid-6"|"121"|
|"9"|"2"|"gwt-uid-7"|"49"|