package br.unb.cic.metrics

import br.unb.cic.android.AndroidTaintBenchTest
import org.scalatest.FunSuite


class MetricsTest extends FunSuite with Metrics {

    test("metrics") {
      val expected = 203
      val actual = 41

      this.computeMetricsByResults(expected, actual)
    }

    test("computeMetricsByCriterions") {
      val P = 186
      val TP = 43
      val FP = 14

      this.computeMetricsByCriterions(P, TP, FP)
    }
}
