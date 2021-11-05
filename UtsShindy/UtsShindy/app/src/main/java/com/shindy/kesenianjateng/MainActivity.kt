package com.shindy.kesenianjateng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        data?.add(DataModel(R.drawable.bahasa,"Kesenian Jawa Tengah","WAYANG KULIT", "Wayang Kulit dimainkan oleh seorang dalang yang tampil di balik tirai berbayang. " +
                "Kesenian tradisional ini juga sudah dimainkan sejak dahulu hingga saat ini pun masih tetap dibuat pertunjukan nya sehingga tetap lestari keberadaan nya. " +
                "Tokoh-tokoh yang dilakoni Wayang Kulit adalah tokoh dari cerita sejarah agama Hindu, yang ceritanya berasal dari kitab Mahabharata dan Ramayana."))

        data?.add(DataModel(R.drawable.pakaian,"Kesenian Jawa Tengah","TARI GAMYONG", "Tari Gambyong merupakan salah satu kesenian tradisional khas Jawa Tengah. Tarian ini ditampilkan dengan gerakan lemah lembut penari yang memiliki kelenturan tubuh. Dahulu, tarian ini dilakukan saat masa panen sebagai wujud rasa syukur petani atas hasil panen."))

        data?.add(DataModel(R.drawable.kesenian,"Kesenian Jawa Tengah","MACAPAT", "Kesenian tradisional Jawa Tengah juga memiliki kesenian di bidang sastra. Macapat merupakan tembang atau puisi tradisional yang sudah ada sejak peralihan masa kerajaan Majapahit menuju dimulainya masa perjalanan Wali Songo. "))

        data?.add(DataModel(R.drawable.senjata,"Kesenian Jawa Tengah","KUDA LUMPING", "Kuda Lumping merupakan tarian yang dilakoni oleh penari yang menaiki boneka kuda anyaman, sambil memegang pedang. Keterlibatan kekuatan magis juga kerap digunakan oleh penampil sakti nan handal."))

        data?.add(DataModel(R.drawable.makanan,"Kesenian Jawa Tengah","DENGKLUNG", "Dengklung merupakan kesenian tradisional khas Jawa Tengah yang berasal dari Kabupaten Batang. Kesenian religi agama Islam ini berbentuk lantunan salawat yang dinyanyikan sekelompok penyanyi wanita atau pria. Musik dari alat-alat khas Timur Tengah seperti rebana mengiringi pertunjukan Dengklung ini."))

        data?.add(DataModel(R.drawable.wetonan,"Kesenian Jawa Tengah","RENGKONG", "Ada lagi kesenian tradisional yang ditampilkan sebagai wujud rasa syukur setelah masa panen, yakni Rengkong. Kesenian ini dilakoni oleh masyarakat beramai-ramai sambil memikul ikatan padi sebagai hasil panen dengan pikulan bambu atau kayu."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}