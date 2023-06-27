package com.hyz.dongtaishuzu;

public class Main1 {
    public static void main(String[] args) {
        DongTaiShuZu dongTaiShuZu = new DongTaiShuZu();
        dongTaiShuZu.addLast(1);
        dongTaiShuZu.addLast(2);
        dongTaiShuZu.addLast(3);

        dongTaiShuZu.forEach();
    }
}
