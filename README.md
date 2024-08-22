

# JUnit4 and JUnit5 Testing

## Overview

This repository contains examples and best practices for writing unit tests using JUnit4 and JUnit5. Whether you're maintaining legacy code or working on new projects, this guide will help you understand the differences, similarities, and powerful features of both versions of JUnit.

## Table of Contents

- [Introduction](#introduction)
- [Setup](#setup)
- [JUnit4 vs. JUnit5](#junit4-vs-junit5)
- [Writing Tests](#writing-tests)
  - [JUnit4 Examples](#junit4-examples)
  - [JUnit5 Examples](#junit5-examples)
- [Best Practices](#best-practices)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Introduction

JUnit is one of the most widely used testing frameworks for Java. While JUnit4 has been the go-to for many years, JUnit5 introduces a more powerful and flexible framework. This repository provides practical examples and guidelines for writing tests in both JUnit4 and JUnit5.

## Setup

### JUnit4

To use JUnit4 in your project, add the following dependency to your `pom.xml` (for Maven):

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

Or for Gradle:

```groovy
testImplementation 'junit:junit:4.13.2'
```

### JUnit5

For JUnit5, add the following dependencies to your `pom.xml` (for Maven):

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

Or for Gradle:

```groovy
testImplementation 'org.junit.jupiter:junit-jupiter-api:5.10.0'
testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.10.0'
```

## JUnit4 vs. JUnit5

### Key Differences:
- **Annotations**: JUnit5 uses `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, and `@AfterAll` instead of JUnit4's `@Before` and `@After`.
- **Assertions**: JUnit5 offers more powerful and flexible assertions, allowing for grouping, lazy evaluation, and more.
- **Parameterized Tests**: JUnit5 has built-in support for parameterized tests with more options compared to JUnit4.
- **Extensions**: JUnit5 replaces JUnit4's rules and runners with a new extension model.

## Writing Tests

### JUnit4 Examples

```java
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }
}
```

### JUnit5 Examples

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }
}
```

## Best Practices

- **Use Descriptive Test Names**: Name your tests to describe what they validate.
- **Isolate Tests**: Tests should not depend on each other.
- **Use Assertions Wisely**: Ensure that your assertions are meaningful and cover edge cases.
- **Leverage Parameterized Tests**: Use parameterized tests for repetitive scenarios with different inputs.
- **Keep Tests Clean**: Refactor your tests to keep them clean and easy to read.

## Running Tests

### Maven

Run your tests using Maven:

```bash
mvn test
```

### Gradle

Run your tests using Gradle:

```bash
gradle test
```

### IDE Integration

Both JUnit4 and JUnit5 are well supported by most Java IDEs like IntelliJ IDEA, Eclipse, and NetBeans. You can run tests directly from the IDE.



