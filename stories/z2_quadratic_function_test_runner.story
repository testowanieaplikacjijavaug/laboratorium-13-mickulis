Sample story

Narrative:
In order to test quadratic function class
As a user
I want to solve multiple functions

Scenario:  Test funkcja kwadratowa z dwoma rozwiązaniami
Given Mam równanie kwadratowe
When podam a = <a>, b = <b>, c = <c>
Then otrzymam dwa miejsca zerowe: <x1> i <x2>

Examples:
|a|b|c|x1|x2|
|1|7|0|-7|0|
|2|5|2|-2|-0.5|
|0.5|0|-2|-2|2|

Scenario:  Test funkcja kwadratowa z jednym rozwiązaniem
Given Mam równanie kwadratowe
When podam a = <a>, b = <b>, c = <c>
Then otrzymam jedno miejsce zerowe: <x1>
Examples:
|a|b|c|x1|
|0|1|0|0|
|0|1|4|-4|
|0.5|0|0|0|

Scenario:  Test funkcja kwadratowa bez rozwiązań
Given Mam równanie kwadratowe
When podam a = <a>, b = <b>, c = <c>
Then dostanę informację o błędzie
Examples:
|a|b|c|
|0|0|0|
|0|0|2|
|1|0|1|
|0.5|0|2|