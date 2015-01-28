package andapp.atsumura.jp.pagermock.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import andapp.atsumura.jp.pagermock.fragment.Fragment1;
import andapp.atsumura.jp.pagermock.fragment.Fragment2;
import andapp.atsumura.jp.pagermock.fragment.ItemListFragment;

/**
 * Created by a12396 on 西暦15/01/27.
 */
public class TestFragmentPagerAdapter extends FragmentPagerAdapter {

    public static final int MAX_PAGE_NUM = 1000;
    private static final int OBJECT_NUM = 3;

    public TestFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        int diff = (position - (MAX_PAGE_NUM / 2)) % OBJECT_NUM;
        int index = (0 > diff) ? (OBJECT_NUM + diff) : diff;
        switch(index){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            default:
                return new ItemListFragment();
        }
    }

    @Override
    public int getCount() {
        return MAX_PAGE_NUM;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + (position + 1);
    }
}
