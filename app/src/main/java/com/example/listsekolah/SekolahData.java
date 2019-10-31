package com.example.listsekolah;

import java.util.ArrayList;

public class SekolahData {
    private static String[] sekolahNames = {
            "MA Al Hasaniyah Kedawon",
            "MA MATHOLI'UL HIKMAH",
            "MA NU 03 PEMARON BREBES",
            "MAN 1 BREBES",
            "MAN 2 BREBES",
            "MAS AL FALAH JATIROKEH",
            "MAS AL MA`ARIF",
            "MAS AL-HIKMAH 2",
            "MAS AL-HIKMAH I",
            "MAS ASSALAFIYAH"

    };
    private static String[] sekolahDetails = {
            "MA Al Hasaniyah Kedawon adalah salah satu Kabupaten di Provinsi Jawa Tengah, Indonesia. Luas wilayahnya 1.902,37 km², jumlah penduduknya sekitar 1.732.719 jiwa (2010). Ibu kotanya ada di Kecamatan Brebes. Brebes merupakan kabupaten dengan jumlah penduduk paling banyak di Jawa Tengah, dan paling luas di Jawa Tengah ke-2 setelah Kabupaten Cilacap.",
            "MA MATHOLI'UL HIKMAH adalah salah satu wilayah otonom di provinsi Jawa Tengah. Kota ini pernah menjadi cikal-bakal berdirinya Korps Marinir seperti tercatat dalam Pangkalan IV ALRI Tegal dengan nama Corps Mariniers, pada 15 November 1945. Kota Tegal berbatasan dengan Kabupaten Brebes di sebelah barat, Laut Jawa di sebelah utara, serta Kabupaten Tegal di sebelah selatan dan timur. Hari jadi Kota Tegal adalah 12 April 1580.",
            "MA NU 03 PEMARON BREBES adalah salah satu kabupaten yang terletak di bagian barat laut provinsi Jawa Tengah, Indonesia yang memiliki luas 876,10 km2.\n" +
                    "Pusat administrasinya dulu berada di Kota Tegal yang terletak di sudut barat laut kabupaten ini, tetapi kemudian Kota Tegal secara administratif terpisah dari kabupaten dan membentuk wilayah sendiri. Kemudian digantikan oleh Kota Slawi sebagai pusat adminitrasi Kabupaten Tegal hingga saat ini, yang merupakan pinggiran kota yang terletak sekitar 20 km dari selatan pusat kota dan dalam batas kabupaten.",
            "MAN 1 BREBES, (Carakan: Cirebon: Kita Cerbon) adalah salah satu kota yang berada di Provinsi Jawa Barat, Indonesia.\n" +
                    "\n" +
                    "Kota ini berada di pesisir utara Pulau Jawa atau yang dikenal dengan jalur pantura yang menghubungkan Jakarta-Cirebon-Semarang-Surabaya.",
            "MAN 2 BREBES adalah sebuah kabupaten di provinsi Jawa Tengah. Ibu kotanya adalah Kota Pemalang. Kabupaten ini berbatasan dengan Laut Jawa di utara, Kabupaten Pekalongan di timur, Kabupaten Purbalingga di selatan, serta Kabupaten Tegal di barat.",
            "MAS AL FALAH JATIROKEH adalah ibu kota Kabupaten Banyumas, Jawa Tengah, Indonesia. Jumlah penduduknya 292.782 jiwa pada tahun 2014 Berbagai julukan disandang kota di jalur selatan Jawa Tengah ini dari kota wisata, kota kripik, kota transit, kota pendidikan sampai kota pensiunan karena begitu banyaknya pejabat-pejabat negara yang pensiun dan akhirnya menetap di kota ini. Di kota ini pula terdapat museum Bank Rakyat Indonesia, karena bank pertama kali berdiri ada disini dan pendiri bank ini adalah Raden Bei Aria Wirjaatmadja putra daerah Purwokerto.",
            "MAS AL MA`ARIF (bahasa Jawa: translit. Kutha Pekalongan) adalah salah satu kota pusat pertumbuhan ekonomi di Jawa Tengah yang berbatasan dengan Laut Jawa di utara, Kabupaten Batang di timur, serta Kabupaten Pekalongan di sebelah selatan dan barat. Pekalongan terdiri atas 4 kecamatan, yakni Pekalongan Barat, Pekalongan Utara, Pekalongan Timur, dan Pekalongan Selatan.",
            "MAS AL-HIKMAH 2 (Hanacaraka: , Jawa: Kutha Semarang) adalah ibu kota Provinsi Jawa Tengah, Indonesia sekaligus kota metropolitan terbesar kelima di Indonesia sesudah Jakarta, Surabaya, Medan, dan Bandung.[3][4] Sebagai salah satu kota paling berkembang di Pulau Jawa, Kota Semarang mempunyai jumlah penduduk lebih dari 1,7 juta jiwa dan siang hari bisa mencapai 2 juta jiwa.",
            "MAS AL-HIKMAH 1 adalah wilayah tertua kedua di Indonesia setelah Jawa Timur, yang dibentuk oleh pemerintah negara bagian Indonesia. Daerah setingkat provinsi ini juga memiliki status istimewa atau otonomi khusus. Status ini merupakan sebuah warisan dari zaman sebelum kemerdekaan.",
            "MAS ASSALAFIYAH (Hanacaraka, Jawa: Kutha Surakarta), juga disebut Solo (ꦱꦭ ), adalah wilayah otonom dengan status Kota di bawah Provinsi Jawa Tengah, Indonesia, dengan penduduk 503.421 jiwa (2010) dan kepadatan 13.636/km2."

    };

