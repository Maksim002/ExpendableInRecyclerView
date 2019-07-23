package mainactivity.musicplayer.example.com.expendelrecyclerview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {
    private TextView textView;

    public ProductViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textViewProduct);
    }
    public void bind(Product product){
        textView.setText(product.name);
    }
}
