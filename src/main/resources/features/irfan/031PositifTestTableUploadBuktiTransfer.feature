Feature: Positif Test Table Upload Bukti Transfer

  Scenario: Test231 Testing Pencarian Data Valid Web Table Upload Bukti Transfer
    When Test231 Klik Navbar Upload Bukti Transfer
    Then Test231 Validasi Label Halaman Upload Bukti Transfer
    And Test231 Menginput <data> Valid
    And Test231 Mencari Data Valid
    And Test231 Menginput Data Valid Kembali
    And Test231 Mencari Data Valid Kembali
    Then Test231 Validasi Data Yang Dicari

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |

  Scenario: Test233 Testing Pencarian Data Empty Web Table Upload Bukti Transfer
    When Test233 Klik Navbar Upload Bukti Transfer
    Then Test233 Validasi Label Halaman Upload Bukti Transfer
    And Test233 Menginput Empty String
    And Test233 Mencari Empty String
    And Test233 Menginput Empty String Kembali
    And Test233 Mencari Empty String Kembali
    Then Test233 Validasi Banyak Data

  Scenario: Test235 Testing Pencarian Case inconsistent Web Table Upload Bukti Transfer
    When Test235 Klik Navbar Upload Bukti Transfer
    Then Test235 Validasi Label Halaman Upload Bukti Transfer
    And Test235 Merubah <data> Menjadi Case inconsistent
    And Test235 Menginput Data Case inconsistent
    And Test235 Mencari Data Case inconsistent
    And Test235 Menginput Data Case inconsistent Kembali
    And Test235 Mencari Data Case inconsistent Kembali
    Then Test235 Validasi Data Case inconsistent
    Examples:
      | data |
      | Nama Customer |
      | Nama Customer |
      | Reference ID  |
      | Reference ID  |
      | Reference ID  |

  Scenario: Test237 Testing Pencarian Partial Match Web Table Upload Bukti Transfer
    When Test237 Klik Navbar Upload Bukti Transfer
    Then Test237 Validasi Label Halaman Upload Bukti Transfer
    And Test237 Merubah <data> Menjadi Partial Match
    And Test237 Menginput Data Partial Match
    And Test237 Mencari Data Partial Match
    And Test237 Menginput Data Partial Match Kembali
    And Test237 Mencari Data Partial Match Kembali
    Then Test237 Validasi Data Partial Match
    Examples:
      | data |
      | Nama Customer  |
      | Nama Customer  |
      | Reference ID  |
      | Reference ID  |


  Scenario: Test238 Testing Menampilkan Banyak Entries Data Web Table Upload Bukti Transfer
    When Test238 Klik Navbar Upload Bukti Transfer
    Then Test238 Validasi Label Halaman Upload Bukti Transfer
    And Test238 Pilih Option Show Entries <data>
    Then Test238 Validasi Banyak Data Yang Ditampilkan

    Examples:
      | data |
      | 10  |
      | 25  |
      | 50  |
      | 100  |