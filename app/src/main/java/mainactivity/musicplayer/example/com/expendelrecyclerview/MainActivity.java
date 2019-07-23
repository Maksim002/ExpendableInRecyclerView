package mainactivity.musicplayer.example.com.expendelrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> gogleProduct = new ArrayList<>();
        gogleProduct.add(new Product("ftwegew"));
        gogleProduct.add(new Product("ftwegew"));
        gogleProduct.add(new Product("ftwegew"));
        gogleProduct.add(new Product("ftwegew"));
        gogleProduct.add(new Product("ftwegew"));
        gogleProduct.add(new Product("ftwegew"));
        gogleProduct.add(new Product("ftwegew"));

        Company gogle = new Company("Gogle",gogleProduct);
        companies.add(gogle);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("sdgfsr"));
        microsoftProduct.add(new Product("sdgfsr"));
        microsoftProduct.add(new Product("sdgfsr"));
        microsoftProduct.add(new Product("sdgfsr"));
        microsoftProduct.add(new Product("sdgfsr"));

        Company microsoft = new Company("Microsoft", microsoftProduct);
        companies.add(microsoft);

        ProductAdapter adapter = new ProductAdapter(companies);
        recyclerView.setAdapter(adapter);
    }
}
