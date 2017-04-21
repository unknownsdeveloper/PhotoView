package ankit.developer.unknowns.photoview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    PhotoViewAttacher photoViewAttacher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.iv_photo);

        Drawable bitmap = getResources().getDrawable(R.mipmap.ic_launcher);

        imageView.setImageDrawable(bitmap);



        photoViewAttacher = new PhotoViewAttacher(imageView);

        //photoViewAttacher.update();
    }
}
