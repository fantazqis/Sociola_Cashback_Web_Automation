Feature: Positif Test Form Verifikasi

  Scenario: Test171 Testing Edit Data Valid Form Verifikasi
    When Test171 Klik Navbar Verifikasi
    Then Test171 Validasi Label Halaman Verifikasi
    And Test171 Input Field <data> Yang Dicari
    And Test171 Mencari Data
    And Test171 Input Field Data Kembali
    And Test171 Mencari Data Kembali
    Then Test171 Validasi Data Yang Dicari
    When Test171 Klik Tombol Aksi Pada Data Web Table
    Then Test171 Validasi Halaman Form Verifikasi
    And Test171 Klik Tombol Edit Form Verifikasi
    And Test171 Clear Field Form Verifikasi
    And Test171 Input Field Nama Nasabah <namanasabah>
    And Test171 Input Field Nomor Handphone <nomorhandphone>
    And Test171 Input Field Nomor Rekening <nomorrekening>
    And Test171 Input Field Pembayaran QRIS <pembayaranqris>
    And Test171 Input Field Nominal Transaksi <nominaltransaksi>
    And Test171 Input Text Tanggal Transaksi <tanggaltransaksi>
    And Test171 Input Field Nama Merchant <namamerchant>
    And Test171 Input Field RRN <RRN>
    And Test171 Klik Tombol Cancel Form Verifikasi
    Then Test171 Validasi Tombol Verifikasi Dan Tombol Save Note Tidak Bisa Diakses
    And Test171 Klik Tombol Edit Form Verifikasi Kembali
    And Test171 Klik Tombol Simpan Form Verifikasi
    And Test171 Klik Tombol OK Pada Alert Yang Keluar
    When Test171 Klik Navbar Verifikasi Setelah Edit
    Then Test171 Validasi Label Halaman Verifikasi Setelah Edit
    And Test171 Input Field Data Setelah Edit
    And Test171 Mencari Data Setelah Edit
    And Test171 Input Field Data Kembali Setelah Edit
    And Test171 Mencari Data Kembali Setelah Edit
    Then Test171 Validasi Data Yang Dicari Setelah Edit
    When Test171 Klik Tombol Aksi Pada Data Web Table Setelah Edit
    Then Test171 Validasi Halaman Form Verifikasi Setelah Edit
    Then Test171 Validasi Data Berhasil dirubah

    Examples:
      | data          | namanasabah     | nomorhandphone| nomorrekening| pembayaranqris     | nominaltransaksi | tanggaltransaksi| namamerchant| RRN        |
      | Reference ID  | Nisa Taslim     | 082251267573  | 84231795621  | Bca Mobile Sakuku  | 480.000          | 05/27/2024      | SOCIOLLA    | 351111165 |


  Scenario: Test179 Testing Save Note Table verifikasi
    When Test179 Klik Navbar Verifikasi
    Then Test179 Validasi Label Halaman Verifikasi
    And Test179 Input Field <data> Yang Dicari
    And Test179 Mencari Data
    And Test179 Input Field Data Kembali
    And Test179 Mencari Data Kembali
    Then Test179 Validasi Data Yang Dicari
    When Test179 Klik Tombol Aksi Pada Data Web Table
    Then Test179 Validasi Halaman Form Verifikasi
    And Test179 Mengisi Teks Field Notes <catatan>
    And Test179 Klik Tombol Save Note
    And Test179 Klik Tombol OK Pada Modal
    And Test179 Klik Tombol OK Pada Alert Yang Keluar
    When Test179 Klik Navbar Verifikasi Kembali
    Then Test179 Validasi Label Halaman Verifikasi Kembali
    And Test179 Input Field Data Setelah Save Note
    And Test179 Mencari Data Setelah Save Note
    And Test179 Input Field Data Setelah Save Note Kembali
    And Test179 Mencari Data Setelah Save Note Kembali
    Then Test179 Validasi Notes Yang Di Simpan
    Examples:
      | data | catatan|
      | Nama Customer  | ini catatan Nama Customer|
      | Nomor Handphone  |ini catatan Nomor Handphone|
      | RRN  |ini catatan RRN|
      | Reference ID  |ini catatan Reference ID|

  Scenario: Test180 Testing Verifikasi Data Table Verifikasi
    When Test180 Klik Navbar Verifikasi
    Then Test180 Validasi Label Halaman Verifikasi
    And Test180 Input Field <data> Yang Dicari
    And Test180 Mencari Data
    And Test180 Input Field Data Kembali
    And Test180 Mencari Data Kembali
    Then Test180 Validasi Data Yang Dicari
    When Test180 Klik Tombol Aksi Pada Data Web Table
    Then Test180 Validasi Halaman Form Verifikasi
    And Test180 Klik Tombol Verifikasi Form Verifikasi
    And Test180 Klik Tombol OK Pada Modal
    And Test180 Klik Tombol OK Pada Alert Yang Keluar
    When Test180 Klik Navbar Pre Transfer
    Then Test180 Validasi Label Halaman Pre Transfer
    And Test180 Mencari Data Pada Table Pre Transfer
    Then Test180 Validasi Data Dari Table Pre Transfer

    Examples:
      | data |
      | Reference ID  |
