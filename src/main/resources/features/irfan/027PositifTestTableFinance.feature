Feature: Positif Test Table Finance

  Scenario: Test211 Testing Pencarian Data Valid Web Table Finance
    When Test211 Klik Navbar Finance
    Then Test211 Validasi Label Halaman Finance
    And Test211 Menginput <data> Valid
    And Test211 Mencari Data Valid
    And Test211 Menginput Data Valid Kembali
    And Test211 Mencari Data Valid Kembali
    Then Test211 Validasi Data Yang Dicari

    Examples:
      | data |
      | Reference ID  |
      | Nama Customer |
      | Nomor Handphone  |
      | RRN  |


  Scenario: Test213 Testing Pencarian Data Empty Web Table Finance
    When Test213 Klik Navbar Finance
    Then Test213 Validasi Label Halaman Finance
    And Test213 Menginput Empty String
    And Test213 Mencari Empty String
    And Test213 Menginput Empty String Kembali
    And Test213 Mencari Empty String Kembali
    Then Test213 Validasi Banyak Data

  Scenario: Test215 Testing Pencarian Case inconsistent Web Table Finance
    When Test215 Klik Navbar Finance
    Then Test215 Validasi Label Halaman Finance
    And Test215 Merubah <data> Menjadi Case inconsistent
    And Test215 Menginput Data Case inconsistent
    And Test215 Mencari Data Case inconsistent
    And Test215 Menginput Data Case inconsistent Kembali
    And Test215 Mencari Data Case inconsistent Kembali
    Then Test215 Validasi Data Case inconsistent
    Examples:
      | data |
      | Nama Customer |
      | Nama Customer |
      | Reference ID  |
      | Reference ID  |

  Scenario: Test217 Testing Pencarian Partial Match Web Table Finance
    When Test217 Klik Navbar Finance
    Then Test217 Validasi Label Halaman Finance
    And Test217 Merubah <data> Menjadi Partial Match
    And Test217 Menginput Data Partial Match
    And Test217 Mencari Data Partial Match
    And Test217 Menginput Data Partial Match Kembali
    And Test217 Mencari Data Partial Match Kembali
    Then Test217 Validasi Data Partial Match
    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |


  Scenario: Test218 Testing Menampilkan Banyak Entries Data Web Table Finance
    When Test218 Klik Navbar Finance
    Then Test218 Validasi Label Halaman Finance
    And Test218 Pilih Option Show Entries <data>
    Then Test218 Validasi Banyak Data Yang Ditampilkan

    Examples:
      | data |
      | 10  |
      | 25  |
      | 50  |
      | 100  |

  Scenario: Test219 Testing Tombol Upload Sudah Transfer Dan Kembalikan Ke Verifikator
    When Test219 Klik Navbar Finance
    Then Test219 Validasi Label Halaman Finance
    And Test219 Menginput <datasatu> Valid Pertama
    And Test219 Mencari Data Valid Pertama
    And Test219 Menginput Data Valid Pertama Kembali
    And Test219 Mencari Data Valid Pertama Kembali
    Then Test219 Validasi Data Pertama
    And Test219 Klik Checkbox Data Pertama
    And Test219 Klik Kembalikan Ke Verifikator
    And Test219 Klik Tombol Modal Data Pertama
    When Test219 Klik Navbar Finance Kedua
    Then Test219 Validasi Label Halaman Finance Kedua
    And Test219 Menginput <datadua> Valid Kedua
    And Test219 Mencari Data Valid Kedua
    And Test219 Menginput Data Valid Kedua Kembali
    And Test219 Mencari Data Valid Kedua Kembali
    Then Test219 Validasi Data Kedua
    And Test219 Klik Checkbox Data Kedua
    And Test219 Klik Update Sudah Transfer
    And Test219 Klik Tombol Modal Data Kedua
    And Test219 Klik Logout

    Examples:
      | datasatu | datadua|
      | Reference ID  | Reference ID  |


  Scenario: Test221 Validasi Data Dari Finance
    When Test221 Membuka Halaman Login
    And Test221 Clear Field username dan password
    And Test221 Input TextField User <username> Yang Valid
    And Test221 Input TextField Pass <password> Yang Valid
    And Test221 Klik Tombol Login
    Then Test221 Validasi Label Halaman Home
    When Test221 Klik Navbar Verifikasi
    Then Test221 Validasi Label Halaman Verifikasi
    And Test221 Menginput Data Pertama Di Pencarian
    And Test221 Mencari Data Pertama
    And Test221 Menginput Data Pertama Kembali
    And Test221 Mencari Data Pertama Kembali
    Then Test221 Validasi Data Pertama
    When Test221 Klik Navbar Upload Bukti Transfer
    Then Test221 Validasi Label Halaman Upload Bukti Transfer
    And Test221 Menginput Data Kedua Di Pencarian
    And Test221 Mencari Data Kedua
    And Test221 Menginput Data Kedua Kembali
    And Test221 Mencari Data Kedua Kembali
    Then Test221 Validasi Data Kedua

    Examples:
      | username | password |
      | feriansyah2  | aa |
