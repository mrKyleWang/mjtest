package top.kylewang.mjtest;

import com.sun.management.OperatingSystemMXBean;
import org.junit.Test;

import java.lang.management.ManagementFactory;


public class MjtestApplicationTests {

	@Test
	public void contextLoads() {
		String str = "kdla8405118*)(^%*YTILKH89015jfkhka";
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);

	}

	@Test
	public void cpuTest(){
		OperatingSystemMXBean bean = (OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();

		while (true){
			System.out.println(bean.getSystemCpuLoad()*100+"%");
			System.out.println(bean.getProcessCpuLoad()*100+"%");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
