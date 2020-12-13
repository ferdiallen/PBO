package com.ngoding.android.kulinerindonesia;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Rendang",
            "Soto Banjar",
            "Kerak Telor",
            "Ayam Betutu",
            "Bika Ambon",
            "Mie Aceh",
            "Empek-empek",
            "Nasi Rawon",
            "Bubur Manado",
            "Coto Makassar"
    };

    private static String[] foodDetail = {
            "Makanan khas Daerah di Indonesia yaitu rendang. Sesuai dengan namanya, rendang Padang berasal dari Provinsi Sumatra Barat. Bahan dasar untuk membuat masakan ini pun sangat mudah untuk didapatkan. Seseorang yang ingin membuat hidangan rendang hanya perlu bahan utama berupa daging dan santan kelapa.",
            "Soto banjar merupakan masakan asli dari daerah Banjarmasin. Kuliner ini dibuat dari bahan utama daging ayam. Daging ayam itu dicampur dengan bumbu rempah – rempah yang lezat. Oleh sebab itulah banyak orang yang menyukai hidangan soto banjar.",
            "Kerak telur menjadi suatu masakan yang merupakan perpaduan dari masakan khas Portugis. Jenis hidangan ini menjadi makanan khas Berawi Jakarta. Kuliner bernama kerak telur akan mudah dijumpai saat acara pekan raya di Jakarta. Bahkan tidak jarang kuliner kerak telur dijadikan simbol dalam kegiatan tersebut.",
            "Ayam betutu memang memiliki rasa yang nikmat. hal inilah yang membuat kuliner asli Bali itu begitu disukai para wisatawan. olahan daging ayam utuh yang diberi bumbu khusus mampu memanjakan lidah orang yang menikmatinya. oleh sebab itulah, tidak mengherankan jika banyak wisatawan yang menyukai makanan khas bali tersebut.",
            "Salah satu masakan kuliner asli dari daerah Indonesia adalah bika ambon. Makanan ini berasal dari daerah Medan, Sumatra Utara. Bentuk kuliner berupa kue ini dibuat dari campuran gula, telur dan santan. Biasanya, makanan bika ambon memiliki aroma yang wangi. Aroma wangi dari kuliner tersebut membuatnya menjadi makanan khas Daerah favorit dari Provinsi Sumatra Utara.",
            "Salah satu menu kuliner asli daerah Aceh adalah mie Aceh. Makanan ini juga termasuk kuliner yang begitu disukai masyarakat Indonesia. Rasa lezat dari hidangan mie Aceh membuat para penikmatnya menjadi ketagihan. Oleh sebab itulah, maka tidak mengherankan jika banyak orang yang berkunjung ke serambi mekkah tersebut mencari kuliner mie Aceh.",
            "Empek – empek makanan khas Daerah Palembang Sumatra Selatan ini begitu populer di Indonesia. Masakan yang terbuat dari sagu dan ikan ini memiliki rasa yang lezat. Rasa lezat dalam sebuah hidangan empek – empek asli Palembang membuat setiap orang yang mencobanya menjadi ketagihan.",
            "Rawon adalah salah satu hidangan makanan khas surabaya yang paling dicari. Rawon sendiri memiliki warna dan rasa yang berbeda sehingga makanan ini berbeda pada umumnya. Rawon sendiri terdiri dari potongan daging, kuah, dan sayuran. Bila anda berkunjung ke Surabaya tidak akan lengkap belum belum menikmati hidangan soto rawon.",
            "Makanan dari Manado yang cukup terkenal adalah bubur manado. Olahan asli Manado ini memiliki rasa yang lezat. Dalam sebuah hidangan bubur manado terdapat campuran sayur dan lauk pauk baik yang hewani atau nabati.",
            "Makanan khas Daerah di Indonesia dari Makasar. Di daerah ini terdapat kuliner khas bernama coto Makasar. Masakan Coto Makasar di buat dari jeroan dan daging sapi. Hidangan ini sangat cocok ketika musim dingin dan panas. Apabila anda sedang berkunjung ke kota makasar coba deh sekali-kali mencicipi coto makasar rasakan nikmatnya."
    };

    private static int[] foodImage = {
            R.drawable.rendang_padang,
            R.drawable.soto_banjar,
            R.drawable.kerak_telor,
            R.drawable.ayam_betutu,
            R.drawable.bika_ambon,
            R.drawable.mie_aceh,
            R.drawable.empek_empek,
            R.drawable.nasi_rawon,
            R.drawable.bubur_manado,
            R.drawable.coto_makassar
    };

    private static String[] foodBahan = {
            "500 gr daging \n1 batang serai geprek \n3 lembar daun jeruk \n2 lembar daun salam \n1 ruas lengkuas geprek \n2 cm kayu manis \n1 sdt gula merah \n1 sdt kaldu sapi dan garam \n1/2 sdt jintan bubuk \n1/2 sdt merica bubuk \nJeruk nipis \n500 ml santan dari 1/2 kelapa 4 siung bawang putih \n6 butir bawang merah \n2 butir kemiri \n1/2 sdt ketumbar \n3 cabai merah besar (buang bijinya) \n2 cm kunyit \n3 cm jahe",
            "1 ekor Ayam muda \n2 buah Kentang direbus dipotong-potong \n100 gram Soun yang sudah direndam \n3 sdm Bawang goreng \n 1 sdm Bawang putih goreng\n 5 batang Seledri dirajang\n 4 butir Telur rebus dibelah empat bagian\n4 buah Perkedel\n 4 sdm Minyak goreng untuk menumis\n 1 buah Ketupat Banjar dipotong-potong\n 1 batang Kayu manis\n 2 sdm Kecap asin\n 2 buah Jeruk nipis\n 1500 ml Air\n 4 buah Bawang merah\n 3 siung Bawang putih\n 1/2 sdt Adas\n 1/2 sdt Jintan\n 3 cm Jahe\n 2 cm Kunyit\n 1/2 sdt Merica\n 1 sdt Garam",
            "100 gram beras ketan putih yang sudah dicuci dan direndam minimal 3 jam, lebih lama lebih baik.\n 250ml air\n 5 butir telur bebek\n 100 gram kelapa serut\n Sangrai (untuk taburan)\n 15 gram ebi udang diseduh, sangrai dan haluskan\n 30 gram bawang merah digoreng kering\n 1 sendok makan minyak goreng untuk menumis\n Bawang merah goreng (untuk taburan)\n 4 buah cabai merah keriting\n 1 cm jahe\n 3 siung bawang merah\n 1 siung bawang putih",
            "1 ekor ayam kampung potong sesuai selera, \n1 jeruk nipis \n1 sdm ketumbar \n4 kemiri, sangrai \n1 ruas kunyit \nsesuai selera Cabe rawit merah \n1 sdm terasi matang \nsesuai selera Gula dan garam \n10 bawang merah \n6 bawang putih \n3 batang serai \n10 cabe rawit merah \n4 jari kencur (aku suka kencur soalnya) \n3 ruas lengkuas \n3 ruas jahe \nsecukupnya Garam, gula",
            "Santan 225 ml \nDaun Jeruk 5 lembar \nSerai 1 batang, memarkan \nDaun Pandan 1 lembar, simpulkan \nGaram 1/2 sdt \nTepung terigu protein sedang 80 gr \nTepung sagu 90 gr \nRagi instan 1 sdt \nTelur ayam 4 butir \nKuning telur ayam 2 butir \nGula pasir 125 gr \nBlue Band Serbaguna 2 sdm, cairkan \nBlue Band Serbaguna 2 sdm, untuk olesan",
            "Mie basah besar \nCumi \nUdang \nDaging kepiting \nDaging sapi khas dalam \nAir rebusan kulit udang \nTauge saya skip \nOpsional cabe rawit utuh \nTelor \n2 dm Bubuk kari \nSeruas kayu manis \nSekuntum bunga lawang \nKecap asin \nKecap manis \nMecin \nLada bubuk \n1 buah pala \n1/2 sdt jintan \n5 btr kapulaga \n5 btr kemiri \n1 sdm merica butiran \n10 btr Bawang putih \nsesuai selera Cabe \nBawang merah lebihkan \nBawang putih cincang sedang aja \nKol \nDaun bawang banyak \nSeledri sedang",
            "1 kg tepung sagu (kualitas baik) \n1 kg daging ikan tenggiri (giling halus) \n250 ml air es \nSecukupnya air bersih (rebus) \n1 sdt garam halus \n1 1/2 sdt penyedap rasa \nSecukupnya minyak (untuk menggoreng) \n\nBahan kuah : \n3/4 liter air bersih \n150 gr bawang putih ( cincang halus ) \n60 gr air asam jawa \n250 gr gula merah ( sisir halus ) \n1 sdm ebi kering bubuk \n100 gr cabe rawit ( haluskan ) ",
            "1/2 kilo daging sapi \n6 biji Bawang merah \n5 biji Bawang putih \nKemiri 2 biji disangrai \n2 ruas jari Kunyit \n3 biji Cabe besar hijau \n2 biji Kluek \nSerai digeprek \nLaos digeprek \nDaun jeruk",
            "200 gram beras \n1250 ml air \n200 gram labu kuning, kukus \n1 buah ubi kuning/singkong, potong seukuran suapan \n1 batang jagung, pipil \n1 ikat kangkung, iris 3-5 cm \n1 genggam kemangi \n1 lembar daun kunyit \n3 buah serai, memarkan \n2 batang daun bawang, iris halus \n3 siung bawang putih cincang \n1 sendok makan minyak goreng \n1/2 sendok teh garam \n1 sendok teh kaldu bubuk \nmerica bubuk secukupnya",
            "1 kg daging sandur lamur sapi dan jeroan sesuai selera \n3 liter air \n1 sdt garam \n4 sdm minyak sayur \n8 siung bawang putih \nsangrai 2 sdm kacang tanah \nlengkuas kupas \ncincang 3 batang serai (pilih yang putih dan agak lunak) \niris halus 1 sdm ketumbar \nsangrai 1/2 sdt jintan \nsangrai 1 sdt merica butiran \nsangrai 2 sdt garam \n5 buah cabai merah \n4 buah cabai rawit \n4 sdm taoco yang bagus \n2 sdm daun bawang dan iris halus \n2 sdm seledri dan iris halus \n3 sdm bawang merah goreng \n3 sdm jeruk nipis"
    };

    private static String[] foodMasak = {
            "Cuci bersih daging, potong sesuai selera, beri perasan jeruk nipis, lalu cuci lagi \nHaluskan bumbu, lalu tumis bumbu halus dengan serai, daun jeruk, daun salam, kayu manis dan lengkuas sampai matang \nMasukkan daging, aduk rata, lalu masukkan santan. Masak dengan api kecil sambil sesekali diaduk. \nKemudian masukkan garam, kaldu, jintan, merica dan gula merah, diamkan hingga bumbu meresap dan airnya menyusut. \nKoreksi rasa, angkat dan hidangkan.",
            "Rebus ayam dengan kayu manis dan garam hingga mendidih.\nTumis bumbu yang dihaluskan dengan menggunakan minyak goreng hingga harum, kemudian masukkan ke dalam rebusan ayam, rebus kembali hingga ayam empuk.\nAngkat ayam dari rebusan kemudian tiriskan hingga dingin kemudian suwir.",
            "Buat serundeng sebagai bahan campuran dan bahan taburan kerak telor dengan cara disangrai. Tumis bumbu halus hingga harum. Masukkan kelapa parut, garam, gula pasir dan 2 sendok makan ebi halus yang dimasak dengan api sedang sambil diaduk hingga kelapa kering dan berwarna kuning kecoklatan. Angkat lalu sisihkan.\nPanaskan minyak lalu tumis bumbu halus hingga harum.\nTuangkan 1 ½ sendok makan beras ketan putih pada wajan. Siram dengan 3 sendok makan ar rendaman beras dan biarkan hingga agak kering.\nDi tempat yang terpisah, kocok 1 butir telur bebek, ½ sendok teh bumbu halus yang sudah ditumis, ½ sendok teh ebi, ½ sendok makan bawang merah goreng, ⅛ sendok teh gula pasir dan ⅛ sendok teh garam bubuk.\nSiram campuran ke atas ketan pada wajan lalu aduk sambil ratakan. Atur ketebalan sesuai selera. Tutup wajan hingga matang lalu balik wajan di atas api, biarkan sampai matang.\nTaburkan serundeng / kelapa sangrai dan bawang goreng sebelum disajikan.",
            "Ayam yang sudah dibersihkan, bakar sebentar saja \nTumis bumbu halus sampai harum lalu masukkan bumbu rajangan halus.. masukkan ayam aduk2 lalu beri air matang sampai menutupi ayam \nMasak sampai matang lalu beri gula dan garam, bila rasa sudah pas sajikan dengan nasi panas, plecing kangkung, dan sambal matah...",
            "Rebus hingga mendidih santan, daun jeruk, daun pandan, serai dan garam. Jangan lupa diaduk supaya santan tidak pecah. Angkat, saring dan dinginkan. \nDi dalam mangkuk, campur tepung terigu, tepung sagu, ragi instan hingga rata. Sisihkan \nMasukkan santan yang sudah hangat ke dalam mangkuk berisi tepung lalu aduk rata hingga adonan rata. Pastikan adonan halus tanpa ada gumpalan tepung. Diamkan 10 menit. \nKocok telur dan gula hingga mengembang dan putih. \nMasukkan kocokan telur ke dalam adonan tepung lalu aduk rata menggunakan spatula. \nTambahkan Blue Band Serbaguna cair lalu aduk rata. Diamkan adonan sekitar 30 menit. \nPanaskan wajan anti lengket/teflon dengan diameter 20 cm atau cetakan kue lumpur berdiameter 6 cm yang telah diolesi dengan Blue Band Serba Guna. Masukkan adonan dan panggang di atas api kecil biarkan hingga permukaan bergelembung lalu tutup wajan/teflon. \nJika sudah matang, balik sebentar untuk mendapatkan warna kecoklatan di bagian atas. Angkat dan sajikan.",
            "Langkah awal buat bumbu campur bumbu halus bubuk kari dan bumbu gongseng masak pake minyak yg sedang sampai matang angkat.ini bumbu buat 20x masak mie aceh simpan dlm kulkas \nBubuk kari saya sarankan ini uda juara dlm mengulai dll wanginya enak hati2 jgn terlalu banyak beli di online shop \nOrak arik telor lalu sisihkan masukan minyak tumis bawang merah b putih lalu masukan air kaldu udang dan telor dan semua bumbu rajang kayu manis lawang udang dan semua bahan tambahkan k asin manis dan mecin masak hingga air menyusut terakhir masukan toge matikan api",
            "Cara membuat kuah empek empek palembang : \nSiapkan wadah, lalu masukkan air, air asam jawa dan gula merah, rebus sampai mendidih \nMasukkan cabe rawit, bawang putih, ebi dan garam, lalu aduk sampai tercampur merata. \nAngkat dari kompor, lalu biarkan hingga menjadi hangat. \n\nCara membuat empek empek : \nSiapkan wadah, lalu masukkan ikan, garam, penyedap rasa dan air es, campur dengan daging ikan (sudah digiling), lalu aduk sampai merata. \nMasukkan tepung sedikit demi sedikit, uleni hingga adonan menjadi pas dan kalis. \nAmbil secukupnya adonan pempek, lalu bentuklah dengan sesuai dengan ukuran (selera) \nMasukkan adonan pempek yang sudah selesai dibentuk kedalam air yang mendidih, tunggu hingga matang (mengapung), lalu angkat dan tiriskan. \nSiapkan wajan, panaskan minyak goreng, lalu goreng adonan pempek hingga matang (cirinya: bagian kulitnya berwarna kecoklatan). \nAngkat, lalu tiriskan. \nLalu potong-potong pempek goreng tersebut. \nEmpek empek palembang siap disajikan.",
            "Daging sapi direbus krmudian potong kecil2 \nBumbu dihaluskan \nTumis bumbu sampe harum kemudian masukan daging yg sdh dipotong kecil2 \nSetelah daging meresap dgn bumbu masukan kedlm air rebusan daging,kasi garam penyedap jamur secukupnya,masak sampe mendidih \nSajikan dgn kecambah kecil dan irisan kacang panjang,telur asin dan sambel",
            "Masak beras bersama jagung pipil, ubi kuning/singkong yang sudah dipotong, serai, dan 1000 ml air. Waktu memasak kira-kira 1 jam. \nSelagi menunggu bubur matang, kukus labu sampai empuk. Setelah itu potong-potong sebagian. Sementara sebagian lagi ditumbuk kasar. Masukkan ke dalam bubur. \nSetelah ubi/singkong empuk, tambahkan 250 ml air lagi. Masukkan kangkung, daun kunyit, garam, dan merica. Lalu lanjutkan dengan daun kemangi dan minyak goreng. Setelah itu matikan kompor. \nTuangkan bubur ke piring atau mangkuk besar. Sajikan bersama sambal terasi dan ikan asin yang sudah digoreng hingga renyah.",
            "Rebus daging dan jeroan secara terpisah hingga empuk. Tiriskan daging dan jeroan dan potong dadu 1,5 cm. \nBuang kaldu jeroan, ukur kaldu daging sebanyak 2,5 liter. \nPanaskan minyak, tumis bumbu halus hingga wangi, dan angkat. \nMasukkan ke dalam panci berisi kaldu, tambahkan daging dan jeroan. Masak di atas api kecil hingga bumbu meresap. Angkat \nlalu sajikan coto Makassar di atas mangkuk dengan bumbu pelengkap dan sambal taoco."
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetail[position]);
            food.setPhoto(foodImage[position]);
            food.setBahan(foodBahan[position]);
            food.setMemasak(foodMasak[position]);
            list.add(food);
        }
        return list;
    }
}
