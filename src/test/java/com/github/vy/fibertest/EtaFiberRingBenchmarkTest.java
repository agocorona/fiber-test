package com.github.vy.fibertest;

import org.junit.Test;

public class EtaFiberRingBenchmarkTest extends EtaFiberRingBenchmark {

    @Test
    public void testRingBenchmark() throws Exception {
        Util.testRingBenchmark(workerCount, ringSize, ringBenchmark());
    }

}
