package onroute.onroute.com.onroute;

import android.app.ProgressDialog;
import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {
    VideoView videoView;
    private int position = 0;

    private ProgressDialog progressDialog;

    private MediaController mediaControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





    }
}
