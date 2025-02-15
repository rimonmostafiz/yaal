package net.egork;

import net.egork.collections.sequence.Array;
import net.egork.io.IOUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Set;
import java.util.TreeSet;

public class TaskG {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		Set<Integer> answer = new TreeSet<Integer>(Array.wrap(IOUtils.readIntArray(in, in.readInt())));
		answer.addAll(Array.wrap(IOUtils.readIntArray(in, in.readInt())));
		out.printLine(answer.toArray());
	}
}
