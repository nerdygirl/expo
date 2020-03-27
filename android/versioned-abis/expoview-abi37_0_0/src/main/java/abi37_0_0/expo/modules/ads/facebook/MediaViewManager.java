package abi37_0_0.expo.modules.ads.facebook;

import android.content.Context;

import com.facebook.ads.MediaView;

import abi37_0_0.org.unimodules.core.ViewManager;

public class MediaViewManager extends ViewManager<MediaView> {
  @Override
  public String getName() {
    return "MediaView";
  }

  @Override
  public MediaView createViewInstance(Context context) {
    return new MediaView(context);
  }

  @Override
  public ViewManagerType getViewManagerType() {
    return ViewManagerType.SIMPLE;
  }
}
