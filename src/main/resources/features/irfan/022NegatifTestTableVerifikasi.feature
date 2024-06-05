Feature: Negatif Test Table Verifikasi

  Scenario: Test161 Testing Pencarian Data Invalid Web Table Verifikasi
    When Test161 Klik Navbar Verifikasi
    Then Test161 Validasi Label Halaman Verifikasi
    And Test161 Menginput <data> Invalid
    And Test161 Mencari Data Invalid
    And Test161 Menginput Data invalid Kembali
    And Test161 Mencari Data Invalid Kembali
    Then Test161 Validasi Data Invalid

    Examples:
      | data |
      | Valentinus Nurdiansyah |
      | Danang Kusumawardhana |
      | Pradipta Candrawijaya |
      | Yudhistira Wijanarko |
      | Bagas Kusumawardhana |

  Scenario: Test163 Testing Pencarian Data Valid Dengan Banyak Spasi Di Depan Web Table Verifikasi
    When Test163 Klik Navbar Verifikasi
    Then Test163 Validasi Label Halaman Verifikasi
    And Test163 Menginput <data> Valid Dengan Spasi Di Depan
    And Test163 Mencari Data Valid Dengan Spasi Di Depan
    And Test163 Menginput Data Valid Dengan Spasi Di Depan Kembali
    And Test163 Mencari Data Valid Dengan Spasi Di Depan Kembali
    Then Test163 Validasi Data Valid Dengan Spasi Di Depan

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |

  Scenario: Test165 Testing Pencarian Data Valid Dengan Banyak Spasi Di Belakang Web Table Verifikasi
    When Test165 Klik Navbar Verifikasi
    Then Test165 Validasi Label Halaman Verifikasi
    And Test165 Menginput <data> Valid Dengan Banyak Spasi Di Belakang
    And Test165 Mencari Data Valid Dengan Banyak Spasi Di Belakang
    And Test165 Menginput Data Valid Dengan Banyak Spasi Di Belakang Kembali
    And Test165 Mencari Data Valid Dengan Banyak Spasi Di Belakang Kembali
    Then Test165 Validasi Data Valid Dengan Spasi Di Belakang

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |
      | Reference ID  |