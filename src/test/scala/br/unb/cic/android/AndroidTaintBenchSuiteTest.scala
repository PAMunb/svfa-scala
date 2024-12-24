package br.unb.cic.android

import br.unb.cic.android.specs.{BackFlashSpec, BeitaComBeitaContactSpec, RoidSecSpec}
import org.scalatest.FunSuite

class AndroidTaintBenchSuiteTest extends FunSuite {
  test("in the APK Roidsec, we should detect 1 flow") {
    val svfa = new AndroidTaintBenchTest("roidsec") with RoidSecSpec
    svfa.buildSparseValueFlowGraph()
    // println(svfa.svgToDotModel())
    assert(svfa.reportConflictsSVG().size == 13)
  }

  test("in the APK backflash, we should detect 6 flow") {
   val svfa = new AndroidTaintBenchTest("backflash") with BackFlashSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 6)
  }

  test("in the APK beita_com_beita_contact, we should detect 3 flow") {
    val svfa = new AndroidTaintBenchTest("beita_com_beita_contact") with BeitaComBeitaContactSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 3)
  }



//template
  test("in the XXX, we should detect X flow") {
    val svfa = new AndroidTaintBenchTest("XXX") with BackFlashSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 0)
  }
}
