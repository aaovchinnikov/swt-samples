# ru.hse.todo.console
A pet project to write TODO-list application in OOP design with keeping in mind that:
1. Contract/interface goes first.
2. Loose coupling and high cohesion.
3. Open/close principle everywhere possible.
4. For now console-UI is main UI implementation.
5. UI will be changed later. Easy UI replacing mechanism needed.
6. For now in-memory storage used.
7. Storage will be changed later. Easy storage replacing mechanism needed.

Code is organized as Maven-project.
Requires at least Java 11 and Apache Maven 3.6.3 installed and configured.

## Environment
### Windows
Set user environment variables JAVA_HOME and PATH to point your Java 11+ and Maven directories.  
For example:  
JAVA_HOME = C:\Program Files\Java\jdk-14  
PATH = C:\Program Files\Java\jdk-14\bin;C:\apache-maven-3.6.3\bin  
It's not suggested to modify system environment variables, use user variables instead.

## Compilation
```
mvn clean compile
```

## Run app
This is Java 11 modularized application, so use Java-modules command-line options.

```
java --module-path "target/classes" --module ru.hse.todo.console/ru.hse.todo.console.Main
```
Or in short form

```
java -p "target/classes" -m ru.hse.todo.console/ru.hse.todo.console.Main
```

