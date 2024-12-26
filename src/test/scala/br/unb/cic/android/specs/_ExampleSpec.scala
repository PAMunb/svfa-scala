package br.unb.cic.android.specs

import br.unb.cic.android.FlowdroidSpec

trait _ExampleSpec extends FlowdroidSpec {
//  URL https://github.com/TaintBench/roidsec/blob/master/README.md
  override val sourceList = List(
    "<android.telephony.SmsManager: android.telephony.SmsManager getDefault()>",
  )

  override val sinkList = List(
    "<java.io.File: boolean delete()>",
  )
}