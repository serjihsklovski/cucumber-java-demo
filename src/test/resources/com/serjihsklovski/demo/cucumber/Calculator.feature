Feature: our Calculator parses expressions and execute them

  Scenario Outline: arithmetic expressions execution
    Given we have a code line "<code-line>"
    When we let our Calculator to execute the line
    Then we got the output "<output>"

    Examples:
      | code-line    | output |
      | 2 * 2        | 4      |
      | 3 + 5 * 6    | 33     |
      | (3 + 5) * 6  | 48     |
      | 3 + 5 \| * 6 | 48     |
