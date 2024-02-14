#### Nama: Febrian Irvansyah
#### NPM: 2206083584
#### Kelas: Pemrograman Lanjut C

# Refleksi

## Module 1
<details>
<summary>Click for more detail</summary>
<br>

Selama membuat code saya sering kali saya berpikir "yang penting programnya jalan" setelah adanya modul ini saya berusaha untuk menerapkan clean code. Salah satu miskonsepsi yang sering saya kira benar adalah clean code == banyak comment. Namun, setelah ini saya menyadari bahwa lebih baik memiliki nama variable yang deskriptif dan hal tersebut yang saya usahakan pada saat membuat program ini. Kesalahan yang mungkin masih saya lakukan adalah kode saya yang masih belum terlalu rapi dan penamaan yang mungkin masih sulit untuk dipahami untuk orang lain dan saya masih perlu pembiasaan.

prinsip clean code yang telah saya terapkan:
- Penamaan yang deskriptif
- Fungsi yang singkat dan jelas
- Memastikan variabel pada class terenkapsulasi dengan menyesuaikan access modifier
- Implementasi interface
- Penggunaan Object

# Refleksi 2

1. Dengan adanya unit test saya merasa terbantu karena dapat mencoba kode yang telah saya buat secara otomatis. Menurut saya, banyaknya unit test pada satu class sangat bergantung pada berapa banyak kode khususnya fungsi yang terdapat dalam suatu class. Oleh karena itu, sebaiknya unit test dapat menguji setiap fungsi yang ada pada program tersebut. Menuru saya untuk yakin bahwa unit test sudah cukup untuk verifikasi program adalah dengan memasukkan test untuk setiap fungsi dan memperhatikan case-case yang mungkin terjadi. Namun, walaupun coverage sudah 100% belum tentu akan terbebas dari error karena pada input user akan sangat banyak kemungkinan yang terjadi.
2. Menurut saya akan tidak sesuai dengan prinsip clean code. Karena pada clean code kita harus mengurangi pengulangan agar tidak membuat sebuah program yang berisi kode redundan dan memperbesar ukuran. Tentu saja ini akan mengurangi kualitas dari kode. Untuk memperbagus sebaiknya unit test yang mirip di letakkan pada class yang sama saja sekaligus agar terlihat adanya pengelompokan. Selain itu, untuk mengatasi redundansi maka dapat menggunakan @BeforeEach dan setUp agar tiap sebelum tes kode tersebut akan dijalankan tanpa harus ditulis berkali-kali
</details>
