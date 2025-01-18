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

### Taintbench: (WIP) 

*source*: https://taintbench.github.io/taintbenchSuite/

#### CASE I
[Taintbench](https://github.com/TaintBench/TaintBench/releases/download/TaintBenchSuite/TaintBench.zip) contains a set o Android Apks that are old malware apps.
We have created a file `taintbench.properties` in `src/test/resources` to set the configurations.

> failed: 38, passed: 1, ignored: 0 of 39 test (2.56%)

|                    APK                     | Expected | Actual | Status | Precision | Recall | F-score |
|:------------------------------------------:|:--------:|:------:|:------:|:---------:|:------:|:-------:| 
|                 backflash                  |    13    |   20   | FAILED |     -     |   -    |    -    | 
|          beita_com_beita_contact           |    3     |   14   | FAILED |     -     |   -    |    -    | 
|                cajino_baidu                |    12    |   95   | FAILED |     -     |   -    |    -    | 
|                 chat_hook                  |    12    |   18   | FAILED |     -     |   -    |    -    | 
|                   chulia                   |    4     |   0    | FAILED |     -     |   -    |    -    | 
|          death_ring_materialflow           |    1     |   45   | FAILED |     -     |   -    |    -    | 
|               dsencrypt_samp               |    1     |   2    | FAILED |     -     |   -    |    -    | 
|                 exprespam                  |    2     |   0    | FAILED |     -     |   -    |    -    | 
|                fakeappstore                |    3     |   0    | FAILED |     -     |   -    |    -    | 
|           fakebank_android_samp            |    5     |   6    | FAILED |     -     |   -    |    -    | 
|                  fakedaum                  |    2     |   10   | FAILED |     -     |   -    |    -    | 
|                  fakemart                  |    2     |   0    | FAILED |     -     |   -    |    -    | 
|                  fakeplay                  |    2     |   15   | FAILED |     -     |   -    |    -    | 
|                 faketaobao                 |    4     |   0    | FAILED |     -     |   -    |    -    | 
|                godwon_samp                 |    6     |   0    | FAILED |     -     |   -    |    -    | 
|          hummingbad_android_samp           |    2     |   23   | FAILED |     -     |   -    |    -    | 
|                 jollyserv                  |    1     |   7    | FAILED |     -     |   -    |    -    | 
|            overlay_android_samp            |    4     |   8    | FAILED |     -     |   -    |    -    | 
|        overlaylocker2_android_samp         |    7     |   34   | FAILED |     -     |   -    |    -    | 
|                   phospy                   |    2     |   1    | FAILED |     -     |   -    |    -    | 
|                 proxy_samp                 |    17    |   20   | FAILED |     -     |   -    |    -    | 
|            remote_control_smack            |    17    |   5    | FAILED |     -     |   -    |    -    | 
|                   repane                   |    1     |   0    | FAILED |     -     |   -    |    -    | 
|                  Roidsec                   |    6     |   1    | FAILED |     -     |   -    |    -    | 
|                  samsapo                   |    4     |   0    | FAILED |     -     |   -    |    -    | 
|                  save_me                   |    25    |   15   | FAILED |     -     |   -    |    -    | 
|                  scipiex                   |    3     |   0    | FAILED |     -     |   -    |    -    | 
|            slocker_android_samp            |    5     |   0    | FAILED |     -     |   -    |    -    | 
|                 sms_google                 |    4     |   13   | FAILED |     -     |   -    |    -    | 
|          sms_send_locker_qqmagic           |    6     |   9    | FAILED |     -     |   -    |    -    | 
|          smssend_packageInstaller          |    5     |   46   | FAILED |     -     |   -    |    -    | 
|           smssilience_fake_vertu           |    2     |   2    | PASSED |     -     |   -    |    -    | 
| smsstealer_kysn_assassincreed_android_samp |    5     |   1    | FAILED |     -     |   -    |    -    | 
|      stels_flashplayer_android_update      |    3     |   19   | FAILED |     -     |   -    |    -    | 
|                   tetus                    |    2     |   9    | FAILED |     -     |   -    |    -    | 
|          the_interview_movieshow           |    1     |   0    | FAILED |     -     |   -    |    -    | 
|             threatjapan_uracto             |    2     |   0    | FAILED |     -     |   -    |    -    | 
|           vibleaker_android_samp           |    4     |   5    | FAILED |     -     |   -    |    -    | 
|             xbot_android_samp              |    3     |   8    | FAILED |     -     |   -    |    -    | 
|                   TOTAL                    |   203    |  451   |   -    |   0.45    |   1    |  0.62   |
|                   TOTAL*                   |   186    |  451   |   -    |   0.41    |   1    |  0.58   |

#### CASE II
[Taintbench](https://github.com/TaintBench/TaintBench/releases/download/TaintBenchSuite/TaintBench.zip) contains a set o Android Apks that are old malware apps.
We have created a file `taintbench.properties` in `src/test/resources` to set the configurations.

> failed: 38, passed: 1, ignored: 0 of 39 test (2.56%)

|                    APK                     | Expected | Actual | Status | Precision |  Recall  |  F-score  |
|:------------------------------------------:|:--------:|:------:|:------:|:---------:|:--------:|:---------:| 
|                 backflash                  |    13    |   1    | FAILED |     1     |   0.08   |   0.14    |
|          beita_com_beita_contact           |    3     |   0    | FAILED |     -     |    -     |     -     |
|                cajino_baidu                |    12    |   8    | FAILED |     1     |   0.67   |   0.80    |
|                 chat_hook                  |    12    |   0    | FAILED |     -     |    -     |     -     |
|                   chulia                   |    4     |   0    | FAILED |     -     |    -     |     -     |
|          death_ring_materialflow           |    1     |   0    | FAILED |     -     |    -     |     -     |
|               dsencrypt_samp               |    1     |   0    | FAILED |     -     |    -     |     -     |
|                 exprespam                  |    2     |   0    | FAILED |     -     |    -     |     -     |
|                fakeappstore                |    3     |   0    | FAILED |     -     |    -     |     -     |
|           fakebank_android_samp            |    5     |   0    | FAILED |     -     |    -     |     -     |
|                  fakedaum                  |    2     |   0    | FAILED |     -     |    -     |     -     |
|                  fakemart                  |    2     |   0    | FAILED |     -     |    -     |     -     |
|                  fakeplay                  |    2     |   0    | FAILED |     -     |    -     |     -     |
|                 faketaobao                 |    4     |   0    | FAILED |     -     |    -     |     -     |
|                godwon_samp                 |    6     |   0    | FAILED |     -     |    -     |     -     |
|          hummingbad_android_samp           |    2     |   0    | FAILED |     -     |    -     |     -     |
|                 jollyserv                  |    1     |   0    | FAILED |     -     |    -     |     -     |
|            overlay_android_samp            |    4     |   0    | FAILED |     -     |    -     |     -     |
|        overlaylocker2_android_samp         |    7     |   0    | FAILED |     -     |    -     |     -     |
|                   phospy                   |    2     |   0    | FAILED |     -     |    -     |     -     |
|                 proxy_samp                 |    17    |   0    | FAILED |     -     |    -     |     -     |
|            remote_control_smack            |    17    |   0    | FAILED |     -     |    -     |     -     |
|                   repane                   |    1     |   0    | FAILED |     -     |    -     |     -     |
|                  Roidsec                   |    6     |   0    | FAILED |     -     |    -     |     -     |
|                  samsapo                   |    4     |   0    | FAILED |     -     |    -     |     -     |
|                  save_me                   |    25    |   0    | FAILED |     -     |    -     |     -     |
|                  scipiex                   |    3     |   0    | FAILED |     -     |    -     |     -     |
|            slocker_android_samp            |    5     |   0    | FAILED |     -     |    -     |     -     |
|                 sms_google                 |    4     |   0    | FAILED |     -     |    -     |     -     |
|          sms_send_locker_qqmagic           |    6     |   0    | FAILED |     -     |    -     |     -     |
|          smssend_packageInstaller          |    5     |   0    | FAILED |     -     |    -     |     -     |
|           smssilience_fake_vertu           |    2     |   0    | FAILED |     -     |    -     |     -     |
| smsstealer_kysn_assassincreed_android_samp |    5     |   0    | FAILED |     -     |    -     |     -     |
|      stels_flashplayer_android_update      |    3     |   0    | FAILED |     -     |    -     |     -     |
|                   tetus                    |    2     |   0    | FAILED |     -     |    -     |     -     |
|          the_interview_movieshow           |    1     |   0    | FAILED |     -     |    -     |     -     |
|             threatjapan_uracto             |    2     |   0    | FAILED |     -     |    -     |     -     |
|           vibleaker_android_samp           |    4     |   0    | FAILED |     -     |    -     |     -     |
|             xbot_android_samp              |    3     |   0    | FAILED |     -     |    -     |     -     |
|                   TOTAL                    |   203    |   0    |   -    |     -     |    -     |     -     |
|                   TOTAL*                   |   186    |   0    |   -    |     -     |    -     |     -     |

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