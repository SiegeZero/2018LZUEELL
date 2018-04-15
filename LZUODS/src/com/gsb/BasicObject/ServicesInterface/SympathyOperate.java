package com.gsb.BasicObject.ServicesInterface;

import java.util.List;

import com.gsb.BasicObject.Beans.SympathyWithName;
import com.gsb.BasicObject.MBGPOJO.Sympathy;

public interface SympathyOperate {
	boolean addSympathy( Sympathy newSym);
	boolean delSympathy( Sympathy targetSym);
	boolean delAllSympathy( int atvNo);
	boolean changeSympathy( Sympathy changedSym);
	List<SympathyWithName> getAllSympathyWithAtvId(int atv_no);
}
