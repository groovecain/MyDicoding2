package com.example.mydicoding

object ResepData {
    private val data = arrayOf(
        arrayOf(
            "Ayam goreng kecap",
            "Ayam goreng kecap merupakan sajian ayam yang digoreng lalu diberikan saus kecap yang manis. Kecap akan sangat cocok jika disajikan bersama daging ayam goreng yang gurih dan lembut. ",
            "https://infokuliner.com/wp-content/uploads/2015/05/89.-ayam-goreng-kecap_zfk5nf-1024x682.jpg",
            "https://infokuliner.com",
            "- 500gr Daging ayam, dipotong beberapa bagian \n- 6sdm Kecap Manis \n- 3 butir bawang merah, di iris \n- 100ml Air \n- 1/2sdt merica \n- 2 buah jeruk nipis \n- 3 siung bawang putih, di iris \n- 1/2sdt garam \n- Minyak goreng secukupnya",
            "1. Langkah pertama untuk mengaplikasikan resep ayam goreng kecap adalah mengolah daging ayam yang akan Anda gunakan. Pertama, peraslah 2 buah jeruk nipis untuk mendapatkan air perasan jeruk nipis. Kemudian rendamlah daging ayam Anda didalam air perasan jeruk nipis. Kemudian biarkan selama kurang lebih 10 menit. Sisihkan. \\n2. Setelah 10 menit, angkat ayam dari dalam air perasan jeruk nipis dan goreng daging ayam di dalam minyak panas hingga matang dan warnanya berubah menjadi kecokelatan. Angkat dan tiriskan. \\n3. Di dalam wajan yang berbeda, masukkan bawang putih dan bawang merah. Tumis kedua bawang hingga mengeluarkan bau yang harum. Setelah itu, masukkan air dan masukkan potogan ayam yang telah Anda goreng sebelumnya. \\n4. Masukkan garam dan merica, kemudian masukkan juga kecap. Aduk semua bahan hingga merata, terutama pada bagian ayamnya. Pastikan kecap dan bumbu lainnya menyerap ke dalam daging ayam. Masak hingga daging ayam matang. \\n5. Setelah daging ayam matang, atau jika kuah sudah menyusut, angkat ayam dan tiriskan. Sajikan di atas piring cantik dan sajikan dengan sepiring nasi hangat."
        ),
        arrayOf(
                "Ayam goreng kecap",
        "Ayam goreng kecap merupakan sajian ayam yang digoreng lalu diberikan saus kecap yang manis. Kecap akan sangat cocok jika disajikan bersama daging ayam goreng yang gurih dan lembut. ",
        "https://infokuliner.com/wp-content/uploads/2015/05/89.-ayam-goreng-kecap_zfk5nf-1024x682.jpg",
        "https://infokuliner.com",
        "- 500gr Daging ayam, dipotong beberapa bagian \n- 6sdm Kecap Manis \n- 3 butir bawang merah, di iris \n- 100ml Air \n- 1/2sdt merica \n- 2 buah jeruk nipis \n- 3 siung bawang putih, di iris \n- 1/2sdt garam \n- Minyak goreng secukupnya",
        "1. Langkah pertama untuk mengaplikasikan resep ayam goreng kecap adalah mengolah daging ayam yang akan Anda gunakan. Pertama, peraslah 2 buah jeruk nipis untuk mendapatkan air perasan jeruk nipis. Kemudian rendamlah daging ayam Anda didalam air perasan jeruk nipis. Kemudian biarkan selama kurang lebih 10 menit. Sisihkan. \\n2. Setelah 10 menit, angkat ayam dari dalam air perasan jeruk nipis dan goreng daging ayam di dalam minyak panas hingga matang dan warnanya berubah menjadi kecokelatan. Angkat dan tiriskan. \\n3. Di dalam wajan yang berbeda, masukkan bawang putih dan bawang merah. Tumis kedua bawang hingga mengeluarkan bau yang harum. Setelah itu, masukkan air dan masukkan potogan ayam yang telah Anda goreng sebelumnya. \\n4. Masukkan garam dan merica, kemudian masukkan juga kecap. Aduk semua bahan hingga merata, terutama pada bagian ayamnya. Pastikan kecap dan bumbu lainnya menyerap ke dalam daging ayam. Masak hingga daging ayam matang. \\n5. Setelah daging ayam matang, atau jika kuah sudah menyusut, angkat ayam dan tiriskan. Sajikan di atas piring cantik dan sajikan dengan sepiring nasi hangat."
        )
    )

    val listData: ArrayList<Resep>
        get(){
           val list = arrayListOf<Resep>()
            for (aData in data) {
                val resep = Resep()
                resep.namaResep = aData[0]
                resep.descResep = aData[1]
                resep.foodPhotos = aData[2]
                resep.sumber = aData[3]
                resep.bahan = aData[4]
                resep.resepDo = aData[5]
            }
            return list
        }
}