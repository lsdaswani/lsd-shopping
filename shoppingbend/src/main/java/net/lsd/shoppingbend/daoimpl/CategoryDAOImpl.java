package net.lsd.shoppingbend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.lsd.shoppingbend.dao.CategoryDAO;
import net.lsd.shoppingbend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();
		// adding first Category
		category.setId(1);
		category.setName("Shoes");
		category.setDescription("This is the description of shoes!");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// adding second Category
		category = new Category();
		category.setId(2);
		category.setName("Watches");
		category.setDescription("This is the description of watches!");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// adding third Category
		category = new Category();
		category.setId(3);
		category.setName("Sunglasses");
		category.setDescription("This is the description of Sunglasses!");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category : categories){
			if(category.getId() == id)
				return category;
		}
		
		return null;
	}

}
