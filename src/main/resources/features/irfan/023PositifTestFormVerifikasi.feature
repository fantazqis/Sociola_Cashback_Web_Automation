Feature: Positif Test Form Verifikasi

  Scenario: Test160 Testing Edit Data Valid Form Verifikasi
    When Test160 Klik Navbar Verifikasi
    Then Test160 Validasi Label Halaman Verifikasi
    And Test160 Input Field Data Yang Dicari <data>
    And Test160 Menekan Tombol Enter Untuk Mencari
    And Test160 Input Field Data Yang Dicari Kembali
    And Test160 Menekan Tombol Enter Untuk Mencari Kembali
    Then Test160 Validasi Data Yang Dicari
    When Test160 Klik Tombol Aksi Pada Data Web Table
    Then Test160 Validasi Halaman Form Verifikasi
    And Test160 Simpan Data Form Verifikasi Sebelum Di Edit
    And Test160 Klik Tombol Edit Form Verifikasi
    And Test160 Clear Field Form Verifikasi
    And Test160 Input Field Nama Nasabah <namanasabah>
    And Test160 Input Field Nomor Handphone <nomorhandphone>
    And Test160 Input Field Nomor Rekening <nomorrekening>
    And Test160 Input Field Pembayaran QRIS <pembayaranqris>
    And Test160 Input Field Nominal Transaksi <nominaltransaksi>
    And Test160 Input Text Tanggal Transaksi <tanggaltransaksi>
    And Test160 Input Field Nama Merchant <namamerchant>
    And Test160 Input Field RRN <RRN>
    And Test160 Klik Tombol Cancel Form Verifikasi
    Then Test160 Validasi Tombol Verifikasi Dan Tombol Save Note Tidak Bisa Diakses
    And Test160 Klik Tombol Edit Form Verifikasi Kembali
    And Test160 Klik Tombol Simpan Form Verifikasi
    And Test160 Klik Tombol OK Pada Alert Yang Keluar
    When Test160 Klik Navbar Verifikasi Setelah Edit
    Then Test160 Validasi Label Halaman Verifikasi Setelah Edit
    And Test160 Input Field Data Yang Dicari Setelah Edit
    And Test160 Menekan Tombol Enter Untuk Mencari Data Setelah Edit
    And Test160 Input Field Data Yang Dicari Kembali Setelah Edit
    Then Test160 Validasi Data Yang Dicari Setelah Edit
    When Test160 Klik Tombol Aksi Pada Data Web Table Setelah Edit
    Then Test160 Validasi Halaman Form Verifikasi Setelah Edit
    Then Test160 Validasi Data Berhasil dirubah

    Examples:
      | data          | namanasabah     | nomorhandphone| nomorrekening| pembayaranqris     | nominaltransaksi|tanggaltransaksi|namamerchant|RRN  |
      | Reference ID  | Nisa Taslim     | 082251267573  | 84231795621  | Bca Mobile Sakuku  | 480000          | 27/05/2024     | SOCIOLLA   | 948 |
      | Reference ID  | Hengky Wardhana | 080983971059  | 39502847163  | Bca Mobile Sakuku  | 290000          | 12/04/2024     | SOCIOLLA   | 2488|
      | Reference ID  | Wendy Atmadja   | 085298679197  | 61789420358  | MyBca              | 320000          | 08/03/2024     | SOCIOLLA   | 3455|
