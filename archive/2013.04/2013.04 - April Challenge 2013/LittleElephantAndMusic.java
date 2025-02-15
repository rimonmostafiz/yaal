package net.egork;

import net.egork.collections.ArrayUtils;
import net.egork.collections.map.EHashMap;
import net.egork.io.IOUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;
import java.util.Map;

public class LittleElephantAndMusic {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] band = new int[count];
		int[] length = new int[count];
		IOUtils.readIntArrays(in, band, length);
		long totalLength = ArrayUtils.sumArray(length);
		Map<Integer, Integer> minLengthPerBand = new EHashMap<Integer, Integer>() {
			@Override
			public Integer put(Integer key, Integer value) {
				if (!containsKey(key))
					return super.put(key, value);
				return super.put(key, Math.min(value, get(key)));
			}
		};
		for (int i = 0; i < count; i++)
			minLengthPerBand.put(band[i], length[i]);
		long answer = totalLength * minLengthPerBand.size();
		Integer[] minLengths = minLengthPerBand.values().toArray(new Integer[minLengthPerBand.size()]);
		Arrays.sort(minLengths);
		for (int i = 0; i < minLengths.length; i++)
			answer -= (long)(minLengths.length - i - 1) * minLengths[i];
		out.printLine(answer);
    }
}
