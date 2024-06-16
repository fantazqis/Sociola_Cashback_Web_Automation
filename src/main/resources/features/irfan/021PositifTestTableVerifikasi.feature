Feature: Positif Test Table Verifikasi

  Scenario: Test151 Login Verifikator Dengan Username Dan Password Yang Valid
    When Test151 Membuka Halaman Login
    And Test151 Clear Field username dan password
    And Test151 Input TextField User <username> Yang Valid
    And Test151 Input TextField Pass <password> Yang Valid
    And Test151 Klik Tombol Login
    Then Test151 Validasi Label Halaman Home

    Examples:
      | username | password |
      | feriansyah2  | aa |

  Scenario: Test154 Testing Pencarian Data Valid Web Table Verifikasi
    When Test154 Klik Navbar Verifikasi
    Then Test154 Validasi Label Halaman Verifikasi
    And Test154 Menginput <data> Valid
    And Test154 Mencari Data Valid
    And Test154 Menginput Data Valid Kembali
    And Test154 Mencari Data Valid Kembali
    Then Test154 Validasi Data Yang Dicari

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |

  Scenario: Test155 Testing Pencarian Data Empty Web Table Verifikasi
    When Test155 Klik Navbar Verifikasi
    Then Test155 Validasi Label Halaman Verifikasi
    And Test155 Menginput Empty String
    And Test155 Mencari Empty String
    And Test155 Menginput Empty String Kembali
    And Test155 Mencari Empty String Kembali
    Then Test155 Validasi Banyak Data

  Scenario: Test156 Testing Pencarian Case inconsistent Web Table Verifikasi
    When Test156 Klik Navbar Verifikasi
    Then Test156 Validasi Label Halaman Verifikasi
    And Test156 Merubah <data> Menjadi Case inconsistent
    And Test156 Menginput Data Case inconsistent
    And Test156 Mencari Data Case inconsistent
    And Test156 Menginput Data Case inconsistent Kembali
    And Test156 Mencari Data Case inconsistent Kembali
    Then Test156 Validasi Data Case inconsistent
    Examples:
      | data |
      | Nama Customer |
      | Nama Customer |
      | Reference ID  |
      | Reference ID  |

  Scenario: Test157 Testing Pencarian Partial Match Web Table Verifikasi
    When Test157 Klik Navbar Verifikasi
    Then Test157 Validasi Label Halaman Verifikasi
    And Test157 Merubah <data> Menjadi Partial Match
    And Test157 Menginput Data Partial Match
    And Test157 Mencari Data Partial Match
    And Test157 Menginput Data Partial Match Kembali
    And Test157 Mencari Data Partial Match Kembali
    Then Test157 Validasi Data Partial Match
    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |


  Scenario: Test158 Testing Menampilkan Banyak Entries Data Web Table Verifikasi
    When Test158 Klik Navbar Verifikasi
    Then Test158 Validasi Label Halaman Verifikasi
    And Test158 Pilih Option Show Entries <data>
    Then Test158 Validasi Banyak Data Yang Ditampilkan

    Examples:
      | data |
      | 10  |
      | 25  |
      | 50  |
      | 100  |