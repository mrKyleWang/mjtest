package top.kylewang.mjtest.collect.cpu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
public class CpuCollector {

	public CpuInfo getCollectedData() throws IOException {
        CpuInfo cpuInfo = new CpuInfo();
        String cmd = "top -bn 1 -i -c";
		Process ps = Runtime.getRuntime().exec(cmd);
		BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
		StringBuffer sb = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
		    if (line.contains("Cpu")){
                break;
            }
		}
        double[] resultConvert = resultConvert(line);
        cpuInfo.setUs(resultConvert[0]);
        cpuInfo.setSy(resultConvert[1]);
        cpuInfo.setNi(resultConvert[2]);
        cpuInfo.setId(resultConvert[3]);
        cpuInfo.setWa(resultConvert[4]);
        cpuInfo.setHi(resultConvert[5]);
        cpuInfo.setSi(resultConvert[6]);
        cpuInfo.setSt(resultConvert[7]);
		return cpuInfo;
	}

    private double[] resultConvert(String source){
        double[] result = new double[8];
        String[] strings = source.split(",");
        for (int i = 0; i < 8; i++) {
            String regex = "\\d+.\\d+";
            result[i]=Double.parseDouble(getMatcher(regex, strings[i]));
        }
        return result;
    }

    private String getMatcher(String regex, String source) {
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            result = matcher.group();
        }
        return result;
    }
}
