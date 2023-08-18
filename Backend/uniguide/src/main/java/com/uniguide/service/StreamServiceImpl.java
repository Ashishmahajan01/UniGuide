package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.College;
import com.uniguide.beans.Stream;
import com.uniguide.dao.StreamDao;

@Service
public class StreamServiceImpl implements StreamService {
	@Autowired
	private StreamDao streamDao;

	@Override
	public List<Stream> getAll() {
		List<Stream> ulist = streamDao.findAll();
		if (ulist.isEmpty()) {
			return null;
		}
		return ulist;
	}

	@Override
	public boolean addStream(Stream s) {
		Stream strm = streamDao.save(s);
		if (strm != null)
			return true;
		return false;
	}

	@Override
	public boolean update(Stream s) {
		Stream strm = streamDao.getById(s.getStrmId());
		if (strm != null) {
			strm.setStrmId(s.getStrmId());
			strm.setStrmName(s.getStrmName());
			strm.setStrmScope(s.getStrmScope());
			streamDao.save(strm);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<Stream> strm = streamDao.findById(id);

		if (strm.isPresent()) {
			Stream strmv = strm.get();
			streamDao.delete(strmv);
			return true;
		}
		return false;
	}
	

}
