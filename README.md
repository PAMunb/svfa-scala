# SVFA (Sparse Value Flow Analysis) implementation based on Soot

This is a scala implementation of a framework that builds a sparse-value flow graph using Soot.

## Status

   * experimental

## Usage

   * clone this repository or download an stable release
   * you will need to add a github token to your **~/.gitconfig**.
     ```
     [github]
             token = TOKEN
     ```
   * build this project using sbt (`sbt compile test`)
   * publish the artifact as a JAR file in your m2 repository (`sbt publish`)
   * create a dependency to the svfa-scala artifact in your maven project. 

```{xml}
<dependency>	
  <groupId>br.unb.cic</groupId>
  <artifactId>svfa-scala_2.12</artifactId>
  <version>0.0.2-SNAPSHOT</version>
 </dependency>
```

   * implement a class that extends the `JSVFA class` (see some examples in the scala tests). you must provide implementations to the following methods
      * `getEntryPoints()` to set up the "main" methods. This implementation must return a list of Soot methods
      * `sootClassPath()` to set up the soot classpath. This implementation must return a string
      * `analyze(unit)` to identify the type of a node  (source, sink, simple node) in the graph; given a statement (soot unit)


## Dependencies

This project use some of the [FlowDroid](https://github.com/secure-software-engineering/FlowDroid) test cases. The FlowDroid test cases in `src/test/java/securibench` are under [LGPL-2.1](https://github.com/secure-software-engineering/FlowDroid/blob/develop/LICENSE) license.


## Installation

- Install Scala Plugin in IntelliJ IDEA
- Install Java 8 (Java JDK Path `/usr/lib/jvm/java-8-openjdk-amd64`)
```{bash}
  sudo apt install openjdk-8-jre-headless
  sudo apt install openjdk-8-jdk
```
- Clone the project:
```{bash}
    git clone https://github.com/rbonifacio/svfa-scala
```
- Add dependency: 
     - Download [servlet-api-2.5.jar](https://repo1.maven.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar) and move to `.m2/repository/javax/servlet/servlet-api/2.5/`
- Add GitHub token in `~/.gitconfig`
- IDE
  - Reload `sbt` 
  - Set Project's settings to work with Java 8
  - Build Project
  - Run test


### Flowdroid Benchmark

###### failed: 33, passed: 71, ignored: 0 of 104 test (Original Benchmark)

> failed: 0, passed: 64, ignored: 40 of 104 test (61.53%)

- **AliasingTest** - failed: 0, passed: 5, ignored: 1 of 6 test `(83.33%)`
  - [5]

- **ArraysTest** - failed: 0, passed: 1, ignored: 9 of 10 test `(10%)`
  - [1]
  - [2]
  - [3]
  - [4]
  - [6]
  - [7]
  - [8]
  - [9]
  - [10]

- **BasicTest** - failed: 0, passed: 38, ignored: 4 of 42 test `(90.48%)`
  - [17]
  - [36]
  - [38]
  - [42]

- **CollectionTest** - failed: 0, passed: 1, ignored: 14 of 15 test `(6.67%)`
  - [2]
  - [3]
  - [4]
  - [5]
  - [6]
  - [7]
  - [8]
  - [9]
  - [10]
  - [11]
  - [11b]
  - [12]
  - [13]
  - [14]

- **DataStructureTest** - failed: 0, passed: 5, ignored: 1 of 6 test `(83.33%)`
  - [2]

- **FactoryTest** - failed: 0, passed: 2, ignored: 1 of 3 test `(6.25%)`
  - [3]

- **InterTest** - failed: 0, passed:7, ignored: 7 of 14 test `(50%)`
  - [4]
  - [5]
  - [6]
  - [7]
  - [11] - flaky
  - [12]

- **SessionTest** - failed: 0, passed: 0, ignored: 3 of 3 test `(66.660%)`
  - [1]
  - [2]
  - [3]

- **StrongUpdateTest** - failed: 0, passed: 4, ignored: 1 of 5 test `(80%)`
  - [4]


