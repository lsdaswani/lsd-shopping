package net.lsd.shoppingbend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.lsd.shoppingbend.dao.CategoryDAO;
import net.lsd.shoppingbend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.lsd.shoppingbend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory(){
	 * 
	 * category = new Category(); category.setName("Wallet");
	 * category.setDescription("This is the description for wallets!");
	 * category.setImageURL("CAT_105.png");
	 * 
	 * assertEquals("Successfully added a Category inside the table!",true,
	 * categoryDAO.add(category));
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * assertEquals("Successfully fetched a single Category from the table!",
	 * "Wallet", category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * category.setName("WATCHES");
	 * 
	 * assertEquals("Successfully updated a single Category in the table!",
	 * true, categoryDAO.update(category)); }
	 */

	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * assertEquals("Successfully deleted a single Category in the table!",
	 * true, categoryDAO.delete(category)); }
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched a list of categories from the table!"
	 * ,1, categoryDAO.list().size()); }
	 */

	@Test
	public void testCrudCategory() {

		// add operation
		category = new Category();
		category.setName("Wallet");
		category.setDescription("This is the description for wallets!");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully added a Category inside the table!", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Watches");
		category.setDescription("This is the description for watches!");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added a Category inside the table!", true, categoryDAO.add(category));

		// fetching and updating a category
		category = categoryDAO.get(2);

		category.setName("WATCHES");

		assertEquals("Successfully updated a single Category in the table!", true, categoryDAO.update(category));

		// delete the category
		assertEquals("Successfully deleted a single Category in the table!", true, categoryDAO.delete(category));

		// list the category
		assertEquals("Successfully fetched a list of categories from the table!", 1, categoryDAO.list().size());

	}

}
