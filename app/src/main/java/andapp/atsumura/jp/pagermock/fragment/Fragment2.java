package andapp.atsumura.jp.pagermock.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.support.v4.app.Fragment;

import andapp.atsumura.jp.pagermock.R;


public class Fragment2 extends Fragment {

    private CheckBox mCheckBox;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCheckBox = (CheckBox)getActivity().findViewById(R.id.checkbox2);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

}
