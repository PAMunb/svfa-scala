package br.unb.cic.android

import br.unb.cic.android.specs._
import br.unb.cic.soot.svfa.metrics.Metrics
import org.scalatest.FunSuite

class AndroidTaintBenchSuiteTest2 extends FunSuite with Metrics {

  test("in the APK backflash, we should detect 13 flow") {
    val expected = 13

    val svfa = new AndroidTaintBenchTest("backflash")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK beita_com_beita_contact, we should detect 3 flow") {
    val expected = 3

    val svfa = new AndroidTaintBenchTest("beita_com_beita_contact")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK cajino_baidu, we should detect 12 flow") {
    val expected = 12

    val svfa = new AndroidTaintBenchTest("cajino_baidu")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK chat_hook, we should detect 12 flow") {
    val expected = 12

    val svfa = new AndroidTaintBenchTest("chat_hook")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK chulia, we should detect 4 flow") {
    val expected = 4

    val svfa = new AndroidTaintBenchTest("chulia")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK death_ring_materialflow, we should detect 1 flow") {
    val expected = 1

    val svfa = new AndroidTaintBenchTest("death_ring_materialflow")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK dsencrypt_samp, we should detect 1 flow") {
    val expected = 1

    val svfa = new AndroidTaintBenchTest("dsencrypt_samp")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK exprespam, we should detect 2 flow") {
    val expected = 2

    val svfa = new AndroidTaintBenchTest("exprespam")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK fakeappstore, we should detect 3 flow") {
    val expected = 3

    val svfa = new AndroidTaintBenchTest("fakeappstore")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK fakebank_android_samp, we should detect 5 flow") {
    val expected = 5

    val svfa = new AndroidTaintBenchTest("fakebank_android_samp")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK fakedaum, we should detect 2 flows") {
    val expected = 2

    val svfa = new AndroidTaintBenchTest("fakedaum")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK fakemart, we should detect 2 flows") {
    val expected = 2

    val svfa = new AndroidTaintBenchTest("fakemart")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
  }

  test("in the APK fakeplay, we should detect 2 flows") {
    val expected = 2

    val svfa = new AndroidTaintBenchTest("fakeplay")
    svfa.buildSparseValueFlowGraph()

    val actual = svfa.reportConflictsSVG().size
    this.compute(expected, actual)

    assert(actual == expected)
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

  test("in the APK Roidsec, we should detect 6 flow") {
    val svfa = new AndroidTaintBenchTest("roidsec") with RoidSecSpec
    svfa.buildSparseValueFlowGraph()
    // println(svfa.svgToDotModel())
    assert(svfa.reportConflictsSVG().size == 6)
  }

  test("in the APK samsapo, we should detect 4 flows") {
    val svfa = new AndroidTaintBenchTest("samsapo") with SamsapoSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 4)
  }

  test("in the APK save_me we should detect 25 flows") {
    val svfa = new AndroidTaintBenchTest("save_me") with SaveMeSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 25)
  }

  test("in the APK scipiex, we should detect 3 flows") {
    val svfa = new AndroidTaintBenchTest("scipiex") with ScipiexSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 3)
  }

  test("in the APK slocker_android_samp, we should detect 5 flows") {
    val svfa = new AndroidTaintBenchTest("slocker_android_samp") with SlockerAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 5)
  }

  test("in the APK sms_google, we should detect 4 flows") {
    val svfa = new AndroidTaintBenchTest("sms_google") with SmsGoogleSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 4)
  }

  test("in the APK sms_send_locker_qqmagic, we should detect 6 flows") {
    val svfa = new AndroidTaintBenchTest("sms_send_locker_qqmagic") with SmsSendLockerQqmagicSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 6)
  }

  test("in the APK smssend_packageInstaller, we should detect 5 flows") {
    val svfa = new AndroidTaintBenchTest("smssend_packageInstaller") with SmssendPackageInstallerSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 5)
  }

  test("in the APK smssilience_fake_vertu, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("smssilience_fake_vertu") with SmssilienceFakeVertuSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK smsstealer_kysn_assassincreed_android_samp, we should detect 5 flows") {
    val svfa = new AndroidTaintBenchTest("smsstealer_kysn_assassincreed_android_samp") with SmsstealerKysnAssassincreedAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 5)
  }

  test("in the APK stels_flashplayer_android_update, we should detect 3 flows") {
    val svfa = new AndroidTaintBenchTest("stels_flashplayer_android_update") with StelsFlashplayerAndroidUpdateSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 3)
  }

  test("in the APK tetus, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("tetus") with TetusSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK the_interview_movieshow, we should detect 1 flows") {
    val svfa = new AndroidTaintBenchTest("the_interview_movieshow") with TheInterviewMovieShowSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 1)
  }

  test("in the APK threatjapan_uracto, we should detect 2 flows") {
    val svfa = new AndroidTaintBenchTest("threatjapan_uracto") with ThreatjapanUractoSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 2)
  }

  test("in the APK vibleaker_android_samp, we should detect 4 flows") {
    val svfa = new AndroidTaintBenchTest("vibleaker_android_samp") with VibleakerAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 4)
  }

  test("in the APK xbot_android_samp, we should detect 3 flows") {
    val svfa = new AndroidTaintBenchTest("xbot_android_samp") with XbotAndroidSampSpec
    svfa.buildSparseValueFlowGraph()
    assert(svfa.reportConflictsSVG().size == 3)
  }
}
