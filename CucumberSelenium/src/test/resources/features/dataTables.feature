Feature: DataTable Usage

#  Datatable lar parametre olarak gonderilecekleri step in altina yazilirlar.
#  Scenario Outline aksine tek bir kere step tetiklenir ve tum data tek seferde step e verilir.


  Scenario: Datatable

    Given Asagidaki tablo bu methodda parametre olarak kullanilacaktir
      |name|surname|number|
      |Karl|Ortis  |123   |
      |Ali |Osman  |073109|
      |Vedat|CW    |073150|