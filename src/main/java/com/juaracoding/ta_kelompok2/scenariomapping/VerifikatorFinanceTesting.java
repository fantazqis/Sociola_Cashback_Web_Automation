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
    T25("Test157 Testing Menampilkan Banyak Entries Data Web Table Verifikasi");
//    T3("Test003 Login Verifikator Username Valid dan Password Empty"),
//    T4("Test004 Login Verifikator Username Empty dan Password valid"),
//    T5("Test005 Login Verifikator Username Tidak Valid dan Password Tidak Valid"),
//    T6("Test006 Login Verifikator Username Valid dan Password Tidak Valid"),
//    T7("Test007 Login Verifikator Username Tidak Valid dan Password Valid"),
//    T8("Test008 Login Akun Username Empty dan Password Tidak valid"),
//    T9("Test009 Login Verifikator Username Tidak Valid dan Password Empty"),
//    T10("Test010 Login Verifikator Username dan Password Huruf Besar"),
//    T11("Test011 Login Verifikator Username Valid dan Password Huruf Besar"),
//    T12("Test012 Login Verifikator Username Huruf Besar dan Password Valid"),
//    T13("Test013 Login Verifikator Username dan Password Huruf Kecil"),
//    T14("Test014 Login Verifikator Username Valid dan Password Huruf Kecil"),
//    T15("Test015 Login Verifikator Username Huruf Kecil dan Password Valid"),
//    T16("Test016 Login Finance Dengan Username Dan Password Yang Valid"),
//    T17("Test017 Login Finance Username Dan Password Kosong"),
//    T18("Test018 Login Finance Username Valid dan Password Empty"),
//    T19("Test019 Login Finance Username Empty dan Password valid"),
//    T20("Test020 Login Finance Username Tidak Valid dan Password Tidak Valid"),
//    T21("Test021 Login Finance Username Valid dan Password Tidak Valid"),
//    T22("Test022 Login Finance Username Tidak Valid dan Password Valid"),
//    T23("Test023 Login Akun Username Empty dan Password Tidak valid"),
//    T24("Test024 Login Finance Username Tidak Valid dan Password Empty"),
//    T25("Test025 Login Finance Username dan Password Huruf Besar"),
//    T26("Test026 Login Finance Username Valid dan Password Huruf Besar"),
//    T27("Test027 Login Finance Username Huruf Besar dan Password Valid"),
//    T28("Test028 Login Finance Username dan Password Huruf Kecil"),
//    T29("Test029 Login Finance Username Valid dan Password Huruf Kecil"),
//    T30("Test030 Login Finance Username Huruf Kecil dan Password Valid");





    private String testName;

    private VerifikatorFinanceTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
