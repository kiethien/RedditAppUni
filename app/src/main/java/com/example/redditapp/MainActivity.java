package com.example.redditapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.redditapp.Acttivity.CategoryDomain;
import com.example.redditapp.Acttivity.RecommendDomain;
import com.example.redditapp.Adapter.CategoryAdapter;
import com.example.redditapp.Adapter.RecommendAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView    recyclerViewCategory,recyclerViewRecommendList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

        recyclerViewCategory();
        recyclerViewRecommendList();
    }

    private void recyclerViewRecommendList() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewRecommendList=findViewById(R.id.view2);
        recyclerViewRecommendList.setLayoutManager(linearLayoutManager);
        ArrayList<RecommendDomain> recommendDomains = new ArrayList<>();
        recommendDomains.add(new RecommendDomain("Cheese Burger","fast_1",1549.7,510));
        recommendDomains.add(new RecommendDomain("Cheese Burger","fast_1",1549.7,510));
        recommendDomains.add(new RecommendDomain("Cheese Burger","fast_1",1549.7,510));

        adapter2=new RecommendAdapter(recommendDomains);
        recyclerViewRecommendList.setAdapter(adapter2);
    }


    private void recyclerViewCategory(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategory=findViewById(R.id.view1);
        recyclerViewCategory.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain>   categoryList= new ArrayList<>();
        categoryList.add(new CategoryDomain("r/Programming","programming_icon"));
        categoryList.add(new CategoryDomain("r/Earth porn","earth_porn"));
        categoryList.add(new CategoryDomain("r/Fate","fate_reddit"));
        categoryList.add(new CategoryDomain("r/Hot dog","cat_4"));

        adapter=new CategoryAdapter(categoryList);
        recyclerViewCategory.setAdapter(adapter);
    }
}