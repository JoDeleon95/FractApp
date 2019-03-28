package edu.cnm.deepdive.fractapp.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import edu.cnm.deepdive.fractapp.R;
import edu.cnm.deepdive.fractapp.controller.SelectionFragment;
import edu.cnm.deepdive.fractapp.model.entity.Fractal;
import edu.cnm.deepdive.fractapp.pojo.FractalWithAccesses;
import java.text.DateFormat;
import java.util.List;

  /**
   * Supplies {@link View} instances&mdash;each presenting an {@link Fractal} instance, to a {@link
   * RecyclerView}.
   */
  public class SelectionAdapter extends RecyclerView.Adapter<SelectionAdapter.Holder> {

    Context context;
    private SelectionFragment selectionFragment;
    private List<FractalWithAccesses> items;

    /**
     * Initializes {@link SelectionAdapter} instance with the specified {@link SelectionFragment} host and
     * {@link List}&lt;{@link edu.cnm.deepdive.fractapp.model.entity.Fractal}&gt; data source.
     *
     * @param selectionFragment host fragment.
     * @param items source of {@link edu.cnm.deepdive.fractapp.controller.SelectionFragment} instances.
     */
    public SelectionAdapter(SelectionFragment selectionFragment, List<FractalWithAccesses> items) {
      context = selectionFragment.getContext();
      this.selectionFragment = selectionFragment;
      this.items = items;

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View view = LayoutInflater.from(context).inflate(R.layout.selection_item, viewGroup, false);
      return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
      holder.bind(items.get(i));
    }

    @Override
    public int getItemCount() {
      return items.size();
    }

    /**
     * Maintains a connection between a {@link View} and an {@link Fractal} instance. The {@link
     * SelectionAdapter} manages the creation and re-use of {@link Holder} instances as rows are
     * scrolled into and out of view.
     * <p>Each view item is clickable (the {@link View.OnClickListener} attached to each is the host
     * {@link SelectionFragment}), supporting display of an Fractal selected from the list view.</p>
     */
    public class Holder extends RecyclerView.ViewHolder
        implements View.OnCreateContextMenuListener {

      private Fractal fractal;
      private View view;

      private Holder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        view.setOnClickListener(selectionFragment);
        view.setOnCreateContextMenuListener(this);
      }

      private void bind(FractalWithAccesses fractalWithAccesses) {
        this.fractal = fractalWithAccesses.getFractal();
        view.setTag(fractal);
            fractalWithAccesses.getAccesses().size();
      }

      @Override
      public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        selectionFragment.createContextMenu(menu, getAdapterPosition(), fractal);
      }

    }

  }

