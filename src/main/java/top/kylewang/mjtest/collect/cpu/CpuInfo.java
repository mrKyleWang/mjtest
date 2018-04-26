package top.kylewang.mjtest.collect.cpu;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
public class CpuInfo {

    /** 表示用户空间程序的cpu使用率（没有通过nice调度） */
    private double us;
    /** 表示系统空间的cpu使用率，主要是内核程序。 */
    private double sy;
    /** 表示用户空间且通过nice调度过的程序的cpu使用率。 */
    private double ni;
    /** 空闲cpu */
    private double id;
    /** cpu运行时在等待io的时间 */
    private double wa;
    /** cpu处理硬中断的数量 */
    private double hi;
    /** cpu处理软中断的数量 */
    private double si;
    /** 被虚拟机偷走的cpu */
    private double st;

    public double getUs() {
        return us;
    }

    public void setUs(double us) {
        this.us = us;
    }

    public double getSy() {
        return sy;
    }

    public void setSy(double sy) {
        this.sy = sy;
    }

    public double getNi() {
        return ni;
    }

    public void setNi(double ni) {
        this.ni = ni;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getWa() {
        return wa;
    }

    public void setWa(double wa) {
        this.wa = wa;
    }

    public double getHi() {
        return hi;
    }

    public void setHi(double hi) {
        this.hi = hi;
    }

    public double getSi() {
        return si;
    }

    public void setSi(double si) {
        this.si = si;
    }

    public double getSt() {
        return st;
    }

    public void setSt(double st) {
        this.st = st;
    }
}
