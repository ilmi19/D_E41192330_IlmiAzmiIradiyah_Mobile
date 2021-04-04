package com.example.listjeniskucing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoKucing = new ArrayList<>();
    private ArrayList<String> namaKucing = new ArrayList<>();
    private ArrayList<String> infoKucing = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoKucing, namaKucing, infoKucing, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaKucing.add("Maine Coons");
        fotoKucing.add("https://th.bing.com/th/id/OIP.8wXgMt-ihvimxXGhIpsYAwHaH9?w=150&h=180&c=7&o=5&pid=1.7");
        infoKucing.add("Jenis kucing maine coon terkenal karena ukurannya yang besar hingga memiliki berat 13 kg. Tetapi alasan lain mereka menjadi ras kucing rumahan yang populer adalah karena kepribadian yang ramah. Jenis kucing ini sangat suka bermain dan bergabung dengan kamu apa pun yang dilakukan.");

        namaKucing.add("Siamese");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-12_34.jpeg?w=375");
        infoKucing.add("Kucing Siamese berkembang biak dengan sangat cantik. Jenis kucing ini memiliki mata cerah dan bulu coklat yang khas di ekor dan anggota tubuhnya. Kucing jenis Siam ini juga cenderung memiliki kepribadian yang sangat santai. Mereka lebih suka duduk di pangkuan pemiliknya daripada membuat masalah.");

        namaKucing.add("American Shorthairs");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-1_43.jpeg?w=480");
        infoKucing.add("Kucing jenis American Shorthairs ini memiliki masa hidup yang lama. Jadi kucing jenis ini bisa menjadi pilihan tepat jika kamu mau memelihara kucing untuk tumbuh bersama. American Shorthairs juga dikenal sangat manis dengan anak-anak dan hewan lainnya seperti anjing. Jenis kucing ini termasuk mudah dirawat, artinya cocok untuk kamu yang pemula dalam urusan memeliharakamu tidak perlu sering-sering menyikatnya.");

        namaKucing.add("Sphynxes");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-14_43.jpeg?w=480");
        infoKucing.add("Kucing Sphynx termasuk jenis kucing tidak berbulu. Karena tak berbulu ini, sekilas kucing sphynx terlihat jahat, meski nyatanya tidak demikian. Buat kamu yang alergi bulu kucing, jenis kucing ini bisa menjadi solusi. Sphyn termasuk kucing yang menyukai perhatian dari orang-orang dan cenderung sedikit nakal ketika mau mencuri perhatian. Tapi selama kamu bersedia untuk sering menggaruk telinga Sphynx, dia akan baik-baik saja. Salah satu orang Indonesia terkenal yang memelihara jenis kucing ini adalah Raditya Dika.");

        namaKucing.add("Scottish Fold");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-11_43.jpeg?w=480");
        infoKucing.add("Kamu mungkin sudah akrab dengan ras kucing ini yang dikenal sebagai lipatan Skotlandia. Nama kucing scottish fold didapat dari telinga mereka yang terlipat. Scottish fold adalah jenis kucing berukuran sedang dengan berat 4 hingga 6 kg. Mereka seperti terobsesi dengan pemiliknya. Mereka hidup untuk kasih sayang manusia, dan tidak takut dengan suara keras. Artinya jenis kucing ini cocok buat kamu yang tinggal di kota besar.");

        namaKucing.add("Somali");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-13_34.jpeg?w=375");
        infoKucing.add("Kucing Somali memiliki bulu ombre khas yang hadir dalam empat warna menawan. Somalia berkembang pesat ketika mereka memiliki pemelihara yang dapat diandalkan dan memberikan banyak perhatian pada mereka. Jenis kucing peliharaan ini suka bermain dan sangat pintar.");

        namaKucing.add("Persians");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-10_43.jpeg?w=480");
        infoKucing.add("Kucing Persia sangat lucu dan terlihat seperti boneka. Ras kucing ini paling populer, karena mereka cantik dan juga memiliki kepribadiannya yang manis. Terkadang jenis kucing Persia membutuhkan sedikit waktu untuk beradaptasi dengan lingkungan baru, tetapi setelah sedikit tenang, mereka akan merasa sangat nyaman di rumah kamu. Memiliki bulu yang tebal, kamu memang harus sering menyikat kucing Persia kamu.");

        namaKucing.add("Abyssinians");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan_43.jpeg?w=480");
        infoKucing.add("Jenis kucing ini sangat cantik dan populer karena mereka jenius. Abyssinia juga termasuk salah satu ras kucing tertua di dunia. Satu yang harus kamu ketahui jenis kucing Abyssinia bukanlah jenis yang paling suka diemong. Mereka memang menyukai persahabatan manusia, tetapi mereka menunjukkannya hanya dengan berada di dekat kamu.");

        namaKucing.add("Birmans");
        fotoKucing.add("https://akcdn.detik.net.id/community/media/visual/2020/09/20/jenis-jenis-kucing-peliharaan-3_43.jpeg?w=480");
        infoKucing.add("Jenis kucing Birman mudah dikenali dari mata birunya yang khas serta hidung cokelatnya yang manis. Birman memiliki berbagai warna, tetapi mereka semua terlahir putih. Kucing ini memiliki warna bulu yang berbeda saat tumbuh dewasa. Birman sangat manis dan pendiam, dan mereka bisa bergaul dengan hampir semua orang.");

        prosesRecyclerViewAdapter();
    }
}