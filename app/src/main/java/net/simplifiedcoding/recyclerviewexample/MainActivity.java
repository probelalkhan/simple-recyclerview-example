package net.simplifiedcoding.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

        DatabaseReference dbProducts = FirebaseDatabase.getInstance().getReference("products");

        dbProducts.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){

                    for(DataSnapshot productSnapshot : dataSnapshot.getChildren()){
                        Product p = productSnapshot.getValue(Product.class);
                        productList.add(p);
                    }

                    adapter = new ProductsAdapter(MainActivity.this, productList);
                    recyclerView.setAdapter(adapter);

                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }
}
