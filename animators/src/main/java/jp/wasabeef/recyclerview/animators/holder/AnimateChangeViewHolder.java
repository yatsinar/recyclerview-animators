package jp.wasabeef.recyclerview.animators.holder;
import java.util.List;

public interface AnimateChangeViewHolder {

    boolean canReuseUpdatedViewHolder(List<Object> payloads);

}
