package starace.learn.com.gitpractice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list_view_actor;

    String[] actorsNames = {"Name: Leo DiCaprio", "Name: Jeniffer Lawrence", "Matt Damon"};
    private final String[] actorsDOB = {"DOB: November 11, 1974", "August 15, 1990", "October 8, 1970"};
    private final String[] oscarsWon = {"Oscars Won: 1", "Oscars Won: 1", "Oscars Won: 1"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomList adapter = new
                CustomList(MainActivity.this, actorsNames, actorsDOB, oscarsWon);
        list_view_actor = (ListView) findViewById(R.id.list_view_actor);

        list_view_actor.setAdapter(adapter);


    }
}
