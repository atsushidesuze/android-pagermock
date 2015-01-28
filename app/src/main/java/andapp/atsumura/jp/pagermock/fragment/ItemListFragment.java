package andapp.atsumura.jp.pagermock.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.ListFragment;

import andapp.atsumura.jp.pagermock.R;
import andapp.atsumura.jp.pagermock.adapter.ItemListAdapter;


public class ItemListFragment extends ListFragment {

    private ItemListAdapter adapter;

    public ItemListFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set adapter
        adapter = new ItemListAdapter(getActivity());
        setListAdapter(adapter);

        testAddItems();
    }

    public void testAddItems(){
        for(int i = 0; i < 16; i++){
            adapter.add(String.valueOf(i+1), "Name " + String.valueOf(i+1));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_listfragment, container, false);
    }

}