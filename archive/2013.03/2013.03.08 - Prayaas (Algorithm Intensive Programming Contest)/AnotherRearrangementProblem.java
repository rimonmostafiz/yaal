package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.MiscUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class AnotherRearrangementProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] permutation = IOUtils.readIntArray(in, count);
		MiscUtils.decreaseByOne(permutation);
		boolean[] processed = new boolean[count];
		int answer = 0;
		for (int i = 0; i < count; i++) {
			if (processed[i])
				continue;
			answer++;
			int current = i;
			do {
				processed[current] = true;
				current = permutation[current];
			} while (!processed[current]);
		}
		out.printLine(answer);
    }
}
