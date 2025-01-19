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

### TAINTBENCH: (WIP)

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

#### CASE STUDY I

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

|                      APK                      | Expected | Actual | Status |   TP   |  FP   | Precision |  Recall  | F-score  |
|:---------------------------------------------:|:--------:|:------:|:------:|:------:|:-----:|:---------:|:--------:|:--------:| 
|                   backflash                   |    13    |   1    | FAILED |   1    |   0   |     1     |   0.08   |   0.14   |
|            beita_com_beita_contact            |    3     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                 cajino_baidu                  |    12    |   8    | FAILED |   8    |   0   |     1     |   0.67   |   0.80   |
|                   chat_hook                   |    12    |   6    | FAILED |   6    |   0   |     1     |   0.50   |   0.67   |
|                    chulia                     |    4     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|            death_ring_materialflow            |    1     |   9    | FAILED |   1    |   8   |   0.11    |   1.00   |   0.20   |
|                dsencrypt_samp                 |    1     |   1    | PASSED |   1    |   0   |     1     |    1     |    1     |
|                   exprespam                   |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                 fakeappstore                  |    3     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|             fakebank_android_samp             |    5     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                   fakedaum                    |    2     |   3    | FAILED |   2    |   1   |   0.67    |   1.00   |   0.80   |
|                   fakemart                    |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                   fakeplay                    |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                  faketaobao                   |    4     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                  godwon_samp                  |    6     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|            hummingbad_android_samp            |    2     |   2    | PASSED |   2    |   0   |     1     |    1     |    1     |
|                   jollyserv                   |    1     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|             overlay_android_samp              |    4     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|          overlaylocker2_android_samp          |    7     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                    phospy                     |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                  proxy_samp                   |    17    |   11   | FAILED |   11   |   0   |   1.00    |   0.65   |   0.79   |
|             remote_control_smack              |    17    |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                    repane                     |    1     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                    Roidsec                    |    6     |   1    | FAILED |   1    |   0   |   1.00    |   0.17   |   0.29   |
|                    samsapo                    |    4     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                    save_me                    |    25    |   6    | FAILED |   6    |   0   |   1.00    |   0.24   |   0.39   |
|                    scipiex                    |    3     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|             slocker_android_samp              |    5     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                  sms_google                   |    4     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|            sms_send_locker_qqmagic            |    6     |   2    | FAILED |   2    |   0   |   1.00    |   0.33   |   0.50   |
|           smssend_packageInstaller            |    5     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|            smssilience_fake_vertu             |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|  smsstealer_kysn_assassincreed_android_samp   |    5     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|       stels_flashplayer_android_update        |    3     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                     tetus                     |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|            the_interview_movieshow            |    1     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|              threatjapan_uracto               |    2     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|            vibleaker_android_samp             |    4     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|               xbot_android_samp               |    3     |   0    | FAILED |   0    |   0   |     0     |    0     |    0     |
|                   ~~TOTAL~~                   | ~~203~~  | ~~50~~ |   -    | ~~41~~ | ~~9~~ | ~~0.82~~  | ~~0.20~~ | ~~0.32~~ |
|                    TOTAL*                     |   186    |   50   |   -    |   41   |   9   |   0.82    |   0.22   |   0.35   |

##### Observation
- From the 37 failing tests, 28 of them reported zero flows.

#### CASE STUDY II

This case emulates **Experiment 3 - TB3** that configures:

>For each benchmark app, a list of sources and sinks defined in this app is used to 
configure all tools. Each tool analyzes each benchmark app with the associated list 
of sources and sinks 

The mentioned lists can be found in https://taintbench.github.io/taintbenchSuite/, and we have stored them by individual
files in `src/test/scala/br/unb/cic/android/specs`.

As a result, we got `38 failed and 1 passed of 39 test` and comparing to FLOWDROID we detect ~~the same amount of `TP(41)`
but less amount of `FP(9)` and about metric, we got a better `precision(0.82)`, the same `recall(0.22)` value 
and a slightly better `F-score(0.35)`.~~ 

- JSVFA metrics

| Expected | Actual | TP | FP | Precision | Recall | F-score |
|:--------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|   186    |   -    | -  | -  |     -     |   -    |    -    |

- FLOWDROID metrics from Paper https://doi.org/10.1007/s10664-021-10013-5

| Expected | Actual | TP | FP | Precision | Recall | F-score  |
|:--------:|:------:|:--:|:--:|:---------:|:------:|:--------:|
|   186    |   -    | -  | -  |     -     |   -    |    -    |

We can see the details from each test using JSVFA in the next table.

