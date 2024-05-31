Feature: Login Negatif Test

#  Valid username: TestUser
#  Valid password: TestUser123

  Scenario: Test006 Login Akun Username Dan Password Empty String
    When Test006 Clear Field Username Dan Password
    And Test006 Input Field Username Empty String
    And Test006 Input Field Password Empty String
    And Test006 Klik Tombol Login
    Then Test006 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik

  Scenario: Test007 Login Akun Username Valid dan Password Empty String
    When Test007 Clear Field Username Dan Password
    And Test007 Input Field User <username> Yang Valid
    And Test007 Input Field Password Empty String
    And Test007 Klik Tombol Login
    Then Test007 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  |  |

  Scenario: Test008 Login Akun Username Empty String dan Password valid
    When Test008 Clear Field Username Dan Password
    And Test008 Input Field Username Empty String
    And Test008 Input Field <password> Yang Valid
    And Test008 Klik Tombol Login
    Then Test008 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      |          | TestUser123        |

  Scenario: Test009 Login Akun Username dan Password Tidak Valid
    When Test009 Clear Field Username Dan Password
    And Test009 Input Field User <username> Tidak Valid
    And Test009 Input Field Pass <password> Tidak Valid
    And Test009 klik Tombol Login
    Then Test009 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | Test_invalid  | Test_invalid123 |

  Scenario: Test010 Login Akun Username Valid dan Password Tidak Valid
    When Test010 Clear Field Username Dan Password
    And Test010 Input Field User <username> Valid
    And Test010 Input Field Pass <password> Tidak Valid
    And Test010 Klik Tombol Login
    Then Test010 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | Test_invalid123 |

  Scenario: Test011 Login Akun Username Tidak Valid dan Password Valid
    When Test011 Clear Field Username Dan Password
    And Test011 Input Field User <username> Tidak Valid
    And Test011 Input Field Pass <password> Valid
    And Test011 klik Tombol Login
    Then Test011 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | Test_invalid  | TestUser123 |

  Scenario: Test012 Login Akun Username Empty dan Password Tidak valid
    When Test012 Clear Field Username Dan Password
    And Test012 Input Field Username Empty String
    And Test012 Input Field Pass <password> Tidak Valid
    And Test012 klik Tombol Login
    Then Test012 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      |   | Test_invalid123 |

  Scenario: Test013 Login Akun Username Tidak Valid dan Password Empty
    When Test013 Clear Field Username Dan Password
    And Test013 Input Field User <username> Tidak Valid
    And Test013 Input Field Password Empty String
    And Test013 klik Tombol Login
    Then Test013 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | Test_invalid  |  |

  Scenario: Test014 Login Akun Username dan Password Huruf Besar
    When Test014 Clear Field Username Dan Password
    And Test014 Input Field User <username> Huruf Besar
    And Test014 Input Field Pass <password> Huruf Besar
    And Test014 klik Tombol Login
    Then Test014 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TEST_USER  | TESTUSER123 |

  Scenario: Test015 Login Akun Username Valid dan Password Huruf Besar
    When Test015 Clear Field Username Dan Password
    And Test015 Input Field User <username> Valid
    And Test015 Input Field Pass <password> Huruf Besar
    And Test015 klik Tombol Login
    Then Test015 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TESTUSER123 |

  Scenario: Test016 Login Akun Username Huruf Besar dan Password Valid
    When Test016 Clear Field Username Dan Password
    And Test016 Input Field User <username> Huruf Besar
    And Test016 Input Field Pass <password> Valid
    And Test016 klik Tombol Login
    Then Test016 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TESTUSER  | TestUser123 |

  Scenario: Test017 Login Akun Username dan Password Huruf Kecil
    When Test017 Clear Field Username Dan Password
    And Test017 Input Field User <username> Huruf Kecil
    And Test017 Input Field Pass <password> Huruf Kecil
    And Test017 klik Tombol Login
    Then Test017 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | testuser | testuser123 |

  Scenario: Test018 Login Akun Username Valid dan Password Huruf Kecil
    When Test018 Clear Field Username Dan Password
    And Test018 Input Field User <username> Valid
    And Test018 Input Field Pass <password> Huruf Kecil
    And Test018 klik Tombol Login
    Then Test018 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | testuser123 |

  Scenario: Test019 Login Akun Username Huruf Kecil dan Password Valid
    When Test019 Clear Field Username Dan Password
    And Test019 Input Field User <username> Huruf Kecil
    And Test019 Input Field Pass <password> Valid
    And Test019 klik Tombol Login
    Then Test019 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | testuser  | TestUser123 |

  Scenario: Test020 Login Akun Username dan Password Dengan Spasi Di Depan
    When Test020 Clear Field Username Dan Password
    And Test020 Input Field User <username> Dengan Spasi Di Depan
    And Test020 Input Field Pass <password> Dengan Spasi Di Depan
    And Test020 klik Tombol Login
    Then Test020 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TestUser123 |

  Scenario: Test021 Login Akun Username Dengan Spasi Di Depan dan Password Valid
    When Test021 Clear Field Username Dan Password
    And Test021 Input Field User <username> Dengan Spasi Di Depan
    And Test021 Input Field Pass <password> Valid
    And Test021 klik Tombol Login
    Then Test021 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TestUser123 |

  Scenario: Test022 Login Akun Username Valid dan Password Dengan Spasi Di Depan
    When Test022 Clear Field Username Dan Password
    And Test022 Input Field User <username> Valid
    And Test022 Input Field Pass <password> Dengan Spasi Di Depan
    And Test022 klik Tombol Login
    Then Test022 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TestUser123 |

  Scenario: Test023 Login Akun Username dan Password Dengan Spasi Di Belakang
    When Test023 Clear Field Username Dan Password
    And Test023 Input Field User <username> Dengan Spasi Di Belakang
    And Test023 Input Field Pass <password> Dengan Spasi Di Belakang
    And Test023 klik Tombol Login
    Then Test023 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TestUser123 |

  Scenario: Test024 Login Akun Username Dengan Spasi Di Belakang dan Password Valid
    When Test024 Clear Field Username Dan Password
    And Test024 Input Field User <username> Dengan Spasi Di Belakang
    And Test024 Input Field Pass <password> Valid
    And Test024 klik Tombol Login
    Then Test024 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TestUser123 |

  Scenario: Test025 Login Akun Username Valid dan Password Dengan Spasi Di Belakang
    When Test025 Clear Field Username Dan Password
    And Test025 Input Field User <username> Valid
    And Test025 Input Field Pass <password> Dengan Spasi Di Belakang
    And Test025 klik Tombol Login
    Then Test025 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Examples:

      | username | password |
      | TestUser  | TestUser123 |


