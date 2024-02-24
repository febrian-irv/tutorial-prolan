#### Nama: Febrian Irvansyah
#### NPM: 2206083584
#### Kelas: Pemrograman Lanjut C

# Refleksi

## Module 1
<details>
<summary>Click for more detail</summary>
<br>
  
### Refleksi 1
Selama membuat code saya sering kali saya berpikir "yang penting programnya jalan" setelah adanya modul ini saya berusaha untuk menerapkan clean code. Salah satu miskonsepsi yang sering saya kira benar adalah clean code == banyak comment. Namun, setelah ini saya menyadari bahwa lebih baik memiliki nama variable yang deskriptif dan hal tersebut yang saya usahakan pada saat membuat program ini. Kesalahan yang mungkin masih saya lakukan adalah kode saya yang masih belum terlalu rapi dan penamaan yang mungkin masih sulit untuk dipahami untuk orang lain dan saya masih perlu pembiasaan.

prinsip clean code yang telah saya terapkan:
- Penamaan yang deskriptif
- Fungsi yang singkat dan jelas
- Memastikan variabel pada class terenkapsulasi dengan menyesuaikan access modifier
- Implementasi interface
- Penggunaan Object

### Refleksi 2

1. Dengan adanya unit test saya merasa terbantu karena dapat mencoba kode yang telah saya buat secara otomatis. Menurut saya, banyaknya unit test pada satu class sangat bergantung pada berapa banyak kode khususnya fungsi yang terdapat dalam suatu class. Oleh karena itu, sebaiknya unit test dapat menguji setiap fungsi yang ada pada program tersebut. Menuru saya untuk yakin bahwa unit test sudah cukup untuk verifikasi program adalah dengan memasukkan test untuk setiap fungsi dan memperhatikan case-case yang mungkin terjadi. Namun, walaupun coverage sudah 100% belum tentu akan terbebas dari error karena pada input user akan sangat banyak kemungkinan yang terjadi.
2. Menurut saya akan tidak sesuai dengan prinsip clean code. Karena pada clean code kita harus mengurangi pengulangan agar tidak membuat sebuah program yang berisi kode redundan dan memperbesar ukuran. Tentu saja ini akan mengurangi kualitas dari kode. Untuk memperbagus sebaiknya unit test yang mirip di letakkan pada class yang sama saja sekaligus agar terlihat adanya pengelompokan. Selain itu, untuk mengatasi redundansi maka dapat menggunakan @BeforeEach dan setUp agar tiap sebelum tes kode tersebut akan dijalankan tanpa harus ditulis berkali-kali
</details>

## Module 2
<details>
<summary>Click for more detail</summary>
<br>

1. Saya mencoba untuk memperbaiki issue terkait dengan "Security" yang ditunjukkan oleh scorecard. Strategi yang saya lakukan adalah dengan mengikuti saran dari scorecard itu sendiri. Untuk memiliki dokumentasi terkait security yang baik maka diperlukan email sebagai narahubung jika terdapat vulnerability. Selain itu juga diperlukan keyword-keyword yang memiliki hubungan dengan vulnerability. Dokumentasi itu sendiri disimpan dalam format markdown dengan nama "SECURITY.md" untuk mempermudah pengguna untuk mengidentifikasi aturan atau informasi terkait keamanan pada program.
2. Sudah walaupun implementasi yang saya lakukan sendiri masih ada kekurangan. Proses CI sendiri adalah proses automasi dalam melakukan build serta testing pada program yang telah diupdate dan proses CD adalah proses delivery secara terus-menerus setiap ada update pada program. Oleh karena itu, workflows yang saya kerjakan telah memenuhi kedua hal tersebut. Untuk CI, terlihat adanya workflow ci dan scorecard yang melakukan testing pada program untuk memastikan kelancaran program. Untuk CD, terlihat adanya workflow koyeb-deploy yang dijalankan setiap update pada program.

</details>

## Module 3
<details>
<summary>Click for more detail</summary>
<br>

1. Explain what principles you apply to your project!
- Single Responsibility Principle
Menurut principle ini, setiap classs diharuskan untuk hanya memiliki satu tanggung jawab sehingga dalam satu class tidak boleh terdapat fungsi yang berhubungan dengan keperluan pada class lain. Contohnya yangterjadi adalah class Car yang terletak pada class Product sehingga dilakukan pemisahan class. Dengan cara ini akan meningkatkan clarity dari kode serta pengaksesan fungsi pada class tersebut lebih jelas dan mudah untuk di maintain.
- Interface Segregation Principle
Menurut principle ini, dalam membuat interface harus lebih dispesifikan terhadap class yang harus digunakan. Oleh karena itu, pada projek ini diimplementasikan pemisahan carService dan productService. Dengan pengimplentasian tersebut, maka setiap class dari interface akan digunakan dan menghindari adanya fungsi yang nganggur ataupun fungsi yang tidak perlu pengimplementsiannya.
- Open-Closed Principle
Menurut Principle ini, suatu class sebaiknya bisa di extend tanpa melakukan modifikasi pada class tersebut. Oleh karena itu, dilakukan pengubahan dalam ekstensi untuk tidak menggunakan class implementation dalam mengextend melainkan menggunakan interface yang sudah sediakan agar tidak terjadi modifikasi.

2. Explain the advantages of applying SOLID principles to your project with examples.
- Dengan menggunakan SRP maka code akan lebih maintainable. Selain itu, dengan pemisahan class memudahkan untuk memisahkan kepentingan sehingga tidak mempengaruhi class lain.
- Dengan menggunakan ISP maka pengguna hanya melihat hasil implementasi dari fungsi yang diperlukan saja, contohnya jika suatu class terdapat kemiripan tetapi terdapat implementasi yang berbeda.
- Dengan OCP maka akan menghindari perubahan pada code yang rentan menyebabkan error.

3. Explain the disadvantages of not applying SOLID principles to your project with examples.
Dengan tidak menerapkan SOLID akan pada projek ini akan menyulitkan  dalam memaintain code dan mendebug. Contohnya adalah jika class CarController berada di dalam ProductController maka beban untuk memeriksa kebenaran kode lebih besar karena memeriksa 2 hal sekaligus. Namun, dengan adanya pemisahan maka ada seperation of concern. Lalu contoh untuk ISP adalah dengan tidak merapkan ini kita berkemungkinan untuk tetap menjalankan fungsi/method yang tidak diperlukan pada kelas tersebut sehingga code menjadi tidak efektif. Untuk OCP, jika tidak dilakukan maka ada kemungkinan tidak sengaja memodifikasi yang memperbersar kemungkinan adanya bug.
</details>
