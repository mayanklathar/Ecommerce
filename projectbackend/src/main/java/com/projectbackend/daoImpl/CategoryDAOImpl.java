package com.projectbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.projectbackend.dao.CategoryDAO;
import com.projectbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories= new  ArrayList<Category>();
	
	static{
Category category = null;
		//adding first category
		category.setId(1);
		category.setName("televison");
		category.setDescription("description of tv");
		category.setImageURL("CAT_1.png");
		
		category.setId(2);
		category.setName("phone ");
		category.setDescription("description of phone");
		category.setImageURL("CAT_2.png");
	}
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	
}
