package edu.cnm.deepdive.fractapp.controller;

import android.support.v4.app.Fragment;

public class ImageFragment extends Fragment {

  private SelectionFragment selectionFragment;


  /**
   * Sets the {@link SelectionFragment} to be refreshed on successful retrieval of an {@link
   * edu.cnm.deepdive.fractapp.model.entity.Fractal}
   *
   * @param selectionFragment host {@link SelectionFragment} for list of {@link
   * edu.cnm.deepdive.fractapp.model.entity.Fractal} instances in local
   * database.
   */
  public void setSelectionFragment(SelectionFragment selectionFragment) {
    this.selectionFragment = selectionFragment;
  }



}
