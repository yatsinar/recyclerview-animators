package jp.wasabeef.recyclerview.animators.holder;

import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.recyclerview.widget.RecyclerView;

public interface AnimateRemoveViewHolder {

    void preAnimateRemoveImpl(final RecyclerView.ViewHolder holder);

    void animateRemoveImpl(final RecyclerView.ViewHolder holder, ViewPropertyAnimatorListener listener);

    void endRemoveAnimation(final RecyclerView.ViewHolder holder);

}
