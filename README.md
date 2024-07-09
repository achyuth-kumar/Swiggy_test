# Swiggy_test
Swiggy ASDE - Round 1 coding test

```markdown
# Magical Arena

## Description
This project implements a simple magical arena game where two players fight until one of them dies. Each player has health, strength, and attack attributes. Players attack in turns, and the damage dealt is calculated based on dice rolls.

## How to Run

1. **Clone the repository**:
    ```bash
    git clone <repository_url>
    ```

2. **Navigate to the project directory**:
    ```bash
    cd magical-arena
    ```

3. **Compile the code**:
    ```bash
    javac -d bin src/*.java
    ```

4. **Run the code**:
    ```bash
    java -cp bin Main
    ```

## Running Tests

1. **Compile the test classes**:
    ```bash
    javac -d bin -cp path/to/junit-5.7.0.jar src/*.java test/*.java
    ```

2. **Run the tests**:
    ```bash
    java -cp bin:path/to/junit-5.7.0.jar org.junit.runner.JUnitCore PlayerTest DiceTest ArenaTest
    ```

## Project Structure
- `src/`: Contains the source code files.
- `test/`: Contains the test code files.
- `bin/`: Directory where compiled classes are stored.

## Commit History
This project has frequent commits with clear and relevant messages to ensure a clean commit history.
```

This setup provides a clear structure for the solution, ensuring readability, testability, and maintainability.
