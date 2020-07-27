package my.first.planet;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.google.android.gms.ads.AdRequest;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.planet.R;

//import java.security.KeyPairGenerator;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    private EditText weight;
    private TextView result;
    private String planet;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView madView = findViewById(R.id.adView);
        //afma-sdk-a-v201004000.201004000.0
        //B8A97AFE36E8F28CA5AE1CE938B87344
//        List<String> testDeviceIds = Arrays.asList("B8A97AFE36E8F28CA5AE1CE938B87344");
//        RequestConfiguration configuration =
//                new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
//        MobileAds.setRequestConfiguration(configuration);


//        MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTestDeviceIds(Collections.singletonList("B8A97AFE36E8F28CA5AE1CE938B87344"))
//                .build());
//        new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("B8A97AFE36E8F28CA5AE1CE938B87344"));
        AdRequest adRequest = new AdRequest.Builder().build();
//
        madView.loadAd(adRequest);


//        Activity activity = null;
//        Window window = activity.getWindow();
//
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        String[] arraySpinner = new String[] {
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "Black Hole"
        };
        final Spinner s = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item , arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                Toast.makeText(MainActivity.this, s.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                planet = s.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });




        weight = (EditText) findViewById(R.id.editText1);
        result = (TextView) findViewById(R.id.result);
    }

    public  void calc_weight(View v){
        String weight_1 = weight.getText().toString();

        double Mercury =  0.38;
        double Venus = 0.91;
        double Earth = 1.00;
        double Mars = 0.38;
        double Jupiter = 2.34;
        double Saturn = 1.06;
        double Uranus = 0.92;
        double Neptune = 1.19;
        double Pluto = 0.06;

        if(weight_1.equals("")){

                result.setText("Please Enter a valid input");
        }
        else {
            if (planet.equals("Mercury")) {
                double res = Mercury * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Mercury",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Mercury");
            }
            if (planet.equals("Venus")) {
                double res = Venus * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Venus",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Venus");
            }
            if (planet.equals("Earth")) {
                double res = Earth * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Earth",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Earth");
            }
            if (planet.equals("Mars")) {
                double res = Mars * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Mars",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Mars");
            }
            if (planet.equals("Jupiter")) {
                double res = Jupiter * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Jupiter",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Jupiter");
            }
            if (planet.equals("Saturn")) {
                double res = Saturn * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Saturn",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Saturn");
            }
            if (planet.equals("Uranus")) {
                double res = Uranus * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Uranus",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Uranus");
            }
            if (planet.equals("Neptune")) {
                double res = Neptune * Double.parseDouble(weight_1);
                String w = String.format("%.2f", res);
                next_intent("Neptune",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Neptune");
            }

            if (planet.equals("Pluto")) {
                double res = Pluto * Double.parseDouble(weight_1);
                @SuppressLint("DefaultLocale") String w = String.format("%.2f", res);
                next_intent("Pluto",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Pluto");
            }
            if (planet.equals("Black Hole")) {
                double res = Pluto * Double.parseDouble(weight_1);
                @SuppressLint("DefaultLocale") String w = String.format("%.2f", res);
                next_intent("Black Hole",w);
                result.setText("");
//                result.setText("You'll weigh "+w + " Kg"+ " on Pluto");
            }


        }

    }

    public void next_intent(final String name, final String w) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent i = new Intent(MainActivity.this, PlanetDisplay.class);
                    i.putExtra("planet", name);
                    i.putExtra("weight",w);
                    startActivity(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}