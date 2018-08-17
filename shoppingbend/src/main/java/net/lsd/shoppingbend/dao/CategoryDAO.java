package net.lsd.shoppingbend.dao;

import java.util.List;

import net.lsd.shoppingbend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get (int id);

}
