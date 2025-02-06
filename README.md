# SVFA (Sparse Value Flow Analysis) implementation based on Soot

This is a scala implementation of a framework that builds a sparse-value flow graph using Soot.

## Status

   * Experimental.

## Usage

   * Clone this repository or download a stable release.
   * Add a GitHub token to your **~/.gitconfig**.
     ```
     [github]
             token = TOKEN
     ```
   * Build this project using sbt (`sbt compile test`)
   * Publish the artifact as a JAR file in your m2 repository (`sbt publish`)
   * Create a dependency to the svfa-scala artifact in your maven project. 

```{xml}
<dependency>	
  <groupId>br.unb.cic</groupId>
  <artifactId>svfa-scala_2.12</artifactId>
  <version>3.0.1-SNAPSHOT</version>
 </dependency>
```

   * Implement a class that extends the `JSVFA class` (see some examples in the scala tests). you must provide implementations to the following methods.
      * `getEntryPoints()` to set up the "main" methods. This implementation must return a list of Soot methods.
      * `sootClassPath()` to set up the soot classpath. This implementation must return a string.
      * `analyze(unit)` to identify the type of a node  (source, sink, simple node) in the graph; given a statement (soot unit).

## Installation

- Install Scala Plugin in IntelliJ IDEA.
- Install Java 8 (Java JDK Path `/usr/lib/jvm/java-8-openjdk-amd64`).
```{bash}
  sudo apt install openjdk-8-jre-headless
  sudo apt install openjdk-8-jdk
```
- Clone the project:
```{bash}
    git clone https://github.com/rbonifacio/svfa-scala
```
- Add GitHub token in `~/.gitconfig`.
- IDE
  - Reload `sbt` .
  - Set Project's settings to work with Java 8.
  - Build Project.
  - Run test.


## Benchmark

This project integrates 2 well-known benchmarks.

### Securibench

