package com.googlecode.androidannotations.processing;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JVar;

public class ActivityHolder {

	public JDefinedClass activity;
	public JMethod beforeSetContentView;
	public JVar beforeSetContentViewSavedInstanceStateParam;
	public JMethod afterSetContentView;
	public JBlock extrasNotNullBlock;
	public JVar extras;
	public JClass bundleClass;
    public JVar resources;
	

}