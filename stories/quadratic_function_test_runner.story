Sample story

Narrative:
In order to test quadratic function class
As a user
I want to solve multiple functions

Scenario:  Test funkcja kwadratowa z dwoma rozwiązaniami
Given Mam równanie kwadratowe
When podam a = 1.0, b = 7.0, c = 0.0
Then otrzymam dwa miejsca zerowe: 0.0 i -7.0

Scenario:  Test funkcja kwadratowa z jednym rozwiązaniem
Given Mam równanie kwadratowe
When podam a = 1, b = 2.0, c = 1.0
Then otrzymam jedno miejsce zerowe: -1.0

Scenario:  Test funkcja kwadratowa bez rozwiązań
Given Mam równanie kwadratowe
When podam a = 1, b = 1, c = 1
Then dostanę informację o błędzie