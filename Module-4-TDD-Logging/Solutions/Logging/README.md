# SLF4J and Logback Logging

## Concept Explanation
Logging is a critical practice in software development that records application behavior for runtime debugging, audit tracking, and system health checks. 

This project integrates:
1. **SLF4J (Simple Logging Facade for Java)**: Acts as a standardized interface abstraction layer for logging APIs.
2. **Logback**: The underlying concrete logging implementation that formats, outputs, and writes the log entries.

Logging levels demonstrated in `OrderProcessor`:
- **`TRACE`**: Granular debug messages (e.g. method entry/exit).
- **`DEBUG`**: Diagnostic information useful during development.
- **`INFO`**: High-level execution progress (e.g. system starting, transactional success).
- **`WARN`**: Minor anomalies or deprecations that do not stop execution (e.g. negative prices).
- **`ERROR`**: Critical failures that interrupt operations (e.g. null inputs).

---

## Configuration and Appenders
The `logback.xml` file configures two appenders:
- **`CONSOLE`**: Standard output console printing.
- **`FILE`**: Writes logging events to a local file (`logs/application.log`).

---

## Run Commands
Run tests and generate log outputs:
```bash
mvn test
```
After executing, verify output files inside the `logs/` directory.