This benchmark was integrated because it is also used in the [FlowDroid Project](https://github.com/secure-software-engineering/FlowDroid) 
and the tests cases are in `src/test/java/securibench`.

> failed: 0, passed: 71, ignored: 32 of 103 test (68.93%)

- **AliasingTest** - failed: 0, passed: 4, ignored: 2 of 6 test `(66.7%)`
  - [5]
  - [6]

- **ArraysTest** - failed: 0, passed: 5, ignored: 5 of 10 test `(50%)`
  - [2]
  - [5]
  - [8]
  - [9]
  - [10]

- **BasicTest** - failed: 0, passed: 38, ignored: 3 of 41 test `(92.68%)`; [40] does not exist
  - [36]
  - [38]
  - [42]

- **CollectionTest** - failed: 0, passed: 3, ignored: 12 of 15 test `(20%)`
  - [3]
  - [4]
  - [5]
  - [6]
  - [7]
  - [8]
  - [9]
  - [10]
  - [11] * There are any assertions here, it calls test [11b]
  - [11b]
  - [12]
  - [13]

- **DataStructureTest** - failed: 0, passed: 5, ignored: 1 of 6 test `(83.33%)`
  - [5]

- **FactoryTest** - failed: 0, passed: 2, ignored: 1 of 3 test `(66.67%)`
  - [3]

- **InterTest** - failed: 0, passed:11, ignored: 3 of 14 test `(78.57%)`
  - [6]
  - [11] - flaky
  - [12]

- **SessionTest** - failed: 0, passed: 0, ignored: 3 of 3 test `(0%)`
  - [1]
  - [2]
  - [3]

- **StrongUpdateTest** - failed: 0, passed: 3, ignored: 2 of 5 test `(60%)`
  - [3]
  - [5]

### TAINTBENCH:

[TAINTBENCH](https://taintbench.github.io/) is a benchmark that contains a [set of old malware Android Apks](https://github.com/TaintBench/TaintBench/releases/download/TaintBenchSuite/TaintBench.zip) , 
and it is introduced by [Paper: TaintBench: Automatic real-world malware benchmarking of Android taint analyses](https://doi.org/10.1007/s10664-021-10013-5), 
which in its result section presents six experiments to answer one of its RQ: *How effective are taint analysis tools on TaintBench compared to DroidBench*,
where FLOWDROID and AMANDROID as the chosen tools.

In the next sections, we will focus in **Experiment 2** and **Experiment 3** and use our tool (JSVFA) to reproduce them. 
After that, we will compare the already computed results for FLOWDROID to our results.

- The result for each APK tested using JSVFA are presented in a table that contains the following information.
  - **Expected:** The amount of taint flows presented by TAINTBENCH
  - **Actual:** The amount of taint flows detected by JSVFA
  - **Status:** If the test PASS OR FAIL
  - **TP:** True Positive
  - **FP:** False Positive
  - **Precision:** TP/(TP + FP)
  - **Recall:** TP/P
  - **F-score:** (2 x Precision x Recall)/(Precision + Recall)
- We have created a file `taintbench.properties` in `src/test/resources` to set the configurations

**Disclaimer**: Although TAINTBENCH contains 203 expected [taint flows](https://taintbench.github.io/taintbenchSuite/),
we have decided to use only 186 expected cases because the mentioned paper, uses as a reference, works with those amounts.

#### EXPERIMENT I

This case emulates **Experiment 2 - TB2** that states:

>All tools are configured with sources and sinks defined in benchmark suite.

The mentioned sources and sinks can be found in [TB_SourcesAndSinks](https://github.com/TaintBench/TaintBench/blob/master/TB_SourcesAndSinks.txt), 
and we have stored them in `src/test/scala/br/unb/cic/android/TaintBenchSpec.scala`.

As a result, we got `37 failed and 2 passed of 39 tests` and comparing to FLOWDROID we detected the same amount of `TP(41)`
but less amount of `FP(9)` and about metrics, we got a better `precision(0.82)`, the same `recall(0.22)` value
and a slightly better `F-score(0.35)`.

- JSVFA metrics

| Expected | Actual | TP | FP | Precision | Recall | F-score  |
|:--------:|:------:|:--:|:--:|:---------:|:------:|:--------:|
|   186    |   50   | 41 | 9  |   0.82    |  0.22  |   0.35   |

- FLOWDROID metrics from [Paper](https://doi.org/10.1007/s10664-021-10013-5)

| Expected | Actual | TP | FP | Precision | Recall | F-score  |
|:--------:|:------:|:--:|:--:|:---------:|:------:|:--------:|
|   186    |   55   | 41 | 14 |   0.75    |  0.22  |   0.34   |


We can see the details from each test using JSVFA in the next table.

To have detailed information about each group of tests run, [see here.](taintbench-experiment-I.md), 

##### Observation
- From the 37 failing tests, 28 of them reported zero flows.


#### EXPERIMENT II

This case emulates **Experiment 3 - TB3** that configures:

>For each benchmark app, a list of sources and sinks defined in this app is used to 
configure all tools. Each tool analyzes each benchmark app with the associated list 
of sources and sinks 

The mentioned lists can be found in https://taintbench.github.io/taintbenchSuite/, and we have stored them by individual
files in `src/test/scala/br/unb/cic/android/specs`.

As a result, we got `38 failed and 1 passed of 39 test` and comparing to FLOWDROID we detect a several better amount of `TP(135)`
but also a several amount of `FP(318)` and about metric, we got a significant less `precision(0.30)` due to the high amount of FP; however,
a good `recall(0.73)` value and a better `F-score(0.42)`.

- JSVFA metrics

| Expected | Actual | TP  | FP  | Precision | Recall | F-score |
|:--------:|:------:|:---:|:---:|:---------:|:------:|:-------:|
|   186    |  453   | 135 | 318 |   0.30    |  0.73  |  0.42   |


- FLOWDROID metrics from Paper https://doi.org/10.1007/s10664-021-10013-5

| Expected | Actual | TP | FP | Precision | Recall | F-score |
|:--------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|   186    |   57   | 43 | 14 |   0.75    |  0.23  |  0.35   |


To have detailed information about each group of tests run, [see here.](taintbench-experiment-II.md), 

##### Observation
- We got a big amount of FP.

## Tasks
### WIP
- [ ] Create Git Action flow.

### TO-DO
- [ ] Add set up project documentation.
- [ ] Integrate Securibench as a submodule.
- [ ] Compute metrics for Securibench results.
- [ ] Fix bugs for Securibench in folders
  - [ ] Datastructure
  - [ ] Factory
  - [ ] Session
  - [ ] Strong Update
  - [ ] Aliasing

### WIP
- [X] Integration of Taintbench.

[//]: # (## License)