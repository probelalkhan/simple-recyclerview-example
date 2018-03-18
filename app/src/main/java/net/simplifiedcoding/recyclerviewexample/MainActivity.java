package net.simplifiedcoding.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductsAdapter adapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList = new ArrayList<>();

        productList.add(new Product(
                R.drawable.dellinspiron,
                "Dell Inspiron",
                "15.6Inch, Full HD",
                "4.5",
                40000
        ));

        productList.add(new Product(
                R.drawable.macbook,
                "Apple Macbook Air",
                "13.3Inch, HD",
                "4.7",
                50000
        ));

        productList.add(new Product(
                R.drawable.surface,
                "Microsoft Surface",
                "13.3Inch, HD",
                "4.7",
                50000
        ));

        adapter = new ProductsAdapter(this, productList);

        recyclerView.setAdapter(adapter);

    }
}
