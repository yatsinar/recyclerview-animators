package jp.wasabeef.recyclerview.animators.holder;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public interface AnimateChangeViewHolder {

    boolean canAnimateChange(@NonNull List<Object> payloads);

    void endChangeAnimation(final RecyclerView.ViewHolder holder);

}
