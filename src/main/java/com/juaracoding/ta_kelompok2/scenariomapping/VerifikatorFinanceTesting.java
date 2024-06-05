package com.juaracoding.ta_kelompok2.scenariomapping;

/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 27/05/2024 5:25
@Last Modified 27/05/2024 5:25
Version 1.0
*/

public enum VerifikatorFinanceTesting {
    T1("Test002 Login Verifikator Dengan Username Dan Password Yang Valid"),
    T2("Test003 Login Finance Dengan Username Dan Password Yang Valid"),
    T3("Test006 Login Akun Username Dan Password Kosong"),
    T4("Test007 Login Akun Username Valid dan Password Empty"),
    T5("Test008 Login Akun Username Empty dan Password valid"),
    T6("Test009 Login Akun Username dan Password Tidak Valid"),
    T7("Test010 Login Akun Username Valid dan Password Tidak Valid"),
    T8("Test011 Login Akun Username Tidak Valid dan Password Valid"),
    T9("Test012 Login Akun Username Empty dan Password Tidak valid"),
    T10("Test013 Login Akun Username Tidak Valid dan Password Empty"),
    T11("Test014 Login Akun Username dan Password Huruf Besar"),
    T12("Test015 Login Akun Username Valid dan Password Huruf Besar"),
    T13("Test016 Login Akun Username Huruf Besar dan Password Valid"),
    T14("Test017 Login Akun Username dan Password Huruf Kecil"),
    T15("Test018 Login Akun Username Valid dan Password Huruf Kecil"),
    T16("Test019 Login Akun Username Huruf Kecil dan Password Valid"),
    T17("Test020 Login Akun Username dan Password Dengan Spasi Di Depan"),
    T18("Test021 Login Akun Username Dengan Spasi Di Depan dan Password Valid"),
    T19("Test022 Login Akun Username Valid dan Password Dengan Spasi Di Depan"),
    T20("Test023 Login Akun Username dan Password Dengan Spasi Di Belakang"),
    T21("Test024 Login Akun Username Dengan Spasi Di Belakang dan Password Valid"),
    T22("Test025 Login Akun Username Valid dan Password Dengan Spasi Di Belakang"),
    T23("Test151 Login Verifikator Dengan Username Dan Password Yang Valid"),
    T24("Test154 Testing Pencarian Data Valid Web Table Verifikasi"),
    T25("Test155 Testing Pencarian Data Empty Web Table Verifikasi"),
    T26("Test156 Testing Pencarian Case Incosistent Web Table Verifikasi"),
    T27("Test157 Testing Pencarian Partial Match Web Table Verifikasi"),
    T28("Test158 Testing Menampilkan Banyak Entries Data Web Table Verifikasi"),
    T29("Test161 Testing Pencarian Data Invalid Web Table Verifikasi"),
    T30("Test163 Testing Pencarian Data Valid Dengan Banyak Spasi Di Depan Web Table Verifikasi"),
    T31("Test165 Testing Pencarian Data Valid Dengan Banyak Spasi Di Belakang Web Table Verifikasi"),
    T32("Test171 Testing Edit Data Valid Form Verifikasi"),
    T33("Test179 Testing Save Note Table verifikasi"),
    T34("Test180 Testing Verifikasi Data Table Verifikasi"),
    T35("Test201 Testing Pencarian Data Valid Web Table Pre Transfer"),
    T36("Test203 Testing Pencarian Data Empty Web Table Pre Transfer"),
    T37("Test205 Testing Pencarian Case inconsistent Web Table Pre Transfer"),
    T38("Test207 Testing Pencarian Partial Match Web Table Pre Transfer"),
    T39("Test208 Testing Menampilkan Banyak Entries Data Web Table Pre Transfer"),
    T40("Test209 Testing Export Excel Table Pre Transfer"),
    T41("Test211 Testing Pencarian Data Valid Web Table Finance"),
    T42("Test213 Testing Pencarian Data Empty Web Table Finance"),
    T43("Test215 Testing Pencarian Case inconsistent Web Table Finance"),
    T44("Test217 Testing Pencarian Partial Match Web Table Finance"),
    T45("Test218 Testing Menampilkan Banyak Entries Data Web Table Finance"),
    T46("Test219 Testing Tombol Upload Sudah Transfer Dan Kembalikan Ke Verifikator"),
    T47("Test221 Validasi Data Dari Finance"),
    T48("Test231 Testing Pencarian Data Valid Web Table Upload Bukti Transfer"),
    T49("Test233 Testing Pencarian Data Empty Web Table Upload Bukti Transfer"),
    T50("Test235 Testing Pencarian Case inconsistent Web Table Upload Bukti Transfer"),
    T51("Test237 Testing Pencarian Partial Match Web Table Upload Bukti Transfer"),
    T52("Test238 Testing Menampilkan Banyak Entries Data Web Table Upload Bukti Transfer"),
    T53("Test241 Testing Rotate Foto Transaksi Satu Form Verifikasi"),
    T54("Test243 Testing Rotate Foto Transaksi Dua Form Verifikasi"),
    T55("Test245 Testing Rotate Foto Transaksi Tiga Form Verifikasi");





    private String testName;

    private VerifikatorFinanceTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
