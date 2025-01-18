package com.qa.payloads;

import java.util.List;

public class AssignBookPayload {

	public String userId;
	public List<CollectionOfIsbn> collectionOfIsbns;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public AssignBookPayload() {

	}

	public AssignBookPayload(String userId, List<CollectionOfIsbn> collectionOfIsbns) {
		super();
		this.userId = userId;
		this.collectionOfIsbns = collectionOfIsbns;
	}

}
