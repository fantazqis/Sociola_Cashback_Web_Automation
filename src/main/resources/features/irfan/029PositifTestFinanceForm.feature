Feature: Positif Test Table Finance

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

  Scenario: Test154 Testing Pencarian Data Valid Web Table Finance
    When Test154 Klik Navbar Finance
    Then Test154 Validasi Label Halaman Verifikasi
    And Test154 Menginput Dan Mencari <data> Yang Dicari
    And Test154 Menginput Dan Mencari Data Yang Dicari Kembali
    Then Test154 Validasi Data Yang Dicari

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |

  Scenario: Test157 Testing Menampilkan Banyak Entries Data Web Table Finance
    When Test157 Klik Navbar Verifikasi
    Then Test157 Validasi Label Halaman Verifikasi
    And Test157 Pilih Option Show Entries <data>
    Then Test157 Validasi Banyak Data Yang Ditampilkan

    Examples:
      | data |
      | 10  |
      | 25  |
      | 50  |
      | 100  |
