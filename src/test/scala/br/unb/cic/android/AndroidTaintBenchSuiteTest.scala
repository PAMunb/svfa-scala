package br.unb.cic.android

import org.scalatest.FunSuite

class AndroidTaintBenchSuiteTest extends FunSuite {
  test("in the APK Roidsec, we should detect 1 flow") {
    val svfa = new AndroidTaintBenchTest("roidsec")
    svfa.buildSparseValueFlowGraph()
    // println(svfa.svgToDotModel())
    assert(svfa.reportConflictsSVG().size == 1)
  }
}
