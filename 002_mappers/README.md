# Mappers

## Description

In Java, mappers convert JPA entities (database models) into DTOs (data transfer objects) to separate layers, secure data, and customize API responses without exposing internal details. They ensure cleaner and more maintainable code.
It includes the following key topics:

OrikaMapper
- Uses bytecode generation for fast mapping.

MapStruct
- Compile-time code generation for type-safe, high-performance mapping.

ModelMapper
- Reflection-based, simple but slower.


## Quick Start

### Prerequisites

- Java 17+
- IDE: IntelliJ, Eclipse, or VS Code

### Run the Application

1. Dependencies used:
   - thymeleaf
   - spring-boot-starter-web
   - spring-boot-devtools
   - org.modelmapper:modelmapper
   - org.mapstruct:mapstruct + annotation processor.
   - ma.glasnost.orika:orika-core