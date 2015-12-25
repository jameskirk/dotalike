package com.fourthskyinteractive.dx4j.d2d1.resources.geometry;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d2d1.D2D1.D2D1_ARC_SIZE;
import com.fourthskyinteractive.dx4j.d2d1.D2D1.D2D1_SWEEP_DIRECTION;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d2d1") 
public class D2D1_ARC_SEGMENT extends StructObject {
	public D2D1_ARC_SEGMENT() {
		super();
	}
	public D2D1_ARC_SEGMENT(Pointer<? extends D2D1_ARC_SEGMENT> pointer) {
		super(pointer);
	}
	/// C type : D2D1_POINT_2F
	@Field(0) 
	public D2D1_POINT_2F point() {
		return this.io.getNativeObjectField(this, 0);
	}
	/// C type : D2D1_SIZE_F
	@Field(1) 
	public D2D1_SIZE_F size() {
		return this.io.getNativeObjectField(this, 1);
	}
	@Field(2) 
	public float rotationAngle() {
		return this.io.getFloatField(this, 2);
	}
	@Field(2) 
	public D2D1_ARC_SEGMENT rotationAngle(float rotationAngle) {
		this.io.setFloatField(this, 2, rotationAngle);
		return this;
	}
	/// C type : D2D1_SWEEP_DIRECTION
	@Field(3) 
	public ValuedEnum<D2D1_SWEEP_DIRECTION > sweepDirection() {
		return this.io.getEnumField(this, 3);
	}
	/// C type : D2D1_SWEEP_DIRECTION
	@Field(3) 
	public D2D1_ARC_SEGMENT sweepDirection(ValuedEnum<D2D1_SWEEP_DIRECTION > sweepDirection) {
		this.io.setEnumField(this, 3, sweepDirection);
		return this;
	}
	/// C type : D2D1_ARC_SIZE
	@Field(4) 
	public ValuedEnum<D2D1_ARC_SIZE > arcSize() {
		return this.io.getEnumField(this, 4);
	}
	/// C type : D2D1_ARC_SIZE
	@Field(4) 
	public D2D1_ARC_SEGMENT arcSize(ValuedEnum<D2D1_ARC_SIZE > arcSize) {
		this.io.setEnumField(this, 4, arcSize);
		return this;
	}
}