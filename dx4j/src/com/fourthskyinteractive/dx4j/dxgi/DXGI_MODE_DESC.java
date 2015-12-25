package com.fourthskyinteractive.dx4j.dxgi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_FORMAT;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_MODE_SCALING;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_MODE_SCANLINE_ORDER;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("dxgi") 
public class DXGI_MODE_DESC extends StructObject {
	public DXGI_MODE_DESC() {
		super();
	}
	public DXGI_MODE_DESC(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int Width() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public DXGI_MODE_DESC Width(int Width) {
		this.io.setIntField(this, 0, Width);
		return this;
	}
	@Field(1) 
	public int Height() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public DXGI_MODE_DESC Height(int Height) {
		this.io.setIntField(this, 1, Height);
		return this;
	}
	/// C type : DXGI_RATIONAL
	@Field(2) 
	public DXGI_RATIONAL RefreshRate() {
		return this.io.getNativeObjectField(this, 2);
	}
	/// C type : DXGI_FORMAT
	@Field(3) 
	public ValuedEnum<DXGI_FORMAT> Format() {
		return this.io.getEnumField(this, 3);
	}
	/// C type : DXGI_FORMAT
	@Field(3) 
	public DXGI_MODE_DESC Format(ValuedEnum<DXGI_FORMAT > Format) {
		this.io.setEnumField(this, 3, Format);
		return this;
	}
	/// C type : DXGI_MODE_SCANLINE_ORDER
	@Field(4) 
	public ValuedEnum<DXGI_MODE_SCANLINE_ORDER > ScanlineOrdering() {
		return this.io.getEnumField(this, 4);
	}
	/// C type : DXGI_MODE_SCANLINE_ORDER
	@Field(4) 
	public DXGI_MODE_DESC ScanlineOrdering(ValuedEnum<DXGI_MODE_SCANLINE_ORDER > ScanlineOrdering) {
		this.io.setEnumField(this, 4, ScanlineOrdering);
		return this;
	}
	/// C type : DXGI_MODE_SCALING
	@Field(5) 
	public ValuedEnum<DXGI_MODE_SCALING > Scaling() {
		return this.io.getEnumField(this, 5);
	}
	/// C type : DXGI_MODE_SCALING
	@Field(5) 
	public DXGI_MODE_DESC Scaling(ValuedEnum<DXGI_MODE_SCALING > Scaling) {
		this.io.setEnumField(this, 5, Scaling);
		return this;
	}
}