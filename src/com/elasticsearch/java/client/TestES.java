package com.elasticsearch.java.client;

import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.FilteredQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

public class TestES extends GenericSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	TestES es= new TestES();
	FilteredQueryBuilder builder=QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(), FilterBuilders.matchAllFilter());
	
	System.out.println(es.fetchDocumentsES(builder,0,0,null,"appviewx","ro"));

	}

}
