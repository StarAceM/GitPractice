package starace.learn.com.gitpractice1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Mikhail on 4/11/16.
 */
public class CustomList extends ArrayAdapter<String> {
    
    private final Activity context;
    private final String[] actorsNamesList;
    private final String[] actorsDOB;
    private final String[] oscarsWon;

    public CustomList(Activity context, String[] actorsNames, String[] actorsDOB, String[] oscarsWon) {
        super(context, R.layout.list_view_actor_internal, actorsNames);
        this.context = context;
        this.actorsNamesList = actorsNames;
        this.actorsDOB = actorsDOB;
        this.oscarsWon = oscarsWon;


    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_view_actor_internal, null, true);
        TextView text_view_name = (TextView) rowView.findViewById(R.id.text_view_name);
        text_view_name.setText(actorsNamesList[position]);

        TextView text_view_dob = (TextView) rowView.findViewById(R.id.text_view_dob);
        text_view_dob.setText(actorsDOB[position]);


        TextView text_view_oscars = (TextView) rowView.findViewById(R.id.text_view_oscars);
        text_view_oscars.setText(oscarsWon[position]);

        return rowView;

    }
}


