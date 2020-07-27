package my.first.planet;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.planet.R;

public class PlanetDisplay extends AppCompatActivity {

    private TextView tv;
    private  TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planet_display);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent i = getIntent();
        Bundle bd = i.getExtras();
        String response = bd.getString("planet");
        String weight =bd.getString("weight");
        tv = findViewById(R.id.textView4);
        tv1 = findViewById(R.id.facts);


        ImageView im = findViewById(R.id.imageView2);
        if(response.equals("Mercury")){
            im.setImageResource(R.drawable.mercury);
            tv.setText("You have travelled 182.357 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Mercury is hot, but not too hot for ice.The closest planet to the Sun does indeed have ice on its surface.");
        }
        if(response.equals("Venus")){
            im.setImageResource(R.drawable.venus);
            tv.setText("You have travelled 51.135 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Venus doesn’t have any moons, and we aren’t sure why.");
        }
        if(response.equals("Earth")){
            im.setImageResource(R.drawable.earth);
            tv.setText("Ehh!! You are still on "+ response+" and you will weigh the same " +weight+" kgs here.");
            tv1.setText(" *INFO \n \n I guess you know all about this planet.");
        }
        if(response.equals("Mars")){
            im.setImageResource(R.drawable.mars);
            tv.setText("You have travelled 168.208 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Mars had a thicker atmosphere in the past.");
        }
        if(response.equals("Jupiter")){
            im.setImageResource(R.drawable.jupiter);
            tv.setText("You have travelled 692.497 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Jupiter is a great comet catcher. Its mass of 318 time that of earth what makes it a comet catcher.");
        }
        if(response.equals("Saturn")){
            im.setImageResource(R.drawable.saturn);
            tv.setText("You have travelled 1,433.140 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n No one knows how old Saturn’s rings are, they’ve been around (pun intended) for the last few billion years.");
        }
        if(response.equals("Uranus")){
            im.setImageResource(R.drawable.uranus);
            tv.setText("You have travelled 3,106.336 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Uranus was thought to be a calm and blue planet but its more stormy than we thought.");
        }
        if(response.equals("Neptune")){
            im.setImageResource(R.drawable.neptune);
            tv.setText("You have travelled 4,540.725 million km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Neptune has supersonic winds which blow at more than 1,100 miles per hour (1,770 kilometers per hour)");
        }
        if(response.equals("Pluto")){
            im.setImageResource(R.drawable.pluto);
            tv.setText("You have travelled 7.5 billion km and reached "+ response+". You will weigh " +weight+" kgs.");
            tv1.setText(" *INFO \n \n Pluto was reclassified from a planet to a dwarf planet in 2006. It is the largest dwarf planet and is one third water.");
        }
        if(response.equals("Black Hole")){
            im.setImageResource(R.drawable.blackhole);
            tv.setText("You have travelled 55 million light years and reached the "+ response+". Well obviously one can not measure the weight near a black hole since its a Singularity.");
            tv1.setText(" *INFO \n \n A black hole is an extremely dense object from which no light can escape. Anything that comes within a black hole’s “event horizon,” its point of no return, will be consumed, never to re-emerge, because of the black hole’s unimaginably strong gravity. By its very nature, a black hole cannot be seen, but the hot disk of material that encircles it shines bright. Against a bright backdrop, such as this disk, a black hole appears to cast a shadow. ");
        }
}

//


}
