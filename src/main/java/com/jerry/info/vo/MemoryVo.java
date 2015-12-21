package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * 内存信息
 */
public class MemoryVo {
    private long mem_total;//内存总量
    private long mem_used;//当前内存使用量
    private long mem_free;//当前内存剩余量
    private long swap_total;//交换区总量
    private long swap_used;//当前交换区使用量
    private long swap_free;//当前交换区剩余量

    public long getMem_total() {
        return mem_total;
    }

    public void setMem_total(long mem_total) {
        this.mem_total = mem_total;
    }

    public long getMem_used() {
        return mem_used;
    }

    public void setMem_used(long mem_used) {
        this.mem_used = mem_used;
    }

    public long getMem_free() {
        return mem_free;
    }

    public void setMem_free(long mem_free) {
        this.mem_free = mem_free;
    }

    public long getSwap_total() {
        return swap_total;
    }

    public void setSwap_total(long swap_total) {
        this.swap_total = swap_total;
    }

    public long getSwap_used() {
        return swap_used;
    }

    public void setSwap_used(long swap_used) {
        this.swap_used = swap_used;
    }

    public long getSwap_free() {
        return swap_free;
    }

    public void setSwap_free(long swap_free) {
        this.swap_free = swap_free;
    }

    @Override
    public String toString() {
        return "MemoryVo{" +
                "mem_total=" + mem_total +
                ", mem_used=" + mem_used +
                ", mem_free=" + mem_free +
                ", swap_total=" + swap_total +
                ", swap_used=" + swap_used +
                ", swap_free=" + swap_free +
                '}';
    }
}
