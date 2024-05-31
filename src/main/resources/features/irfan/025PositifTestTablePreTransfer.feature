Feature: Positif Test Table Pre Transfer

  Scenario: Test183 Testing Pencarian Data Valid Web Table Pre Transfer
    When Test183 Klik Navbar Pre Transfer
    Then Test183 Validasi Label Halaman Verifikasi
    And Test183 Menginput Dan Mencari <data> Yang Dicari
    And Test183 Menginput Dan Mencari Data Yang Dicari Kembali
    Then Test183 Validasi Data Yang Dicari

    Examples:
      | data |
      | Nama Customer  |
      | Nomor Handphone  |
      | RRN  |

  Scenario: Test186 Testing Menampilkan Banyak Entries Data Web Table Pre Transfer
    When Test186 Klik Navbar Verifikasi
    Then Test186 Validasi Label Halaman Verifikasi
    And Test186 Pilih Option Show Entries <data>
    Then Test186 Validasi Banyak Data Yang Ditampilkan

    Examples:
      | data |
      | 10  |
      | 25  |
      | 50  |
      | 100  |

#  Scenario: Test159 Download File Excel Pre Transfer
#    When Test157 Klik Navbar Verifikasi
#    Then Test157 Validasi Label Halaman Verifikasi
#    And Test157 Pilih Option Show Entries <data>
#    Then Test157 Validasi Banyak Data Yang Ditampilkan
#
#    Examples:
#      | data |

  #  Scenario: Test159 validasi data yang dikirim
#    When Test157 Klik Navbar Verifikasi
#    Then Test157 Validasi Label Halaman Verifikasi
#    And Test157 Pilih Option Show Entries <data>
#    Then Test157 Validasi Banyak Data Yang Ditampilkan
#
#    Examples:
#      | data |