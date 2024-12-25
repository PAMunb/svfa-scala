package br.unb.cic.android

import br.unb.cic.android.specs.{BackFlashSpec, BeitaComBeitaContactSpec, CajinoBaiduSpec, ChatHookSpec, ChuliaSpec, DeathRingMaterialflowSpec, DsencryptSampSpec, ExprespamSpec, FakeappstoreSpec, FakebankAndroidSampSpec, FakedaumSpec, FakemartSpec, FakeplaySpec, FaketaobaoSpec, GodwonSampSpec, HummingbadAndroidSampSpec, JollyservSpec, OverlayAndroidSampSpec, Overlaylocker2AndroidSampSpec, PhospySpec, ProxySampSpec, RemoteControlSmackSpec, RepaneSpec, RoidSecSpec}
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

  test("in the APK cajino_baidu, we should detect 12 flow") {
    val svfa = new AndroidTaintBenchTest("cajino_baidu") with CajinoBaiduSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 12)
  }

  test("in the APK chat_hook, we should detect 12 flow") {
    val svfa = new AndroidTaintBenchTest("chat_hook") with ChatHookSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 12)
  }

  test("in the APK chulia, we should detect 4 flow") {
    val svfa = new AndroidTaintBenchTest("chulia") with ChuliaSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 4)
  }

  test("in the APK death_ring_materialflow, we should detect 1 flow") {
    val svfa = new AndroidTaintBenchTest("death_ring_materialflow") with DeathRingMaterialflowSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 1)
  }

  test("in the APK dsencrypt_samp, we should detect 1 flow") {
    val svfa = new AndroidTaintBenchTest("dsencrypt_samp") with DsencryptSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 1)
  }

  test("in the APK exprespam, we should detect 2 flow") {
    val svfa = new AndroidTaintBenchTest("exprespam") with ExprespamSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK fakeappstore, we should detect 3 flow") {
    val svfa = new AndroidTaintBenchTest("fakeappstore") with FakeappstoreSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 3)
  }

  test("in the APK fakebank_android_samp, we should detect 5 flow") {
    val svfa = new AndroidTaintBenchTest("fakebank_android_samp") with FakebankAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 5)
  }

  test("in the APK fakedaum, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("fakedaum") with FakedaumSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK fakemart, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("fakemart") with FakemartSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK fakeplay, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("fakeplay") with FakeplaySpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK faketaobao, we should detect 4 flows") {
    val svfa = new AndroidTaintBenchTest("faketaobao") with FaketaobaoSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 4)
  }

  test("in the APK godwon_samp, we should detect 6 flows") {
    val svfa = new AndroidTaintBenchTest("godwon_samp") with GodwonSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 6)
  }

  test("in the APK hummingbad_android_samp, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("hummingbad_android_samp") with HummingbadAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK jollyserv, we should detect 1 flows") {
    val svfa = new AndroidTaintBenchTest("jollyserv") with JollyservSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 1)
  }

  test("in the APK overlay_android_samp, we should detect 4 flows") {
    val svfa = new AndroidTaintBenchTest("overlay_android_samp") with OverlayAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 4)
  }

  test("in the APK overlaylocker2_android_samp, we should detect 7 flows") {
    val svfa = new AndroidTaintBenchTest("overlaylocker2_android_samp") with Overlaylocker2AndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 7)
  }

  test("in the APK phospy, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("phospy") with PhospySpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK proxy_samp, we should detect 17 flows") {
    val svfa = new AndroidTaintBenchTest("proxy_samp") with ProxySampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 17)
  }

  test("in the APK remote_control_smack, we should detect 17 flows") {
    val svfa = new AndroidTaintBenchTest("remote_control_smack") with RemoteControlSmackSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 17)
  }

  test("in the APK repane, we should detect 1 flow") {
    val svfa = new AndroidTaintBenchTest("repane") with RepaneSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 1)
  }







//template
  test("in the APK XXX, we should detect X flows") {
    val svfa = new AndroidTaintBenchTest("XXX") with BackFlashSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 0)
  }
}
