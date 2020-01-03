package io.material.catalog.themeswitcher;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeOverlayUtilsTest {

  @Test
  public void setThemeOverlay() {
    ThemeOverlayUtils.setThemeOverlay(1, 1);
    ThemeOverlayUtils.getThemeOverlay(1);
  }
}
