# What's this?

This project is a demo project for developing with spring boot and gradle.
For learning spring framework gradle and so on.

- language
  - java
  - groovy
  
- build tool
  - gradle
  
- framework
  - spring boot 
  - mybatis
  
- databases
  - mysql
  
- nosql
  - redis
  
- tools
  - lombok
  
- include
  - [algorithm](https://github.com/WillXuY/algorithm)

# Notes

Mark some problem I meet when I ogram.

## multi slf4j when run the [Test](src/test/java/com/willxu/template/build/GradleIncludeOtherProjectTest.java)

### cause

ch.qos.logback logback-classic implements the slf 4j

### solution

build.gradle exclude the logback dependency [configurations.all](build.gradle)

## include other flat project [algorithm](https://github.com/WillXuY/algorithm)

### solution

1. settings.gradle add [includeFlat](settings.gradle)
2. build.gradle add [implementation project](build.gradle)

### note

gradle 7 change grammar: implementation extend with compile.

## redis connection tools

- [AnotherRedisDesktopManager](https://github.com/qishibo/AnotherRedisDesktopManager)
