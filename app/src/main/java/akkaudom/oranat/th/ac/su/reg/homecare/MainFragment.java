package akkaudom.oranat.th.ac.su.reg.homecare;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }   // Constructor

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated (savedInstanceState);

        // SingUp Controller
        singUpController ();

    } // Main Method

    private void singUpController() {
        Button button = getView ().findViewById (R.id.btnSignUp);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                // Replanc Fragment
                getActivity ()
                        .getSupportFragmentManager ()
                        .beginTransaction ()
                        .replace (R.id.contentMainFragment, new RegisterFragment ())
                        .addToBackStack (null)
                        .commit ();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_main, container, false);
    } // onCreateView

} // Main Class
