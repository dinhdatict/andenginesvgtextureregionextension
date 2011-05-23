package com.larvalabs.svgandroid;

import org.xml.sax.Attributes;

/**
 * @author Larva Labs, LLC
 * @author Nicolas Gramlich
 * @since 16:49:55 - 21.05.2011
 */
public class Properties {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final StyleSet mStyles;
	private final Attributes mAttributes;

	// ===========================================================
	// Constructors
	// ===========================================================

	public Properties(final Attributes pAttributes) {
		this.mAttributes = pAttributes;
		final String styleAttr = SAXHelper.getStringAttribute(pAttributes, "style");
		if (styleAttr != null) {
			this.mStyles = new StyleSet(styleAttr);
		} else {
			this.mStyles = null;
		}
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public String getStringProperty(final String pPropertyName) {
		String s = null;
		if (this.mStyles != null) {
			s = this.mStyles.getStyle(pPropertyName);
		}
		if (s == null) {
			s = SAXHelper.getStringAttribute(this.mAttributes, pPropertyName);
		}
		return s;
	}

	public Float getFloatProperty(final String pPropertyName, final float pDefaultValue) {
		final Float f = this.getFloatProperty(pPropertyName);
		if (f == null) {
			return pDefaultValue;
		} else {
			return f;
		}
	}

	public Float getFloatProperty(final String pPropertyName) {
		final String f = this.getStringProperty(pPropertyName);
		if (f == null) {
			return null;
		} else {
			try {
				if (f.endsWith("px")) {
					return Float.parseFloat(f.substring(0, f.length() - 2));
				} else {
					return Float.parseFloat(f);
				}
			} catch (final NumberFormatException nfe) {
				return null;
			}
		}
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}