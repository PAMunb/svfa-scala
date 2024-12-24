package br.unb.cic.android

import org.scalatest.FunSuite

class AndroidTaintBenchSuiteTest extends FunSuite {
  test("in the APK Roidsec, we should detect 1 flow") {
    val svfa = new AndroidTaintBenchTest("roidsec") with RoidSecSpec
    svfa.buildSparseValueFlowGraph()
    // println(svfa.svgToDotModel())
    assert(svfa.reportConflictsSVG().size == 1)
  }

//  test("in the APK backflash, we should detect X flow") {
//    val svfa = new AndroidTaintBenchTest("backflash")
//    svfa.buildSparseValueFlowGraph()
//    // println(svfa.svgToDotModel())
//    assert(svfa.reportConflictsSVG().size == 1)
//  }
}
