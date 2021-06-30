# I - Include Another Flat Project: [algorithm](https://github.com/WillXuY/algorithm)

## i. Solution

1. settings.gradle add [includeFlat](../../settings.gradle)
2. build.gradle add [implementation project](../../build.gradle)

## ii. ✦✧✩✫✬ Note

gradle 7 change grammar: implementation extend with compile.

# II - Multi Slf4j When Run The [Test](../../src/test/java/org/willxu/template/build/GradleIncludeOtherProjectTest.java).

## i. Cause

ch.qos.logback logback-classic implements the slf 4j

## ii. Solution

build.gradle exclude the logback dependency [configurations.all](../../build.gradle)
