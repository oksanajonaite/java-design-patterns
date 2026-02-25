# Design Patterns in Java

A collection of classic Gang of Four (GoF) design patterns implemented in Java with practical, real-world examples.

## Patterns Implemented

### Creational
| Pattern | Example |
|---------|---------|
| **Singleton** | Single `Printer` instance shared across the application |

### Structural
| Pattern | Example |
|---------|---------|
| **Facade** | `HomeCinemaFacade` simplifies controlling TV, sound system and DVD player |
| **Proxy** | Doctor appointment proxy with symptom filtering; report access control by user role |

### Behavioral
| Pattern | Example |
|---------|---------|
| **Observer** | News agency notifying subscribers; weather station updating displays |
| **Strategy** | Interchangeable travel modes (bike, bus, plane); training plans (HIIT, yoga, walking) |

## Project Structure

```
src/main/java/
├── singleton/                    # Singleton pattern
├── fasade/                       # Facade pattern — Home Cinema
├── proxy_doctor/                 # Proxy pattern — Doctor appointments
├── proxy_reporting/              # Proxy pattern — Role-based report access
├── observer_news_agency/         # Observer pattern — News agency
├── observer_weather_station/     # Observer pattern — Weather station
├── strategy_travel/              # Strategy pattern — Travel modes
└── strategy_training/            # Strategy pattern — Training plans
```

## Tech Stack

- Java 17
- Maven

## Running the Examples

Each package contains its own `Main.java` entry point. Run any of them directly from IntelliJ IDEA or via Maven:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="singleton.Main"
```

Replace `singleton.Main` with the desired package and class.
