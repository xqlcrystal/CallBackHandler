package crystal.com.configurationtest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ori=(EditText)findViewById(R.id.ori);
        final EditText navi=(EditText)findViewById(R.id.navi);
        final EditText mnc=(EditText)findViewById(R.id.mnc);
        Button bn=(Button) findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Configuration cfg=getResources().getConfiguration();
                String screen=cfg.orientation==
                        Configuration.ORIENTATION_LANDSCAPE?"横向屏幕":"纵向屏幕";
                String naviname=cfg.orientation==
                        Configuration.NAVIGATION_NONAV? "没有方向控制":
                        cfg.orientation==Configuration.NAVIGATION_WHEEL?"滚轮":"其他";


                ori.setText(screen);
                navi.setText(naviname);
                mnc.setText(cfg.mnc);

            }
        });
    }
}
