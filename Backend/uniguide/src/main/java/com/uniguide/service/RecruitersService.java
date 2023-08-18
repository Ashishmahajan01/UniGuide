package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.Recruiters;

public interface RecruitersService {

	void driveEntry(Recruiters r);

	List<Recruiters> getDrives();

	boolean update(Recruiters b);

	boolean delete(int id);

}
