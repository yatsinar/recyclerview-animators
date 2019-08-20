package jp.wasabeef.recyclerview.animators.holder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public interface AnimateChangeViewHolder {

    boolean canAnimateChange(@NonNull List<Object> payloads);

    void endChangeAnimation(final RecyclerView.ViewHolder holder);

}
