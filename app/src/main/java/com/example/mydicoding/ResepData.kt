package com.example.mydicoding

object ResepData {
    private val data = arrayOf(
        arrayOf(
            "Ayam goreng kecap",
            "infokuliner.com",
            "Ayam goreng kecap merupakan sajian ayam yang gurih dan lembut. ",
            "- 500gr Daging ayam, dipotong beberapa bagian \n- 6sdm Kecap Manis \n- 3 butir bawang merah, di iris \n- 100ml Air \n- 1/2sdt merica \n- 2 buah jeruk nipis \n- 3 siung bawang putih, di iris \n- 1/2sdt garam \n- Minyak goreng secukupnya",
            "1. Langkah pertama untuk mengaplikasikan resep ayam goreng kecap adalah mengolah daging ayam yang akan Anda gunakan. Pertama, peraslah 2 buah jeruk nipis untuk mendapatkan air perasan jeruk nipis. Kemudian rendamlah daging ayam Anda didalam air perasan jeruk nipis. Kemudian biarkan selama kurang lebih 10 menit. Sisihkan. \\n2. Setelah 10 menit, angkat ayam dari dalam air perasan jeruk nipis dan goreng daging ayam di dalam minyak panas hingga matang dan warnanya berubah menjadi kecokelatan. Angkat dan tiriskan. \\n3. Di dalam wajan yang berbeda, masukkan bawang putih dan bawang merah. Tumis kedua bawang hingga mengeluarkan bau yang harum. Setelah itu, masukkan air dan masukkan potogan ayam yang telah Anda goreng sebelumnya. \\n4. Masukkan garam dan merica, kemudian masukkan juga kecap. Aduk semua bahan hingga merata, terutama pada bagian ayamnya. Pastikan kecap dan bumbu lainnya menyerap ke dalam daging ayam. Masak hingga daging ayam matang. \\n5. Setelah daging ayam matang, atau jika kuah sudah menyusut, angkat ayam dan tiriskan. Sajikan di atas piring cantik dan sajikan dengan sepiring nasi hangat.",
            "https://infokuliner.com/wp-content/uploads/2015/05/89.-ayam-goreng-kecap_zfk5nf-1024x682.jpg"
        ),
        arrayOf(
            "Nasi Goreng Kampung",
            "www.fimela.com",
            "Penampilan boleh sederhana, tetapi resep Nasi Goreng Kampung yang satu ini harus Anda coba.",
            "- 150gram nasi putih / sepiring nasi putih \n- 1 butir telur ayam, kocok lepas, buat orak arik \n- 1 siung bawang putih, cincang halus \n- 2 butir bawang merah, iris halus \n- 1 buah cabai rawit, iris \n- 1/2 sdt terasi yang sudah disangrai sebentar \n- 1 sdt kecap manis \n- Garam secukupnya \n- Merica secukupnya \n- Potongan wortel dadu jika Anda suka \n- Jagung manis jika Anda suka \n- Potongan daging ayam atau cumi jika Anda suka \n- Mentega secukupnya",
            "1. Panaskan mentega, tumis bawang putih dan bawang merah hingga harum. Tambahkan cabai rawit.\n2. Masukkan daging ayam, jagung manis dan wortel, masak hingga matang.\n3. Masukkan nasi putih dan telur, aduk rata.\n4. Masukkan terasi, merica, kecap manis dan garam. Masak hingga nasi goreng matang.\n5. Sajikan hangat dengan irisan timun dan taburan bawang goreng.",
            "https://img-global.cpcdn.com/003_recipes/8920e5f6941cd53a/640x640sq70/photo.jpg"
        ),
        arrayOf(
            "Orek Tempe",
            "www.idntimes.com",
            "Masakan sederhana dengan bahan Tempe yang sangat cocok dimakan bersama nasi putih.",
            "- Tempe 500gr \n- Lengkuas 2 siung (kupas kulit-nya) \n- 1 Lembar daun salam \n- Kecap manis secukupnya \n- Gula secukupnya \n- Garam secukupnya \n- Penyedap rasa secukupnya \n- Minyak goreng secukupnya",
            "1. Potong kecil-kecil tempe berbentuk dadu. \n2. Tumis bawang putih dengan minyak goreng sampai harum. Masukkan daun salam dan lengkuas, lalu tumis kembali sampai berubah warna. \n3. Setelah matang, masukkan tempe, gula, garam, penyedap rasa, dan kecap. Tumis hingga tercampur merata. \n4. Tambahkan air secukupnya, lalu tunggu sampai matang. \n5. Orek tempe pun siap dihidangkan.",
            "https://cdn.idntimes.com/content-images/post/20181123/3-e86b4f247d1a1bdca696b87001da55d7.jpg"
        )
    )

    val listData: ArrayList<Resep>
        get(){
           val list = arrayListOf<Resep>()
            for (aData in data) {
                val resep = Resep()
                resep.resepName = aData[0]
                resep.resepSource = aData[1]
                resep.resepDesc = aData[2]
                resep.resepIng = aData[3]
                resep.resepDo = aData[4]
                resep.resepPhoto = aData[5]

                list.add(resep)
            }
            return list
        }
}