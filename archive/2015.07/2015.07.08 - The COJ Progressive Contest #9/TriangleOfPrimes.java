package net.egork;

import net.egork.numbers.IntegerUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TriangleOfPrimes {
    long[] sums = new long[1000 * 1001 / 2 + 1];

    public TriangleOfPrimes() {
        boolean[] isPrime = IntegerUtils.generatePrimalityTable(sums.length);
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + (isPrime[i] ? i : 0);
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int count = in.readInt();
        out.printLine(sums[count * (count + 1) / 2] - sums[count * (count - 1) / 2]);
    }
}
