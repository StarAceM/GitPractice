package starace.learn.com.gitpractice1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mikhail on 4/11/16.
 */
public class CustomList extends ArrayAdapter<String> {

    TextView text_view_name;
    TextView text_view_dob;
    TextView text_view_oscars;

    private final Activity context;
    private final String[] actorsNames;
    private final String[] actorsDOB;
    private final String[] oscarsWon;

    public CustomList(Activity context, String[] actorsNames, String[] actorsDOB, String[] oscarsWon) {
        super(context, R.layout.list_view_actor_internal, actorsNames);
        this.context = context;
        this.actorsNames = actorsNames;
        this.actorsDOB = actorsDOB;
        this.oscarsWon = oscarsWon;


    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_view_actor_internal, null, true);
        TextView txt1 = (TextView) rowView.findViewById(R.id.text_view_name);
        txt1.setText(actorsNames.toString());

        TextView txt2 = (TextView) rowView.findViewById(R.id.text_view_dob);
        txt1.setText(actorsDOB.toString());


        TextView txt3 = (TextView) rowView.findViewById(R.id.text_view_oscars);
        txt1.setText(oscarsWon.toString());





    }
}

