Feature: Login Positif Verifikator Dan Finance

  Scenario: Test002 Login Verifikator Dengan Username Dan Password Yang Valid
    When Test002 Membuka Halaman Login
    And Test002 Clear Field username dan password
    And Test002 Input TextField User <username> Yang Valid
    And Test002 Input TextField Pass <password> Yang Valid
    And Test002 Klik Tombol Login
    Then Test002 Validasi Label Halaman Home
    When Test002 Tekan Tombol Logout
    Then Test002 Validasi Label Halaman Login

    Examples:
      | username | password |
      | feriansyah2  | aa |

  Scenario: Test003 Login Finance Dengan Username Dan Password Yang Valid
    When Test003 Clear Field username dan password
    And Test003 Input TextField User <username> Yang Valid
    And Test003 Input TextField Pass <password> Yang Valid
    And Test003 Klik Tombol Login
    Then Test003 Validasi Label Halaman Home
    When Test003 Tekan Tombol Logout
    Then Test003 Validasi Label Halaman Login

    Examples:
      | username | password |
      | feriansyah  | a |