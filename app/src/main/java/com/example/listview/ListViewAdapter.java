package com.example.listview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<>();


    // ListViewAdapter의 생성자
    public ListViewAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // 레이아웃 참조.
                   // convertView = inflater.inflate(R.layout.rank_box, parent, false);

        }
        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        ListViewItem listViewItem = listViewItemList.get(position);

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득

//            LinearLayout relativeLayout = convertView.findViewById(R.id.linear_myRankBox);
//            TextView rankingTextView = convertView.findViewById(R.id.text_ranking);
//            ImageView tierImageView = convertView.findViewById(R.id.img_tier);
//            TextView summerNameTextView = convertView.findViewById(R.id.text_summerName);
//            TextView tierTextView = convertView.findViewById(R.id.text_tier);
//            TextView rankTextView = convertView.findViewById(R.id.text_rank);
//            TextView leaguePointsTextView = convertView.findViewById(R.id.text_leaguePoints);
//            TextView leaguePointsNameTextView = convertView.findViewById(R.id.text_leaguePointsName);
//            TextView rankNameTextView = convertView.findViewById(R.id.text_rankName);
//
//            rankingTextView.setText(listViewItem.getRanking());
//            tierImageView.setImageResource(listViewItem.getImageTier());
//            summerNameTextView.setText(listViewItem.getSummerName());
//            tierTextView.setText(listViewItem.getTier());
//            rankTextView.setText(listViewItem.getRankName());
//            leaguePointsTextView.setText(listViewItem.getLeaguePoint());

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    // 아이템 데이터 추가를 위한 함수.

    public void addItem(String ranking, int imageTier, String summerName, String tier, String rank, String leaguePoint) {
        ListViewItem item = new ListViewItem();
        item.setRanking(ranking);
        item.setSummerName(summerName);
        item.setTier(tier);
        item.setRankName(rank);
        item.setLeaguePoint(leaguePoint);
        listViewItemList.add(item);
    }

    public void deleteItem(int position) {
        listViewItemList.remove(position);
    }
}
