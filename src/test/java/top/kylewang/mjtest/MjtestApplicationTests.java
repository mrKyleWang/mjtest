package top.kylewang.mjtest;

import org.junit.Test;
import top.kylewang.mjtest.collect.cpu.CpuCollector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MjtestApplicationTests {

	@Test
	public void contextLoads() {
		String str = "kdla8405118*)(^%*YTILKH89015jfkhka";
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);

	}

	@Test
	public void test() {
		String s = "%Cpu(s):  6.2 us,  6.2 sy,  0.0 ni, 87.5 id,  0.0 wa,  0.0 hi,  0.0 si,  0.0 st";
		double[] doubles = CpuCollector.resultConvert(s);
		for (double aDouble : doubles) {
			System.out.println(aDouble);
		}
	}

	@Test
	public void test2() {
		String source = "Cpu(s): 12.3%us,  0.4%sy,  0.0%ni, 86.9%id,  0.2%wa,  0.0%hi,  0.0%si,  0.0%st";
		String[] strings = source.split(",");
		for (String string : strings) {
			String regex = "\\d+.\\d+";
			System.out.println(getMatcher(regex, string));
		}
	}

	public String getMatcher(String regex, String source) {
		String result = "";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		while (matcher.find()) {
			result = matcher.group();
		}
		return result;
	}

}