    private static String[] Sejarah = {
            "Ada beberapa pendapat mengenai asal usul nama Brebes. Salah satu pendapat menyatakan bahwa nama Brebes berasal dari kata \"Bara\" dan \"Basah\", bara berarti hamparan tanah luas dan basah berarti banyak mengandung air. Keduanya cocok dengan keadaan daerah Brebes yang merupakan dataran luas yang berair. Karena perkataan bara di ucapkan bere sedangkan basah di ucapkan besah maka untuk mudahnya di ucapkan Brebes. Dalam Bahasa Jawa perkataan Brebes atau mbrebes berarti tansah metu banyune yang berarti selalu keluar airnya. Nama Brebes muncul sejak zaman Mataram. Kota ini berderet dengan kota-kota tepi pantai lainnya seperti Pekalongan, Pemalang, dan Tegal. Brebes pada saat itu merupakan bagian dari wilayah Kabupaten Tegal.\n" +
                    "\n" +
                    "Pada tanggal 17 Januari 1678 di Jepara diadakan pertemuan Adipati Kerajaan Mataram se Jawa Tengah, termasuk Arya Martalaya, Adipati Tegal dan Arya Martapura, Adipati Jepara. Karena tidak setuju dengan acara penandatanganan naskah kerjasama antara Amangkurat Admiral dengan Belanda terutama dalam menumpas pemberontakan Trunajaya dengan imbalan tanah-tanah milik Kerajaan Mataram, maka terjadi perang tanding antara kedua adipati tersebut. Peristiwa berdarah ini merupakan awal mula terjadinya Kabupaten Brebes dengan Bupati berwenang .Sehari setelah peristiwa berdarah tersebut yaitu tanggal 18 Januari 1678, Sri Amangkurat II yang berada di Jepara mengangkat beberapa Adipati/ Bupati sebagai pengagganti Adipati-adipati yang gugur. Untuk kabupaten Brebes di jadikan kabupaten mandiri dengan adipati Arya Suralaya yang merupakan adik dari Arya Martalaya. Pengangkatan Arya Suralaya sekaligus titimangsa pemecahan Kadipaten Tegal menjadi dua bagian yaitu Timur tetap disebut Kadipaten Tegal dan bagian barat di sebut Kabupaten Brebes.",
            "Penggunaan nama/kata Tegal mengacu kepada istilah tegalan, tetegil (ladang), atau nama sebuah desa yang pada mulanya adalah merupakan bagian dari Kabupaten Pemalang yang setia kepada trah Kerajaan Pajang.",
            "Nama Tegal berasal dari nama Tetegal, tanah subur yang mampu menghasilkan tanaman pertanian. Sumber lain menyatakan, nama Tegal dipercaya berasal dari kata Teteguall. Sebutan yang diberikan seorang pedagang asal Portugis yaitu Tome Pires yang singgah di Pelabuhan Tegal pada tahun 1500–an.\n" +
                    "\n" +
                    "Kabupaten Tegal berdiri pada tanggal 18 Mei 1601 pada saat Ki Gede Sebayu diangkat sebagai juru demung di Tegal oleh Sultan Mataram, dan mulai membangun daerah ini.",
            "Menurut Manuskrip Purwaka Caruban Nagari, pada abad 15 di pantai Laut Jawa ada sebuah desa nelayan kecil bernama Muara Jati. Pada waktu itu sudah banyak kapal asing yang datang untuk berniaga dengan penduduk setempat. Pengurus pelabuhan adalah Ki Gedeng Alang-Alang yang ditunjuk oleh penguasa Kerajaan Galuh (Pajajaran). Dan di pelabuhan ini juga terlihat aktivitas Islam semakin berkembang. Ki Gedeng Alang-Alang memindahkan tempat permukiman ke tempat permukiman baru di Lemahwungkuk, 5 km arah selatan mendekati kaki bukit menuju kerajaan Galuh. Sebagai kepala permukiman baru diangkatlah Ki Gedeng Alang-Alang dengan gelar Kuwu Cerbon.\n" +
                    "\n" +
                    "Pada Perkembangan selanjutnya, Pangeran Walangsungsang, putra Prabu Siliwangi ditunjuk sebagai Adipati Cirebon dengan Gelar Cakrabumi. Pangeran inilah yang mendirikan Kerajaan Cirebon, diawali dengan tidak mengirimkan upeti kepada Raja Galuh. Oleh karena itu Raja Galuh mengirimkan utusan ke Cirebon Untuk menanyakan upeti rebon terasi ke Adipati Cirebon, namun ternyata Adipati Cirebon berhasil meyakinkan para utusan atas kemerdekaan wilayah cirebon.",
            "Keberadaan manusia pada masa prasejarah di Pemalang dapat dibuktikan dengan berbagai temuan arkeologis. Di Kabupaten Pemalang bagian barat, ditemukan situs-situs megalitik,[2] sedangkan sebuah nekara perunggu ditemukan di Desa Kabunan.[3] Bukti arkeologis adanya unsur kebudayaan Hindu-Buddha di Pemalang antara lain ditemukannya patung Ganesha, lingga, kuburan, ambang pintu, dan batu nisan di Desa Lawangrejo dan Desa Banyumudal.[4]\n" +
                    "\n" +
                    "Selain itu, ada pula bukti arkeologis unsur kebudayaan Islam berupa makam-makam para penyebar agama, antara lain Syeikh Maulana Maghribi di Kawedanan Comal, Rohidin, dan Sayyid Ngali Murtala yaitu salah seorang kerabat Sunan Ngampel.",
            "Purwokerto Awal-awal abad XX. Pada suatu kota. Saat itu, babak baru dalam tata ruang tengah memasuki kota tersebut. Setiap jalan terlihat lebar. Pepohonan hijau nan rindang meneduhi para pejalan kaki ketika melintas di area pedestrian. Jalan-jalan terlihat asri. Sulit untuk membedakan antara jalan utama dengan jalan penghubung. Di depan gedung karesidenan, terdapat sebuah taman kota. Taman Merdeka, nama taman itu. Sebuah taman untuk tempat warga kota melepas penat setelah kesibukan. Kota terasa nyaman bagi warganya. Inilah suasana Kota Purwokerto dengan perencanaan tata ruang yang baru. Suatu masa ketika Pulau Jawa mulai berkembang. Saat itu, kota-kota di Pulau Jawa tengah mengalami lonjakan penduduk. Kota-kota meledak. Hampir di setiap kota, pertambahan penduduk sekitar 10 kali sampai 20 kali lipat. Kota-kota, mengalami masalah akut tentang tata ruang. Pemerintah kolonial Belanda kelimpungan menghadapi persoalan itu. Sibuk mencari model pembangunan bagi kota-kota di Jawa. Saat kesibukan meliputi Pemerintah Kolonial Belanda, Herman Thomas Kartsen menjejakkan kaki di Semarang pada 1914. Kota yang juga tengah mengalami persoalan pertambahan penduduk. Dalam catatan W.F. Wertheim melalui buku Masyarakat Indonesia dalam Transisi, pertambahan penduduk di kota itu hampir mencapai seratus persen. Di kota tersebut, Kartsen menemui Henri Maclaine Pont. Pont adalah teman Kartsen semasa kuliah di Insitut Teknologi Delf, Amsterdam, Belanda. Di Semarang, Pont mendirikan biro arsistek. Melalui Pont, Kartsen mendapat banyak informasi tentang keadaan Semarang dan kota lainnya. Kedatangan Kartsen di Semarang adalah guna merancang Kota Semarang dan kota-kota di Pulau Jawa.terdapat pabrik gula kalibagor.[4]",
            "Nama Pekalongan sampai saat ini belum jelas asal-usulnya, belum ada prasasti atau dokumen lainnya yang bisa dipertanggungjawabkan, yang ada hanya berupa cerita rakyat atau legenda. Dokumen tertua yang menyebut nama Pekalongan adalah Keputusan Pemerintah Hindia Belanda (Gouvernements Besluit) Nomor 40 tahun 1931:nama Pekalongan diambil dari kata ‘Halong‘ (dapat banyak) dan dibawah simbul kota tertulis ‘Pek-Alongan‘.\n" +
                    "\n" +
                    "Kemudian berdasarkan keputusan DPRD Kota Besar Pekalongan tanggal 29 januari 1957 dan Tambahan Lembaran daerah Swatantra Tingkat I Jawa Tengah tanggal 15 Desember 1958, Serta persetujuan Pepekupeda Teritorium 4 dengan SK Nomor KTPS-PPD/00351/II/1958:nama Pekalongan berasal dari kata ‘A-Pek-Halong-An‘ yang berarti pengangsalan (Pendapatan).",
            "Sejarah Semarang berawal kurang lebih pada abad ke-6 M, yaitu daerah pesisir yang bernama Pragota (sekarang menjadi Bergota) dan merupakan bagian dari kerajaan Mataram Kuno. Daerah tersebut pada masa itu merupakan pelabuhan dan di depannya terdapat gugusan pulau-pulau kecil. Akibat pengendapan, yang hingga sekarang masih terus berlangsung, gugusan tersebut sekarang menyatu membentuk daratan. Bagian kota Semarang Bawah yang dikenal sekarang ini dengan demikian dahulu merupakan laut. Pelabuhan tersebut diperkirakan berada di daerah Pasar Bulu sekarang dan memanjang masuk ke Pelabuhan Simongan, tempat armada Laksamana Cheng Ho bersandar pada tahun 1435 M. Di tempat pendaratannya, Laksamana Cheng Ho mendirikan kelenteng dan masjid yang sampai sekarang masih dikunjungi dan disebut Kelenteng Sam Po Kong (Gedung Batu).\n" +
                    "\n" +
                    "Pada akhir abad ke-15 M ada seseorang ditempatkan oleh Kerajaan Demak, dikenal sebagai Pangeran Made Pandan (Sunan Pandanaran I), untuk menyebarkan agama Islam dari perbukitan Bergota. Dari waktu ke waktu daerah itu semakin subur, dari sela-sela kesuburan itu tumbuhlah pohon asam yang berjarak antara satu sama lain (jarang - jarang) (bahasa Jawa: asem arang), sehingga memberikan gelar atau nama daerah itu yang kemudian menjadi Semarang.",
            "Daerah Istimewa Yogyakarta (DIY) adalah wilayah tertua kedua di Indonesia setelah Jawa Timur, yang dibentuk oleh pemerintah negara bagian Indonesia. Daerah setingkat provinsi ini juga memiliki status istimewa atau otonomi khusus. Status ini merupakan sebuah warisan dari zaman sebelum kemerdekaan. Kesultanan Yogyakarta dan juga Kadipaten Paku Alaman, sebagai cikal bakal atau asal usul DIY, memiliki status sebagai “Kerajaan vasal/Negara bagian/Dependent state” dalam pemerintahan penjajahan mulai dari VOC, Hindia Prancis (Republik Bataav Belanda-Prancis), India Timur/EIC (Kerajaan Inggris), Hindia Belanda (Kerajaan Nederland), dan terakhir Tentara Angkatan Darat XVI Jepang (Kekaisaran Jepang). Oleh Belanda status tersebut disebut sebagai Zelfbestuurende Lanschappen dan oleh Jepang disebut dengan Koti/Kooti. Status ini membawa konsekuensi hukum dan politik berupa kewenangan untuk mengatur dan mengurus wilayah [negaranya] sendiri di bawah pengawasan pemerintah penjajahan tentunya. Status ini pula yang kemudian juga diakui dan diberi payung hukum oleh Bapak Pendiri Bangsa Indonesia Soekarno yang duduk dalam BPUPKI dan PPKI sebagai sebuah daerah bukan lagi sebagai sebuah negara[1].",
            "Eksistensi kota ini dimulai di saat Sunan Pakubuwana II, raja Kesultanan Mataram, memindahkan kedudukan raja dari Kartasura ke Desa Sala, sebuah desa yang tidak jauh dari tepi Bengawan Solo, karena istana Kartasura hancur akibat serbuan pemberontak. Sunan Pakubuwana II membeli tanah dari lurah Desa Sala, yaitu Kyai Sala, sebesar 10.000 ringgit (gulden Belanda) untuk membangun istana Mataram yang baru. Secara resmi, istana Mataram yang baru dinamakan Keraton Surakarta Hadiningrat dan mulai di tempati tanggal 17 Februari 1745. Tanggal ini kemudian ditetapkan sebagai hari jadi Kota Surakarta. Perjanjian Giyanti yang ditanda-tangani oleh Sunan Pakubuwana III, Belanda, dan Pangeran Mangkubumi pada 13 Februari 1755 membagi wilayah Mataram menjadi dua yaitu Kasunanan Surakarta dan Kesultanan Yogyakarta. Selanjutnya wilayah Kasunanan Surakarta semakin berkurang, karena Perjanjian Salatiga yang diadakan pada 17 Maret 1757 menyebabkan Raden Mas Said diakui sebagai seorang pangeran merdeka dengan wilayah kekuasaan berstatus kadipaten, yang disebut dengan nama Praja Mangkunegaran. Sebagai penguasa Mangkunegaran, Raden Mas Said bergelar Adipati Mangkunegara I."
    };
    private static String[] Berdiri = {
            "Berdiri pada 17 Januari 2003",
            "Berdiri pada 15 November 2000",
            "Berdiri pada 18 Mei 2010",
            "Berdiri pada 1 April 1999",
            "Berdiri pada 24 Januari 1999",
            "Berdiri pada 6 April 2001",
            "Berdiri pada 14 Agustus 1998",
            "Berdiri pada 2 Mei 1997",
            "Berdiri pada 13 Maret 1999",
            "Berdiri pada 13 Februari 1998"
    };
    private static int[] sekolahImages = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j
    };

    static ArrayList<Sekolah> getListData(){
        ArrayList<Sekolah> list = new ArrayList<>();
        for(int position = 0; position < sekolahNames.length; position++){
            Sekolah sekolah = new Sekolah();
            sekolah.setName(sekolahNames[position]);
            sekolah.setBerdiri(Berdiri[position]);
            sekolah.setDetail(sekolahDetails[position]);
            sekolah.setPhoto(sekolahImages[position]);
            sekolah.setSejarah(Sejarah[position]);
            list.add(sekolah);
        }
        return list;
    }
}
