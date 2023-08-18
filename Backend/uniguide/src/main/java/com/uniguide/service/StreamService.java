package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.Stream;

public interface StreamService {

	List<Stream> getAll();

	boolean addStream(Stream s);

	boolean update(Stream s);

	boolean delete(int id);

}