|                    APK                     | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:------------------------------------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:| 
|                 backflash                  |    13    |   20   | FAILED | 13 | 7  |   0.65    |  1.00  |  0.79   |
|          beita_com_beita_contact           |    3     |   14   | FAILED | 3  | 11 |   0.21    |  1.00  |  0.35   | 
|                cajino_baidu                |    12    |   95   | FAILED | 12 | 83 |   0.13    |  1.00  |  0.22   | 
|                 chat_hook                  |    12    |   15   | FAILED | 12 | 3  |   0.80    |  1.00  |  0.89   | 
|                   chulia                   |    4     |   0    | FAILED | 0  | 0  |     0     |   0    |    0    | 
|          death_ring_materialflow           |    1     |   45   | FAILED | 1  | 44 |   0.02    |  1.00  |  0.04   | 
|               dsencrypt_samp               |    1     |   2    | FAILED | 1  | 1  |   0.50    |  1.00  |  0.67   | 
|                 exprespam                  |    2     |   0    | FAILED | 0  | 0  |     0     |   0    |    0    | 
|                fakeappstore                |    3     |   0    | FAILED | 0  | 0  |     0     |   0    |    0    | 
|           fakebank_android_samp            |    5     |   6    | FAILED | -  | -  |     -     |   -    |    -    | 
|                  fakedaum                  |    2     |   10   | FAILED | -  | -  |     -     |   -    |    -    | 
|                  fakemart                  |    2     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|                  fakeplay                  |    2     |   15   | FAILED | -  | -  |     -     |   -    |    -    | 
|                 faketaobao                 |    4     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|                godwon_samp                 |    6     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|          hummingbad_android_samp           |    2     |   23   | FAILED | -  | -  |     -     |   -    |    -    | 
|                 jollyserv                  |    1     |   7    | FAILED | -  | -  |     -     |   -    |    -    | 
|            overlay_android_samp            |    4     |   8    | FAILED | -  | -  |     -     |   -    |    -    | 
|        overlaylocker2_android_samp         |    7     |   34   | FAILED | -  | -  |     -     |   -    |    -    | 
|                   phospy                   |    2     |   1    | FAILED | -  | -  |     -     |   -    |    -    | 
|                 proxy_samp                 |    17    |   20   | FAILED | -  | -  |     -     |   -    |    -    | 
|            remote_control_smack            |    17    |   5    | FAILED | -  | -  |     -     |   -    |    -    | 
|                   repane                   |    1     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|                  Roidsec                   |    6     |   1    | FAILED | -  | -  |     -     |   -    |    -    | 
|                  samsapo                   |    4     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|                  save_me                   |    25    |   15   | FAILED | -  | -  |     -     |   -    |    -    | 
|                  scipiex                   |    3     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|            slocker_android_samp            |    5     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|                 sms_google                 |    4     |   13   | FAILED | -  | -  |     -     |   -    |    -    | 
|          sms_send_locker_qqmagic           |    6     |   9    | FAILED | -  | -  |     -     |   -    |    -    | 
|          smssend_packageInstaller          |    5     |   46   | FAILED | -  | -  |     -     |   -    |    -    | 
|           smssilience_fake_vertu           |    2     |   2    | PASSED | -  | -  |     -     |   -    |    -    | 
| smsstealer_kysn_assassincreed_android_samp |    5     |   1    | FAILED | -  | -  |     -     |   -    |    -    | 
|      stels_flashplayer_android_update      |    3     |   19   | FAILED | -  | -  |     -     |   -    |    -    | 
|                   tetus                    |    2     |   9    | FAILED | -  | -  |     -     |   -    |    -    | 
|          the_interview_movieshow           |    1     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|             threatjapan_uracto             |    2     |   0    | FAILED | -  | -  |     -     |   -    |    -    | 
|           vibleaker_android_samp           |    4     |   5    | FAILED | -  | -  |     -     |   -    |    -    | 
|             xbot_android_samp              |    3     |   8    | FAILED | -  | -  |     -     |   -    |    -    | 
|                   TOTAL                    |   203    |  451   |   -    | -  | -  |     -     |   -    |    -    |
|                   TOTAL*                   |   186    |  451   |   -    | -  | -  |     -     |   -    |    -    |

##### Observation
- 

## Tasks
### WIP
- [ ] Integration of Taintbench.

### TO-DO
- [ ] Add set up project documentation.
- [ ] Integrate Securibench as a submodule.
- [ ] Fix bugs for Securibench in folders
  - [ ] Datastructure
  - [ ] Factory
  - [ ] Session
  - [ ] Strong Update
  - [ ] Aliasing


[//]: # (## License)