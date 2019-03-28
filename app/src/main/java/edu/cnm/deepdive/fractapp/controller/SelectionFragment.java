package edu.cnm.deepdive.fractapp.controller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.cnm.deepdive.fractapp.R;
import edu.cnm.deepdive.fractapp.model.entity.Fractal;
import edu.cnm.deepdive.fractapp.pojo.FractalWithAccesses;
import edu.cnm.deepdive.fractapp.view.SelectionAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class SelectionFragment extends Fragment implements View.OnClickListener {

  private List<FractalWithAccesses> selection;
  private SelectionAdapter adapter;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
  }

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_selection, container, false);
    RecyclerView selectionView = view.findViewById(R.id.selection_view);
    selection = new ArrayList<>();
    adapter = new SelectionAdapter(this, selection);
    selectionView.setAdapter(adapter);
    return view;
  }
  @Override
  public void onHiddenChanged(boolean hidden) {
    super.onHiddenChanged(hidden);
    refresh();
  }

  private void refresh() {

  }

  public void createContextMenu(ContextMenu menu, int posititon, Fractal fractal) {
    getActivity().getMenuInflater().inflate(R.menu.item_context, menu);
  }
}




