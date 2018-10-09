package com.kurotkin.heterogenousrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class ViewHolder2 extends RecyclerView.ViewHolder {
    private ImageView ivExample;

    public ViewHolder2(View v) {
        super(v);
        ivExample = v.findViewById(R.id.ivExample);
    }

    public ImageView getImageView() {
        return ivExample;
    }

    public void setImageView(ImageView ivExample) {
        this.ivExample = ivExample;
    }
}
