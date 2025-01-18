package br.unb.cic.soot.svfa.metrics

trait Metrics {

    def compute(expected: Int, actual: Int): Unit = {
        var TP = 0.0
        var FP = 0.0
        var P = 0.0

        var precision = 0.0
        var recall = 0.0
        var fscore = 0.0

        // Compute expected and unexpected flows
        P = expected
        if (actual > expected) {
            TP = expected
            FP = (actual - expected)
        }
        else {
            TP = actual
        }

        // Compute Metrics
        precision = TP / (TP + FP)
        recall = TP / P
        fscore = (2 * precision * recall) / (precision + recall)

        println(f"precision: $precision%1.2f")
        println(f"recall: $recall%1.2f")
        println(f"fscore $fscore%1.2f")

    }
}