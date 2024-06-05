Feature: Test Fungsi Rotasi Dengan Open CV

  Scenario: Test241 Testing Rotate Foto Transaksi Satu Form Verifikasi
    When Test241 Klik Navbar Verifikasi
    Then Test241 Validasi Label Halaman Verifikasi
    And Test241 Input Field <data> Yang Dicari
    And Test241 Mencari Data
    And Test241 Input Field Data Kembali
    And Test241 Mencari Data Kembali
    Then Test241 Validasi Data Yang Dicari
    When Test241 Klik Tombol Aksi Pada Data Web Table
    Then Test241 Validasi Halaman Form Verifikasi
    When Test241 Buka Modal Upload Dengan Mengklik Foto Transaksi Satu
    And Test241 Validasi Modal Terbuka
    And Test241 Upload Gambar Transaksi
    And Test241 Klik Tombol Ganti Foto
    Then Test241 Validasi Gambar Berhasil Di Upload
    And Test241 Klik Tombol Rotate 90 Derajat
    And Test241 Download Gambar Rotate 90 Derajat
    Then Test241 Validasi Fungsi Rotate 90 Derajat
    And Test241 Klik Tombol Rotate 180 Derajat
    And Test241 Download Gambar Rotate 180 Derajat
    Then Test241 Validasi Fungsi Rotate 180 Derajat
    And Test241 Klik Tombol Rotate 270 Derajat
    And Test241 Download Gambar Rotate 270 Derajat
    Then Test241 Validasi Fungsi Rotate 270 Derajat

    Examples:
      | data          |
      | Reference ID  |
    
  Scenario: Test243 Testing Rotate Foto Transaksi Dua Form Verifikasi
    When Test243 Buka Modal Upload Dengan Mengklik Foto Transaksi Dua
    And Test243 Validasi Modal Terbuka
    And Test243 Upload Gambar Transaksi
    And Test243 Klik Tombol Ganti Foto
    Then Test243 Validasi Gambar Berhasil Di Upload
    And Test243 Klik Tombol Rotate 90 Derajat
    And Test243 Download Gambar Rotate 90 Derajat
    Then Test243 Validasi Fungsi Rotate 90 Derajat
    And Test243 Klik Tombol Rotate 180 Derajat
    And Test243 Download Gambar Rotate 180 Derajat
    Then Test243 Validasi Fungsi Rotate 180 Derajat
    And Test243 Klik Tombol Rotate 270 Derajat
    And Test243 Download Gambar Rotate 270 Derajat
    Then Test243 Validasi Fungsi Rotate 270 Derajat

  Scenario: Test245 Testing Rotate Foto Transaksi Tiga Form Verifikasi
    When Test245 Buka Modal Upload Dengan Mengklik Foto Transaksi Tiga
    And Test245 Validasi Modal Terbuka
    And Test245 Upload Gambar Transaksi
    And Test245 Klik Tombol Ganti Foto
    Then Test245 Validasi Gambar Berhasil Di Upload
    And Test245 Klik Tombol Rotate 90 Derajat
    And Test245 Download Gambar Rotate 90 Derajat
    Then Test245 Validasi Fungsi Rotate 90 Derajat
    And Test245 Klik Tombol Rotate 180 Derajat
    And Test245 Download Gambar Rotate 180 Derajat
    Then Test245 Validasi Fungsi Rotate 180 Derajat
    And Test245 Klik Tombol Rotate 270 Derajat
    And Test245 Download Gambar Rotate 270 Derajat
    Then Test245 Validasi Fungsi Rotate 270 Derajat