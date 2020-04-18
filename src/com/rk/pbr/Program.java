package com.rk.pbr;

public class Program {
    public static void main(String[] args) {
        int[] UmurUmur = {10, 11, 12};

        for (int i = 0; i < UmurUmur.length; i++) {
            System.out.println(UmurUmur[i]);
        }

        Test(UmurUmur);

        for (int i = 0; i < UmurUmur.length; i++) {
            System.out.println(UmurUmur[i]);
        }

    }

    public static void Test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 50;
        }
    }
}
