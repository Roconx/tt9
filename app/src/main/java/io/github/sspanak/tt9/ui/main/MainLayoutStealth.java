package io.github.sspanak.tt9.ui.main;

import io.github.sspanak.tt9.R;
import io.github.sspanak.tt9.ime.TraditionalT9;

class MainLayoutStealth extends BaseMainLayout {
	private boolean isCommandPaletteShown = false;

	MainLayoutStealth(TraditionalT9 tt9) { super(tt9, R.layout.main_stealth); }

	@Override void showCommandPalette() { isCommandPaletteShown = true; }
	@Override void hideCommandPalette() { isCommandPaletteShown = false; }
	@Override boolean isCommandPaletteShown() { return isCommandPaletteShown; }
	@Override void render() {}
}
