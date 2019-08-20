package jp.wasabeef.recyclerview.animators.holder;

import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.recyclerview.widget.RecyclerView;

public interface AnimateAddViewHolder {

    void preAnimateAddImpl(final RecyclerView.ViewHolder holder);

    void animateAddImpl(final RecyclerView.ViewHolder holder, ViewPropertyAnimatorListener listener);

    void endAddAnimation(final RecyclerView.ViewHolder holder);

}
