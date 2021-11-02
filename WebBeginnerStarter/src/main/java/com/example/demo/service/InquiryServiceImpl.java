package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InquiryDao;
import com.example.demo.entity.Inquiry;

/*
 * Add an annotation here
 */
@Service
public class InquiryServiceImpl implements InquiryService {

	private final InquiryDao dao;
	
	@Autowired
	public InquiryServiceImpl(InquiryDao dao) {
		this.dao = dao;
	}

	@Override
	public void save(Inquiry inquiry) {
		dao.insertInquiry(inquiry);
	}

//  This method is used in the latter chapter
//	@Override
//	public void update(Inquiry inquiry) {
//
//		//return dao.updateInquiry(inquiry);
//		if(dao.updateInquiry(inquiry) == 0) {
//			throw new InquiryNotFoundException("can't find the same ID");
//		}
//	}

	@Override
	public List<Inquiry> getAll() {

		return dao.getAll();
	}
}
