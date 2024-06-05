Feature: Positif Test Table Pre Transfer

  Scenario: Test201 Testing Pencarian Data Valid Web Table Pre Transfer
    When Test201 Klik Navbar Pre Transfer
    Then Test201 Validasi Label Halaman Pre Transfer
    And Test201 Menginput <data> Valid
    And Test201 Mencari Data Valid
    Then Test201 Validasi Data Yang Dicari

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |

  Scenario: Test203 Testing Pencarian Data Empty Web Table Pre Transfer
    When Test203 Klik Navbar Pre Transfer
    Then Test203 Validasi Label Halaman Pre Transfer
    And Test203 Menginput Empty String
    And Test203 Mencari Empty String
    Then Test203 Validasi Banyak Data

  Scenario: Test205 Testing Pencarian Case inconsistent Web Table Pre Transfer
    When Test205 Klik Navbar Pre Transfer
    Then Test205 Validasi Label Halaman Pre Transfer
    And Test205 Merubah <data> Menjadi Case inconsistent
    And Test205 Menginput Data Case inconsistent
    And Test205 Mencari Data Case inconsistent
    Then Test205 Validasi Data Case inconsistent
    Examples:
      | data |
      | Nama Customer |
      | Nama Customer |
      | Reference ID  |
      | Reference ID  |
      | Reference ID  |

  Scenario: Test207 Testing Pencarian Partial Match Web Table Pre Transfer
    When Test207 Klik Navbar Pre Transfer
    Then Test207 Validasi Label Halaman Pre Transfer
    And Test207 Merubah <data> Menjadi Partial Match
    And Test207 Menginput Data Partial Match
    And Test207 Mencari Data Partial Match
    Then Test207 Validasi Data Partial Match
    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | Reference ID  |
      | Reference ID  |


  Scenario: Test208 Testing Menampilkan Banyak Entries Data Web Table Pre Transfer
    When Test208 Klik Navbar Pre Transfer
    Then Test208 Validasi Label Halaman Pre Transfer
    And Test208 Pilih Option Show Entries <data>
    Then Test158 Validasi Banyak Data Yang Ditampilkan

    Examples:
      | data |
      | 10  |
      | 25  |
      | 50  |
      | 100  |

  Scenario: Test209 Testing Export Excel Table Pre Transfer
    When Test209 Klik Navbar Pre Transfer
    Then Test209 Validasi Label Halaman Pre Transfer
    And Test209 Klik Tombol Export Excel <data>
    Then Test209 Validasi Banyak Data Yang Ditampilkan
    When Test209 Klik Navbar Logout
    And Test209 Clear Field username dan password
    And Test209 Input TextField User <username> Yang Valid
    And Test209 Input TextField Pass <password> Yang Valid
    And Test209 Klik Tombol Login
    Then Test209 Validasi Label Halaman Home
    When Test209 Klik Navbar Finance
    Then Test209 Validasi Label Halaman Finance
    And Test209 Input Data Dari Finance Di Pencarian
    And Test209 Mencari Data Dari Finance
    And Test209 Input Data Dari Finance Kembali
    And Test209 Mencari Data Dari Finance Kembali
    Then Test209 Validasi Data


    Examples:
      | username  | password | data |
      | feriansyah  | a  | Nama Customer  |
