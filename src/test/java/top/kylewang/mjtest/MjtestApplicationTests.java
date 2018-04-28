package top.kylewang.mjtest;

import com.sun.management.OperatingSystemMXBean;
import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class MjtestApplicationTests {

	@Test
	public void contextLoads() {
		String str = "kdla8405118*)(^%*YTILKH89015jfkhka";
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);

	}

	@Test
	public void cpuTest() {
		OperatingSystemMXBean bean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

		while (true) {
			System.out.println(bean.getSystemCpuLoad() * 100 + "%");
			System.out.println(bean.getProcessCpuLoad() * 100 + "%");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void formatTest(Double source) {
		double d = 1.717557251908397;
		System.out.println((double) Math.round(source * 10000) / 10000);
	}

	public void formatTest2(Double source) {
		BigDecimal bg = new BigDecimal(source);
		System.out.println(bg.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue());
	}

	@Test
	public void formatTimeTest() {
		double d = 0.38167938931297707;
		long l1 = System.currentTimeMillis();
		formatTest(d);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
	}

	@Test
	public void stringTokenizerTest(){
		String s = new String("This is a test string");
		StringTokenizer st = new StringTokenizer(s);
		System.out.println( "Token Total: " + st.countTokens() );
		while( st.hasMoreElements() ){
			System.out.println(st.nextToken());
		}
	}

}
